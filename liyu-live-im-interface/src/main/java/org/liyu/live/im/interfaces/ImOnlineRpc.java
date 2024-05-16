package org.liyu.live.im.interfaces;

/**
 * @Author 傅泽杭
 * @Data 2024-03-27 22:06
 * @Description
 */
public interface ImOnlineRpc {

    /**
     * 判断用户是否在线
     *
     * @param userId
     * @param appId
     * @return
     */
    boolean isOnline(long userId,int appId);
}