package org.liyu.live.living.provider.service;

import org.liyu.live.living.interfaces.dto.LivingRoomReqDTO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-05 14:37
 * @Description
 */
public interface ILivingRoomTxService {

    /**
     * 关闭直播间
     *
     * @param livingRoomReqDTO
     * @return
     */
    boolean closeLiving(LivingRoomReqDTO livingRoomReqDTO);

}
