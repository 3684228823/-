package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:19
 * @Description
 */
public class SkuPrepareOrderInfoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4225814764392434579L;
    private List<SkuPrepareOrderItemInfoDTO> skuPrepareOrderItemInfoDTOS;
    private Integer totalPrice;

    public List<SkuPrepareOrderItemInfoDTO> getSkuPrepareOrderItemInfoDTOS() {
        return skuPrepareOrderItemInfoDTOS;
    }

    public void setSkuPrepareOrderItemInfoDTOS(List<SkuPrepareOrderItemInfoDTO> skuPrepareOrderItemInfoDTOS) {
        this.skuPrepareOrderItemInfoDTOS = skuPrepareOrderItemInfoDTOS;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
