package org.liyu.live.im.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.im.interfaces.ImOnlineRpc;
import org.liyu.live.im.provider.service.ImOnlineService;

/**
 * @Author 傅泽杭
 * @Data 2024-03-28 16:27
 * @Description
 */
@DubboService
public class ImOnlineRpcImpl implements ImOnlineRpc {

    @Resource
    private ImOnlineService imOnlineService;

    @Override
    public boolean isOnline(long userId, int appId) {
        return imOnlineService.isOnline(userId,appId);
    }
}
