package org.liyu.live.gift.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author 傅泽杭
 * @Data 2024-04-25 21:01
 * @Description
 */
public class RedPacketConfigReqDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4845264552451489561L;

    private Long anchorId;
    private Integer roomId;
    private Integer status;
    private Long userId;
    private String redPacketConfigCode;
    private Integer totalPrice;
    private Integer totalCount;
    private String remark;

    @Override
    public String toString() {
        return "RedPacketConfigReqDTO{" +
                "anchorId=" + anchorId +
                ", roomId=" + roomId +
                ", status=" + status +
                ", userId=" + userId +
                ", redPacketConfigCode='" + redPacketConfigCode + '\'' +
                ", totalPrice=" + totalPrice +
                ", totalCount=" + totalCount +
                ", remark='" + remark + '\'' +
                '}';
    }

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRedPacketConfigCode() {
        return redPacketConfigCode;
    }

    public void setRedPacketConfigCode(String redPacketConfigCode) {
        this.redPacketConfigCode = redPacketConfigCode;
    }

    public Long getAnchorId() {
        return anchorId;
    }

    public void setAnchorId(Long anchorId) {
        this.anchorId = anchorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
