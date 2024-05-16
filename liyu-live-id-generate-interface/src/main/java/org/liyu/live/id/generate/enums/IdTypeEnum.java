package org.liyu.live.id.generate.enums;

/**
 * @Author 傅泽杭
 * @Data 2024-03-16 14:44
 * @Description
 */
public enum IdTypeEnum {

    USER_ID(1,"用户id生成策略");

    int code;
    String desc;

    IdTypeEnum(int code, String desc) {
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

