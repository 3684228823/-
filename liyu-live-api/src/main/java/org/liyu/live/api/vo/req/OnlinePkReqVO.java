package org.liyu.live.api.vo.req;

/**
 * @Author 傅泽杭
 * @Data 2024-04-04 21:08
 * @Description
 */
public class OnlinePkReqVO {

    private Integer roomId;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "OnlinePkReqVO{" +
                "roomId=" + roomId +
                '}';
    }
}