package org.liyu.live.im.constants;

/**
 * @Author 傅泽杭
 * @Data 2024-03-28 16:37
 * @Description
 */
public enum AppIdEnum {

    LIYU_LIVE_BIZ(10001,"鲤鱼直播业务");

    int code;
    String desc;

    AppIdEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}