package org.liyu.live.api.vo.resp;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-04 21:09
 * @Description
 */
public class LivingRoomPageRespVO {

    private List<LivingRoomRespVO> list;
    private boolean hasNext;

    public List<LivingRoomRespVO> getList() {
        return list;
    }

    public void setList(List<LivingRoomRespVO> list) {
        this.list = list;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    @Override
    public String toString() {
        return "LivingRoomPageRespVO{" +
                "list=" + list +
                ", hasNext=" + hasNext +
                '}';
    }
}