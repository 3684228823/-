package org.liyu.live.api.service;

import org.liyu.live.api.vo.req.PayProductReqVO;
import org.liyu.live.api.vo.resp.PayProductRespVO;
import org.liyu.live.api.vo.resp.PayProductVO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-20 12:01
 * @Description
 */
public interface IBankService {

    /**
     * 查询相关的产品列表信息
     *
     * @param type
     * @return
     */
    PayProductVO products(Integer type);

    /**
     * 发起支付
     *
     * @param payProductReqVO
     * @return
     */
    PayProductRespVO payProduct(PayProductReqVO payProductReqVO);
}