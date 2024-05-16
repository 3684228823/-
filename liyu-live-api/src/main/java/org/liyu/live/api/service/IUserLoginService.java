package org.liyu.live.api.service;

import jakarta.servlet.http.HttpServletResponse;
import org.liyu.live.common.interfaces.vo.WebResponseVO;

/**
 * @Author 傅泽杭
 * @Data 2024-03-17 20:44
 * @Description
 */
public interface IUserLoginService {

    /**
     * 发送登录验证码
     *
     * @param phone
     * @return
     */
    WebResponseVO sendLoginCode(String phone);

    /**
     * 手机号+验证码登录
     *
     * @param phone
     * @param code
     * @return
     */
    WebResponseVO login(String phone, Integer code, HttpServletResponse response);
}
