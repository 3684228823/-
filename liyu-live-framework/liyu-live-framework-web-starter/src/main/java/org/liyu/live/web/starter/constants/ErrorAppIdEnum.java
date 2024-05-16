package org.liyu.live.web.starter.constants;

/**
 * @Author 傅泽杭
 * @Data 2024-03-24 14:11
 * @Description
 */
public enum ErrorAppIdEnum {

    LIYU_API_ERROR(101,"liyu-live-api");

    ErrorAppIdEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    int code;
    String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
