package org.liyu.live.msg.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.msg.dto.MsgCheckDTO;
import org.liyu.live.msg.enums.MsgSendResultEnum;
import org.liyu.live.msg.interfaces.ISmsRpc;
import org.liyu.live.msg.provider.service.ISmsService;

/**
 * @Author 傅泽杭
 * @Data 2024-03-13 15:21
 * @Description
 */
@DubboService
public class SmsRpcImpl implements ISmsRpc {

    @Resource
    private ISmsService smsService;

    @Override
    public MsgSendResultEnum sendLoginCode(String phone) {
        return smsService.sendLoginCode(phone);
    }

    @Override
    public MsgCheckDTO checkLoginCode(String phone, Integer code) {
        return smsService.checkLoginCode(phone,code);
    }

}
