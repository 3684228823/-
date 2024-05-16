package org.liyu.live.api.service;

import org.liyu.live.api.vo.LivingRoomInitVO;
import org.liyu.live.api.vo.req.LivingRoomReqVO;
import org.liyu.live.api.vo.req.OnlinePkReqVO;
import org.liyu.live.api.vo.resp.LivingRoomPageRespVO;
import org.liyu.live.api.vo.resp.RedPacketReceiveVO;
import org.liyu.live.gift.dto.RedPacketConfigReqDTO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-04 21:07
 * @Description
 */
public interface ILivingRoomService {

    /**
     * 直播间列表展示
     *
     * @param livingRoomReqVO
     * @return
     */
    LivingRoomPageRespVO list(LivingRoomReqVO livingRoomReqVO);

    /**
     * 开启直播间
     *
     * @param type
     */
    Integer startingLiving(Integer type);


    /**
     * 用户在pk直播间中，连上线请求
     *
     * @param onlinePkReqVO
     * @return
     */
    boolean onlinePk(OnlinePkReqVO onlinePkReqVO);

    /**
     * 关闭直播间
     *
     * @param roomId
     * @return
     */
    boolean closeLiving(Integer roomId);

    /**
     * 根据用户id返回当前直播间相关信息
     *
     * @param userId
     * @param roomId
     * @return
     */
    LivingRoomInitVO anchorConfig(Long userId, Integer roomId);

    /**
     * 初始化红包数据
     * @param userId
     */
    Boolean prepareRedPacket(Long userId,Integer roomId);

    /**
     * 开始红包雨
     * @param userId
     * @param code
     */
    Boolean startRedPacket(Long userId, String code);

    /**
     * 领取红包
     * @param userId
     * @param code
     */
    RedPacketReceiveVO getRedPacket(Long userId, String code);
}
