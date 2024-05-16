package org.liyu.live.gift.interfaces;

import org.liyu.live.gift.dto.ShopCarReqDTO;
import org.liyu.live.gift.dto.ShopCarRespDTO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-27 13:28
 * @Description 商品购物车接口
 */
public interface IShopCarRPC {

    /**
     * 查看购物车信息
     * @param shopCarReqDTO
     */
    ShopCarRespDTO getCarInfo(ShopCarReqDTO shopCarReqDTO);

    /**
     * 添加商品到购物车中
     *
     * @param shopCarReqDTO
     */
    Boolean addCar(ShopCarReqDTO shopCarReqDTO);


    /**
     * 移除购物车
     *
     * @param shopCarReqDTO
     */
    Boolean removeFromCar(ShopCarReqDTO shopCarReqDTO);

    /**
     * 清除整个购物车
     *
     * @param shopCarReqDTO
     */
    Boolean clearShopCar(ShopCarReqDTO shopCarReqDTO);

}