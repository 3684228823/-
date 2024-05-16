package org.liyu.live.api.vo;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:18
 * @Description
 */
public class PrepareOrderVO {

    private Long userId;
    private Integer roomId;

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
}
