package org.liyu.live.api.vo.resp;

/**
 * @Author 傅泽杭
 * @Data 2024-04-20 12:45
 * @Description
 */
public class PayProductRespVO {

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "PayProductRespVO{" +
                "orderId='" + orderId + '\'' +
                '}';
    }
}