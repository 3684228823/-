package org.liyu.live.msg.enums;

/**
 * @Author 傅泽杭
 * @Data 2024-03-13 15:20
 * @Description
 */
public enum MsgSendResultEnum {

    SEND_SUCCESS(0,"成功"),
    SEND_FAIL(1,"发送失败"),
    MSG_PARAM_ERROR(2,"消息参数异常");

    int code;
    String desc;

    MsgSendResultEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
