package org.liyu.live.bank.interfaces;

import org.liyu.live.bank.dto.PayProductDTO;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:18
 * @Description
 */
public interface IPayProductRpc {

    /**
     * 返回批量的商品信息
     *
     * @param type 不同的业务场景所使用的产品
     */
    List<PayProductDTO> products(Integer type);


    /**
     * 根据产品id查询
     *
     * @param productId
     * @return
     */
    PayProductDTO getByProductId(Integer productId);
}

