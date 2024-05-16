package org.liyu.live.im.core.server.handler;

import io.netty.channel.ChannelHandlerContext;
import org.liyu.live.im.core.server.common.ImMsg;

/**
 * @Author 傅泽杭
 * @Data 2024-03-26 21:27
 * @Description
 */
public interface SimplyHandler {

    /**
     * 消息处理函数
     *
     * @param ctx
     * @param imMsg
     */
    void handler(ChannelHandlerContext ctx, ImMsg imMsg);
}