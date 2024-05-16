package org.liyu.live.msg.interfaces;

import org.liyu.live.msg.dto.MsgCheckDTO;
import org.liyu.live.msg.enums.MsgSendResultEnum;

/**
 * @Author 傅泽杭
 * @Data 2024-03-13 15:20
 * @Description
 */
public interface ISmsRpc {

    /**
     * 发送短信登录验证码接口
     *
     * @param phone
     * @return
     */
    MsgSendResultEnum sendLoginCode(String phone);

    /**
     * 校验登录验证码
     *
     * @param phone
     * @param code
     * @return
     */
    MsgCheckDTO checkLoginCode(String phone, Integer code);

}
