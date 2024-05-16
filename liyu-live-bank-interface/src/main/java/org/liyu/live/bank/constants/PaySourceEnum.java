package org.liyu.live.bank.constants;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:17
 * @Description
 */
public enum PaySourceEnum {

    LIYU_LIVING_ROOM(1,"鲤鱼直播间内支付"),
    LIYU_USER_CENTER(2,"用户中心");

    PaySourceEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static PaySourceEnum find(int code) {
        for (PaySourceEnum value : PaySourceEnum.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        return null;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}