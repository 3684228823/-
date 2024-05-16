package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:16
 * @Description
 */
public class ShopCarItemRespDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2579822620888410383L;
    private Integer count;
    private SkuInfoDTO skuInfoDTO;

    public ShopCarItemRespDTO(Integer count, SkuInfoDTO skuInfoDTO) {
        this.count = count;
        this.skuInfoDTO = skuInfoDTO;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SkuInfoDTO getSkuInfoDTO() {
        return skuInfoDTO;
    }

    public void setSkuInfoDTO(SkuInfoDTO skuInfoDTO) {
        this.skuInfoDTO = skuInfoDTO;
    }
}