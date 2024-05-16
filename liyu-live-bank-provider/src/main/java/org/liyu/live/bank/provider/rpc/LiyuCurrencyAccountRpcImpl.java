package org.liyu.live.bank.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.bank.dto.AccountTradeReqDTO;
import org.liyu.live.bank.dto.AccountTradeRespDTO;
import org.liyu.live.bank.interfaces.ILiyuCurrencyAccountRpc;
import org.liyu.live.bank.provider.service.ILiyuCurrencyAccountService;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:09
 * @Description
 */
@DubboService
public class LiyuCurrencyAccountRpcImpl implements ILiyuCurrencyAccountRpc {

    @Resource
    private ILiyuCurrencyAccountService LiyuCurrencyAccountService;

    @Override
    public void incr(long userId, int num) {
        LiyuCurrencyAccountService.incr(userId, num);
    }

    @Override
    public void decr(long userId, int num) {
        LiyuCurrencyAccountService.decr(userId, num);
    }

    @Override
    public Integer getBalance(long userId) {
        return LiyuCurrencyAccountService.getBalance(userId);
    }

    @Override
    public AccountTradeRespDTO consumeForSendGift(AccountTradeReqDTO accountTradeReqDTO) {
        return LiyuCurrencyAccountService.consumeForSendGift(accountTradeReqDTO);
    }

}