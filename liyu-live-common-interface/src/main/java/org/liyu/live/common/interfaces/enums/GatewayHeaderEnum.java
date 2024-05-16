package org.liyu.live.common.interfaces.enums;

/**
 * @Author 傅泽杭
 * @Data 2024-03-23 20:05
 * @Description
 */
public enum GatewayHeaderEnum {

    USER_LOGIN_ID("用户id","liyu_gh_user_id");

    String desc;
    String name;

    GatewayHeaderEnum(String desc, String name) {
        this.desc = desc;
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }
}
