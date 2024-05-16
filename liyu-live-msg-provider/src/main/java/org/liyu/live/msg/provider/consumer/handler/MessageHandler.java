package org.liyu.live.msg.provider.consumer.handler;

import org.liyu.live.im.dto.ImMsgBody;

/**
 * @Author 傅泽杭
 * @Data 2024-04-01 20:41
 * @Description
 */
public interface MessageHandler {

    /**
     * 处理im服务投递过来的消息内容
     *
     * @param imMsgBody
     */
    void onMsgReceive(ImMsgBody imMsgBody);
}