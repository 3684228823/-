package org.liyu.live.api.vo.req;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:14
 * @Description
 */
public class ShopCarReqVO {

    private Long skuId;
    private Integer roomId;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}
