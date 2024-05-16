package org.liyu.live.api.service;

import org.liyu.live.api.vo.req.GiftReqVO;
import org.liyu.live.api.vo.resp.GiftConfigVO;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-16 20:54
 * @Description
 */
public interface IGiftService {

    /**
     * 展示礼物列表
     *
     * @return
     */
    List<GiftConfigVO> listGift();

    /**
     * 送礼
     *
     * @param giftReqVO
     * @return
     */
    boolean send(GiftReqVO giftReqVO);
}
