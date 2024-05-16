package org.liyu.live.bank.constants;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:16
 * @Description
 */
public enum PayProductTypeEnum {

    LIYU_COIN(0,"直播间充值-鲤鱼虚拟币产品");

    PayProductTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    Integer code;
    String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}