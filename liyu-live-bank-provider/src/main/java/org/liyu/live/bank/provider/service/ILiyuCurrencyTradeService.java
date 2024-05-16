package org.liyu.live.bank.provider.service;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:11
 * @Description
 */
public interface ILiyuCurrencyTradeService {

    /**
     * 插入一条流水记录
     *
     * @param userId
     * @param num
     * @param type
     * @return
     */
    boolean insertOne(long userId,int num,int type);
}
