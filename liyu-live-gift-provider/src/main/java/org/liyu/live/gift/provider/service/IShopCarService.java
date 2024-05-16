package org.liyu.live.gift.provider.service;

import org.liyu.live.gift.dto.ShopCarReqDTO;
import org.liyu.live.gift.dto.ShopCarRespDTO;

/**
 * @Author 傅泽杭
 * @Date: Created in 16:27 2023/10/4
 * @Description 购物车service
 */
public interface IShopCarService {


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
     * 移除购物车某一项商品
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

    /**
     * 修改购物车中某个商品的数量
     *
     * @param shopCarReqDTO
     */
    Boolean addCarItemNum(ShopCarReqDTO shopCarReqDTO);
}
