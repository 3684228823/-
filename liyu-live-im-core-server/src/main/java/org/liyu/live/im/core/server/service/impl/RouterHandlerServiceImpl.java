package org.liyu.live.im.core.server.service.impl;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import jakarta.annotation.Resource;
import org.liyu.live.im.constants.ImMsgCodeEnum;
import org.liyu.live.im.core.server.common.ChannelHandlerContextCache;
import org.liyu.live.im.core.server.common.ImMsg;
import org.liyu.live.im.core.server.service.IMsgAckCheckService;
import org.liyu.live.im.core.server.service.IRouterHandlerService;
import org.liyu.live.im.dto.ImMsgBody;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 13:37
 * @Description
 */
@Service
public class RouterHandlerServiceImpl implements IRouterHandlerService {

    @Resource
    private IMsgAckCheckService msgAckCheckService;

    @Override
    public void onReceive(ImMsgBody imMsgBody) {
        //需要进行消息通知的userid
        if(sendMsgToClient(imMsgBody)) {
            //当im服务器推送了消息给到客户端，然后我们需要记录下ack
            msgAckCheckService.recordMsgAck(imMsgBody, 1);
            msgAckCheckService.sendDelayMsg(imMsgBody);
        }
    }

    @Override
    public boolean sendMsgToClient(ImMsgBody imMsgBody) {
        Long userId = imMsgBody.getUserId();
        ChannelHandlerContext ctx = ChannelHandlerContextCache.get(userId);
        if (ctx != null) {
            String msgId = UUID.randomUUID().toString();
            imMsgBody.setMsgId(msgId);
            ImMsg respMsg = ImMsg.build(ImMsgCodeEnum.IM_BIZ_MSG.getCode(), JSON.toJSONString(imMsgBody));
            ctx.writeAndFlush(respMsg);
            return true;
        }
        return false;
    }
}
