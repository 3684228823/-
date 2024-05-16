package org.liyu.live.bank.constants;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:17
 * @Description
 */
public enum TradeTypeEnum {

    SEND_GIFT_TRADE(0,"送礼物交易"),
    LIVING_RECHARGE(1,"直播间充值");

    int code;
    String desc;

    TradeTypeEnum(int code, String desc) {
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
