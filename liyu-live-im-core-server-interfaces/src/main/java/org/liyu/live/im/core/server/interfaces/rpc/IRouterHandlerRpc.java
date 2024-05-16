package org.liyu.live.im.core.server.interfaces.rpc;

import org.liyu.live.im.dto.ImMsgBody;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 13:36
 * @Description
 */
public interface IRouterHandlerRpc {

    /**
     * 按照用户id进行消息的发送
     *
     * @param imMsgBody
     */
    void sendMsg(ImMsgBody imMsgBody);

    /**
     * 支持批量发送消息
     *
     * @param imMsgBodyList
     */
    void batchSendMsg(List<ImMsgBody> imMsgBodyList);
}

