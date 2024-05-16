package org.liyu.live.user.provider.service.bo;

/**
 * @Author 傅泽杭
 * @Data 2024-03-16 21:42
 * @Description
 */
public class UserRegisterBO {

    private Long userId;
    private String phone;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
