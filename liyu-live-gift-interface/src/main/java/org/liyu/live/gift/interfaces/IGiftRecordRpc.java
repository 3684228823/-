package org.liyu.live.gift.interfaces;

import org.liyu.live.gift.dto.GiftRecordDTO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-16 16:29
 * @Description
 */
public interface IGiftRecordRpc {

    /**
     * 插入单个礼物信息
     *
     * @param giftRecordDTO
     */
    void insertOne(GiftRecordDTO giftRecordDTO);

}