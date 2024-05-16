package org.liyu.live.bank.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.bank.dto.PayOrderDTO;
import org.liyu.live.bank.interfaces.IPayOrderRpc;
import org.liyu.live.bank.provider.dao.po.PayOrderPO;
import org.liyu.live.bank.provider.service.IPayOrderService;
import org.liyu.live.common.interfaces.utils.ConvertBeanUtils;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:09
 * @Description
 */
@DubboService
public class PayOrderRpcImpl implements IPayOrderRpc {

    @Resource
    private IPayOrderService payOrderService;

    @Override
    public String insertOne(PayOrderDTO payOrderDTO) {
        return payOrderService.insertOne(ConvertBeanUtils.convert(payOrderDTO, PayOrderPO.class));
    }

    @Override
    public boolean updateOrderStatus(Long id, Integer status) {
        return payOrderService.updateOrderStatus(id, status);
    }

    @Override
    public boolean updateOrderStatus(String orderId, Integer status) {
        return payOrderService.updateOrderStatus(orderId, status);
    }

    @Override
    public boolean payNotify(PayOrderDTO payOrderDTO) {
        return payOrderService.payNotify(payOrderDTO);
    }
}

