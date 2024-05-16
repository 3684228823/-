package org.liyu.live.api.vo;

/**
 * @Author 傅泽杭
 * @Data 2024-03-23 22:35
 * @Description
 */
public class HomePageVO {

    private boolean loginStatus;
    private long userId;
    private String nickName;
    private String avatar;
    //是否是主播身份
    private boolean showStartLivingBtn;

    public boolean isShowStartLivingBtn() {
        return showStartLivingBtn;
    }

    public void setShowStartLivingBtn(boolean showStartLivingBtn) {
        this.showStartLivingBtn = showStartLivingBtn;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}