package org.liyu.live.im.provider.service;

/**
 * @Author 傅泽杭
 * @Data 2024-03-28 16:27
 * @Description
 */
public interface ImOnlineService {

    /**
     * 判断用户是否在线
     *
     * @param userId
     * @param appId
     * @return
     */
    boolean isOnline(long userId,int appId);
}
