package org.liyu.live.gift.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.common.interfaces.utils.ConvertBeanUtils;
import org.liyu.live.gift.dto.SkuDetailInfoDTO;
import org.liyu.live.gift.dto.SkuInfoDTO;
import org.liyu.live.gift.interfaces.ISkuInfoRPC;
import org.liyu.live.gift.provider.dao.po.SkuInfoPO;
import org.liyu.live.gift.provider.service.IAnchorShopInfoService;
import org.liyu.live.gift.provider.service.ISkuInfoService;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Date: Created in 20:11 2023/10/3
 * @Description
 */
@DubboService
public class SkuInfoRPCImpl implements ISkuInfoRPC {

    @Resource
    private ISkuInfoService skuInfoService;
    @Resource
    private IAnchorShopInfoService anchorShopInfoService;

    @Override
    public List<SkuInfoDTO> queryByAnchorId(Long anchorId) {
        List<Long> skuIdLIst = anchorShopInfoService.querySkuIdByAnchorId(anchorId);
        List<SkuInfoPO> skuInfoPOS = skuInfoService.queryBySkuIds(skuIdLIst);
        return ConvertBeanUtils.convertList(skuInfoPOS,SkuInfoDTO.class);
    }

    @Override
    public SkuDetailInfoDTO queryBySkuId(Long skuId) {
        SkuInfoPO skuInfoPO = skuInfoService.queryBySkuIdFromCache(skuId);
        return ConvertBeanUtils.convert(skuInfoPO,SkuDetailInfoDTO.class);
    }
}
