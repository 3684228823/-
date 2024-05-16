package org.liyu.live.im.router.provider.service;

import org.liyu.live.im.dto.ImMsgBody;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 16:45
 * @Description
 */
public interface ImRouterService {


    /**
     * 发送消息
     *
     * @param imMsgBody
     * @return
     */
    boolean sendMsg(ImMsgBody imMsgBody);

    /**
     * 批量发送消息，群聊场景
     *
     * @param imMsgBody
     */
    void batchSendMsg(List<ImMsgBody> imMsgBody);

}
