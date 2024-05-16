package org.liyu.live.user.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.user.dto.UserLoginDTO;
import org.liyu.live.user.dto.UserPhoneDTO;
import org.liyu.live.user.interfaces.IUserPhoneRPC;
import org.liyu.live.user.provider.service.IUserPhoneService;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-03-15 16:32
 * @Description
 */
@DubboService
public class UserPhoneRPCImpl implements IUserPhoneRPC {

    @Resource
    private IUserPhoneService userPhoneService;

    @Override
    public UserLoginDTO login(String phone) {
        return userPhoneService.login(phone);
    }

    @Override
    public UserPhoneDTO queryByPhone(String phone) {
        return userPhoneService.queryByPhone(phone);
    }

    @Override
    public List<UserPhoneDTO> queryByUserId(Long userId) {
        return userPhoneService.queryByUserId(userId);
    }
}
