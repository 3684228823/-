package org.liyu.live.im.core.server.interfaces.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-03-30 21:44
 * @Description
 */
public class ImOfflineDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 7435114723872010599L;
    private Long userId;
    private Integer appId;
    private Integer roomId;
    private Long loginTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "ImOfflineDTO{" +
                "userId=" + userId +
                ", appId=" + appId +
                ", roomId=" + roomId +
                ", loginTime=" + loginTime +
                '}';
    }
}