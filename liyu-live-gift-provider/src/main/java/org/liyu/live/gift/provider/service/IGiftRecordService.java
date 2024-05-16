package org.liyu.live.gift.provider.service;

import org.liyu.live.gift.dto.GiftRecordDTO;

/**
 * @Author 傅泽杭
 * @Date: Created in 15:11 2023/7/30
 * @Description
 */
public interface IGiftRecordService {

    /**
     * 插入单个礼物信息
     *
     * @param giftRecordDTO
     */
    void insertOne(GiftRecordDTO giftRecordDTO);

}