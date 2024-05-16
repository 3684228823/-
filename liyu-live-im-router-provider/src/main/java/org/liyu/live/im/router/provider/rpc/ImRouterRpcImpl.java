package org.liyu.live.im.router.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.im.dto.ImMsgBody;
import org.liyu.live.im.router.interfaces.rpc.ImRouterRpc;
import org.liyu.live.im.router.provider.service.ImRouterService;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-31 16:45
 * @Description
 */
@DubboService
public class ImRouterRpcImpl implements ImRouterRpc {

    @Resource
    private ImRouterService routerService;

    @Override
    public boolean sendMsg(ImMsgBody imMsgBody) {
        return routerService.sendMsg(imMsgBody);
    }

    //假设我们有100个immsgbody，调用100次im-core-server  2ms,200ms
    @Override
    public void batchSendMsg(List<ImMsgBody> imMsgBodyList) {
        routerService.batchSendMsg(imMsgBodyList);
    }
}