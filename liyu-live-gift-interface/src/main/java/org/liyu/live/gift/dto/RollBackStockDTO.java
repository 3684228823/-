package org.liyu.live.gift.dto;

import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:31
 * @Description
 */
public class RollBackStockDTO implements Serializable {

    private Long orderId;
    private Long userId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}