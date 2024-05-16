package org.liyu.live.im.router.interfaces.rpc;

import org.liyu.live.im.dto.ImMsgBody;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 16:30
 * @Description
 */
public interface ImRouterRpc {


    /**
     * 发送消息
     *
     * @param imMsgBody
     * @return
     */
    boolean sendMsg(ImMsgBody imMsgBody);


    /**
     * 批量发送消息，在直播间内
     *
     * @param imMsgBody
     */
    void batchSendMsg(List<ImMsgBody> imMsgBody);
}