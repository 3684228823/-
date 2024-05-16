package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:20
 * @Description
 */
public class SkuPrepareOrderItemInfoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6033305737226285944L;
    private SkuInfoDTO skuInfoDTO;
    private Integer count;

    public SkuInfoDTO getSkuInfoDTO() {
        return skuInfoDTO;
    }

    public void setSkuInfoDTO(SkuInfoDTO skuInfoDTO) {
        this.skuInfoDTO = skuInfoDTO;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
