package org.liyu.live.gift.interfaces;

import org.liyu.live.gift.dto.SkuDetailInfoDTO;
import org.liyu.live.gift.dto.SkuInfoDTO;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:29
 * @Description
 */
public interface ISkuInfoRPC {

    /**
     * 根据主播id查询商品信息
     *
     * @param anchorId
     * @return
     */
    List<SkuInfoDTO> queryByAnchorId(Long anchorId);

    /**
     * 查询商品详情
     *
     * @param skuId
     * @return
     */
    SkuDetailInfoDTO queryBySkuId(Long skuId);
}