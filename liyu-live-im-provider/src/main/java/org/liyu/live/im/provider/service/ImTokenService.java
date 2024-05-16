package org.liyu.live.im.provider.service;

/**
 * @Author 傅泽杭
 * @Data 2024-03-28 16:24
 * @Description
 */
public interface ImTokenService {

    /**
     * 创建用户登录im服务的token
     *
     * @param userId
     * @param appId
     * @return
     */
    String createImLoginToken(long userId, int appId);

    /**
     * 根据token检索用户id
     *
     * @param token
     * @return
     */
    Long getUserIdByToken(String token);
}
