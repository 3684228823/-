package org.liyu.live.bank.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.bank.dto.PayProductDTO;
import org.liyu.live.bank.interfaces.IPayProductRpc;
import org.liyu.live.bank.provider.service.IPayProductService;

import java.util.List;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:09
 * @Description
 */
@DubboService
public class PayProductRpcImpl implements IPayProductRpc {

    @Resource
    private IPayProductService payProductService;

    @Override
    public List<PayProductDTO> products(Integer type) {
        return payProductService.products(type);
    }

    @Override
    public PayProductDTO getByProductId(Integer productId) {
        return payProductService.getByProductId(productId);
    }
}