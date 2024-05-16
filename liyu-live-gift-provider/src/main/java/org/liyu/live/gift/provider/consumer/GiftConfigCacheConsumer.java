package org.liyu.live.gift.provider.consumer;

import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.idea.liyu.live.framework.redis.starter.key.GiftProviderCacheKeyBuilder;
import org.liyu.live.common.interfaces.topic.GiftProviderTopicNames;
import org.liyu.live.framework.mq.starter.properties.RocketMQConsumerProperties;
import org.liyu.live.gift.provider.service.bo.GiftCacheRemoveBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 傅泽杭
 * @Data 2024-04-16 19:50
 * @Description
 */
@Configuration
public class GiftConfigCacheConsumer implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(GiftConfigCacheConsumer.class);

    @Resource
    private RocketMQConsumerProperties rocketMQConsumerProperties;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Resource
    private GiftProviderCacheKeyBuilder cacheKeyBuilder;

    @Override
    public void afterPropertiesSet() throws Exception {
        DefaultMQPushConsumer mqPushConsumer = new DefaultMQPushConsumer();
        //老版本中会开启，新版本的mq不需要使用到
        mqPushConsumer.setVipChannelEnabled(false);
        mqPushConsumer.setNamesrvAddr(rocketMQConsumerProperties.getNameSrv());
        mqPushConsumer.setConsumerGroup(rocketMQConsumerProperties.getGroupName() + "_" + GiftConfigCacheConsumer.class.getSimpleName());
        //一次从broker中拉取10条消息到本地内存当中进行消费
        mqPushConsumer.setConsumeMessageBatchMaxSize(10);
        mqPushConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        //监听礼物缓存数据更新的行为
        mqPushConsumer.subscribe(GiftProviderTopicNames.REMOVE_GIFT_CACHE, "");
        mqPushConsumer.setMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            for (MessageExt msg : msgs) {
                GiftCacheRemoveBO giftCacheRemoveBO = JSON.parseObject(new String(msg.getBody()), GiftCacheRemoveBO.class);
                if(giftCacheRemoveBO.isRemoveListCache()) {
                    redisTemplate.delete(cacheKeyBuilder.buildGiftListCacheKey());
                }
                if(giftCacheRemoveBO.getGiftId()>0) {
                    redisTemplate.delete(cacheKeyBuilder.buildGiftConfigCacheKey(giftCacheRemoveBO.getGiftId()));
                }
                LOGGER.info("[GiftConfigCacheConsumer] remove gift cache");
            }
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        mqPushConsumer.start();
        LOGGER.info("mq消费者启动成功,namesrv is {}", rocketMQConsumerProperties.getNameSrv());
    }
}