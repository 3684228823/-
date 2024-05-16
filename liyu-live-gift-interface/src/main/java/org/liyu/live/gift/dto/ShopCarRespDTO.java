package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:31
 * @Description
 */
public class ShopCarRespDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -2333856134764035912L;

    private Long userId;
    private Integer roomId;
    private List<ShopCarItemRespDTO> shopCarItemRespDTOS;
    private Integer totalPrice;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ShopCarItemRespDTO> getShopCarItemRespDTOS() {
        return shopCarItemRespDTOS;
    }

    public void setShopCarItemRespDTOS(List<ShopCarItemRespDTO> shopCarItemRespDTOS) {
        this.shopCarItemRespDTOS = shopCarItemRespDTOS;
    }
}
