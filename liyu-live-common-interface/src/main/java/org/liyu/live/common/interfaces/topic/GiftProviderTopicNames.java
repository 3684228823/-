package org.liyu.live.common.interfaces.topic;

/**
 * @Author 傅泽杭
 * @Data 2024-04-16 19:55
 * @Description
 */
public class GiftProviderTopicNames {

    /**
     * 移除礼物信息的缓存
     */
    public static final String REMOVE_GIFT_CACHE = "remove_gift_cache";

    /**
     * 发送礼物消息
     */
    public static final String SEND_GIFT = "send_gift";

    /**
     * 发送红包
     */
    public static final String RECEIVE_RED_PACKET = "receive_red_packet";

    /**
     * 延迟回调 处理库存回滚问题
     */
    public static final String ROLL_BACK_STOCK = "roll_back_stock";
}

