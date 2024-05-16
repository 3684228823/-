package org.liyu.live.account.provider.service;

/**
 * @Author 傅泽杭
 * @Data 2024-03-20 21:50
 * @Description
 */
public interface IAccountTokenService {

    /**
     * 创建一个登录token
     *
     * @param userId
     * @return
     */
    String createAndSaveLoginToken(Long userId);

    /**
     * 校验用户token
     *
     * @param tokenKey
     * @return
     */
    Long getUserIdByToken(String tokenKey);
}