package org.liyu.live.account.interfaces;

/**
 * @Author 傅泽杭
 * @Data 2024-03-20 21:42
 * @Description
 */
public interface IAccountTokenRPC {


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
