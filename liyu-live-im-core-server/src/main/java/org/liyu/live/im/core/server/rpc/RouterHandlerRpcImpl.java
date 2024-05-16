package org.liyu.live.im.core.server.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.im.core.server.interfaces.rpc.IRouterHandlerRpc;
import org.liyu.live.im.core.server.service.IRouterHandlerService;
import org.liyu.live.im.dto.ImMsgBody;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 13:36
 * @Description
 */
@DubboService
public class RouterHandlerRpcImpl implements IRouterHandlerRpc {

    @Resource
    private IRouterHandlerService routerHandlerService;

    @Override
    public void sendMsg(ImMsgBody imMsgBody) {
        routerHandlerService.onReceive(imMsgBody);
    }

    @Override
    public void batchSendMsg(List<ImMsgBody> imMsgBodyList) {
        imMsgBodyList.forEach(imMsgBody -> {
            routerHandlerService.onReceive(imMsgBody);
        });
    }
}
