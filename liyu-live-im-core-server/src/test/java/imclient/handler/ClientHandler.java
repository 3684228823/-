package imclient.handler;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.liyu.live.im.constants.ImMsgCodeEnum;
import org.liyu.live.im.core.server.common.ImMsg;
import org.liyu.live.im.dto.ImMsgBody;

/**
 * @Author 傅泽杭
 * @Data 2024-03-25 20:27
 * @Description
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ImMsg imMsg = (ImMsg) msg;
        if (imMsg.getCode() == ImMsgCodeEnum.IM_BIZ_MSG.getCode()) {
            ImMsgBody respBody = JSON.parseObject(new String(imMsg.getBody()), ImMsgBody.class);
            ImMsgBody ackBody = new ImMsgBody();
            ackBody.setMsgId(respBody.getMsgId());
            ackBody.setAppId(respBody.getAppId());
            ackBody.setUserId(respBody.getUserId());
            ImMsg ackMsg = ImMsg.build(ImMsgCodeEnum.IM_ACK_MSG.getCode(), JSON.toJSONString(ackBody));
            ctx.writeAndFlush(ackMsg);
        }
        System.out.println("【服务端响应数据】result is " + new String(imMsg.getBody()));
    }
}

