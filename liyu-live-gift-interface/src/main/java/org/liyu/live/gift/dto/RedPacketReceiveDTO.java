package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-04-26 12:53
 * @Description
 */
public class RedPacketReceiveDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 9059575343595910533L;

    private Integer price;
    private String notifyMsg;

    public RedPacketReceiveDTO(Integer price) {
        this.price = price;
    }

    public RedPacketReceiveDTO(Integer price,String notifyMsg) {
        this.price = price;
        this.notifyMsg = notifyMsg;
    }

    public String getNotifyMsg() {
        return notifyMsg;
    }

    public void setNotifyMsg(String notifyMsg) {
        this.notifyMsg = notifyMsg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
