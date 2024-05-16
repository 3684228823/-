package org.liyu.live.im.core.server.service;

import org.liyu.live.im.dto.ImMsgBody;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 13:37
 * @Description
 */
public interface IRouterHandlerService {

    /**
     * 当收到业务服务的请求，进行处理
     *
     * @param imMsgBody
     */
    void onReceive(ImMsgBody imMsgBody);


    /**
     * 发送消息给客户端
     *
     * @param imMsgBody
     */
    boolean sendMsgToClient(ImMsgBody imMsgBody);
}
