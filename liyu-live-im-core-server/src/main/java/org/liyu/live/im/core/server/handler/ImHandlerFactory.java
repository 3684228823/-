package org.liyu.live.im.core.server.handler;

import io.netty.channel.ChannelHandlerContext;
import org.liyu.live.im.core.server.common.ImMsg;

/**
 * @Author 傅泽杭
 * @Data 2024-03-26 21:33
 * @Description
 */
public interface ImHandlerFactory {

    /**
     * 按照immsg的code去筛选
     *
     * @param channelHandlerContext
     * @param imMsg
     */
    void doMsgHandler(ChannelHandlerContext channelHandlerContext, ImMsg imMsg);
}
