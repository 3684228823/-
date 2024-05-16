package org.liyu.live.api.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.liyu.live.api.error.ApiErrorEnum;
import org.liyu.live.api.service.IShopInfoService;
import org.liyu.live.api.vo.PrepareOrderVO;
import org.liyu.live.api.vo.req.ShopCarReqVO;
import org.liyu.live.api.vo.req.SkuInfoReqVO;
import org.liyu.live.api.vo.resp.ShopCarRespVO;
import org.liyu.live.api.vo.resp.SkuDetailInfoVO;
import org.liyu.live.api.vo.resp.SkuInfoVO;
import org.liyu.live.common.interfaces.utils.ConvertBeanUtils;
import org.liyu.live.gift.dto.*;
import org.liyu.live.gift.interfaces.IShopCarRPC;
import org.liyu.live.gift.interfaces.ISkuInfoRPC;
import org.liyu.live.gift.interfaces.ISkuOrderInfoRPC;
import org.liyu.live.living.interfaces.dto.LivingRoomRespDTO;
import org.liyu.live.living.interfaces.rpc.ILivingRoomRpc;
import org.liyu.live.web.starter.context.LiyuRequestContext;
import org.liyu.live.web.starter.error.BizBaseErrorEnum;
import org.liyu.live.web.starter.error.ErrorAssert;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:21
 * @Description
 */
@Service
public class ShopInfoServiceImpl implements IShopInfoService {

    @DubboReference
    private ILivingRoomRpc livingRoomRpc;
    @DubboReference
    private ISkuInfoRPC skuInfoRPC;
    @DubboReference
    private IShopCarRPC shopCarRPC;
    @DubboReference
    private ISkuOrderInfoRPC skuOrderInfoRPC;

    @Override
    public List<SkuInfoVO> queryByRoomId(Integer roomId) {
        LivingRoomRespDTO livingRoomRespDTO = livingRoomRpc.queryByRoomId(roomId);
        ErrorAssert.isNotNull(livingRoomRespDTO, BizBaseErrorEnum.PARAM_ERROR);
        Long anchorId = livingRoomRespDTO.getAnchorId();
        List<SkuInfoDTO> skuInfoDTOS = skuInfoRPC.queryByAnchorId(anchorId);
        ErrorAssert.isTure(CollectionUtils.isNotEmpty(skuInfoDTOS),BizBaseErrorEnum.PARAM_ERROR);
        return ConvertBeanUtils.convertList(skuInfoDTOS,SkuInfoVO.class);
    }

    @Override
    public SkuDetailInfoVO detail(SkuInfoReqVO skuInfoReqVO) {
        return ConvertBeanUtils.convert(skuInfoRPC.queryBySkuId(skuInfoReqVO.getSkuId()),SkuDetailInfoVO.class);
    }

    @Override
    public Boolean addCar(ShopCarReqVO shopCarReqVO) {
        ShopCarReqDTO shopCarReqDTO = ConvertBeanUtils.convert(shopCarReqVO, ShopCarReqDTO.class);
        shopCarReqDTO.setUserId(LiyuRequestContext.getUserId());
        return shopCarRPC.addCar(shopCarReqDTO);
    }

    @Override
    public ShopCarRespVO getCarInfo(ShopCarReqVO shopCarReqVO) {
        ShopCarReqDTO shopCarReqDTO = ConvertBeanUtils.convert(shopCarReqVO, ShopCarReqDTO.class);
        shopCarReqDTO.setUserId(LiyuRequestContext.getUserId());
        return ConvertBeanUtils.convert(shopCarRPC.getCarInfo(shopCarReqDTO), ShopCarRespVO.class);
    }

    @Override
    public Boolean removeFromCar(ShopCarReqVO shopCarReqVO) {
        ShopCarReqDTO shopCarReqDTO = ConvertBeanUtils.convert(shopCarReqVO, ShopCarReqDTO.class);
        shopCarReqDTO.setUserId(LiyuRequestContext.getUserId());
        return shopCarRPC.removeFromCar(shopCarReqDTO);
    }

    @Override
    public Boolean clearShopCar(ShopCarReqVO shopCarReqVO) {
        ShopCarReqDTO shopCarReqDTO = ConvertBeanUtils.convert(shopCarReqVO, ShopCarReqDTO.class);
        shopCarReqDTO.setUserId(LiyuRequestContext.getUserId());
        return shopCarRPC.clearShopCar(shopCarReqDTO);
    }

    @Override
    public SkuPrepareOrderInfoDTO prepareOrder(PrepareOrderVO prepareOrderVO) {
        PrepareOrderReqDTO reqDTO = new PrepareOrderReqDTO();
        reqDTO.setUserId(LiyuRequestContext.getUserId());
        reqDTO.setRoomId(prepareOrderVO.getRoomId());
        SkuPrepareOrderInfoDTO skuPrepareOrderInfoDTO = skuOrderInfoRPC.prepareOrder(reqDTO);
        ErrorAssert.isNotNull(skuPrepareOrderInfoDTO, ApiErrorEnum.SKU_IS_NOT_ENOUGH);
        return skuPrepareOrderInfoDTO;
    }

    @Override
    public boolean payNow(PrepareOrderVO prepareOrderVO) {
        prepareOrderVO.setUserId(LiyuRequestContext.getUserId());
        boolean status = skuOrderInfoRPC.payNow(ConvertBeanUtils.convert(prepareOrderVO, PayNowReqDTO.class));
        ErrorAssert.isTure(status,ApiErrorEnum.PAY_ERROR);
        return status;
    }
}
