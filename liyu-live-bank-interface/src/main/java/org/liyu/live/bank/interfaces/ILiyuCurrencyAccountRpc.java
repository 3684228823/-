package org.liyu.live.bank.interfaces;

import org.liyu.live.bank.dto.AccountTradeReqDTO;
import org.liyu.live.bank.dto.AccountTradeRespDTO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:18
 * @Description
 */
public interface ILiyuCurrencyAccountRpc {

    /**
     * 增加虚拟币
     *
     * @param userId
     * @param num
     */
    void incr(long userId,int num);

    /**
     * 扣减虚拟币
     *
     * @param userId
     * @param num
     */
    void decr(long userId,int num);

    /**
     * 查询余额
     *
     * @param userId
     * @return
     */
    Integer getBalance(long userId);


    /**
     * 专门给送礼业务调用的扣减库存逻辑
     *
     * @param accountTradeReqDTO
     */
    AccountTradeRespDTO consumeForSendGift(AccountTradeReqDTO accountTradeReqDTO);


}