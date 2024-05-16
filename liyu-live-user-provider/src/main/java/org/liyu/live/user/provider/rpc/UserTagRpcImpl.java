package org.liyu.live.user.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.user.constants.UserTagsEnum;
import org.liyu.live.user.interfaces.IUserTagRpc;
import org.liyu.live.user.provider.service.IUserTagService;

/**
 * @Author 傅泽杭
 * @Data 2024-03-03 16:54
 * @Description
 */
@DubboService
public class UserTagRpcImpl implements IUserTagRpc {

    @Resource
    private IUserTagService userTagService;

    @Override
    public boolean setTag(Long userId, UserTagsEnum userTagsEnum) {
        return userTagService.setTag(userId, userTagsEnum);
    }

    @Override
    public boolean cancelTag(Long userId, UserTagsEnum userTagsEnum) {
        return userTagService.cancelTag(userId, userTagsEnum);
    }

    @Override
    public boolean containTag(Long userId, UserTagsEnum userTagsEnum) {
        return userTagService.containTag(userId, userTagsEnum);
    }
}
