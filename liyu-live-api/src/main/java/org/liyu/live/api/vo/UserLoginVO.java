package org.liyu.live.api.vo;

/**
 * @Author 傅泽杭
 * @Data 2024-03-17 20:42
 * @Description
 */
public class UserLoginVO {

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserLoginVO{" +
                "userId=" + userId +
                '}';
    }
}
