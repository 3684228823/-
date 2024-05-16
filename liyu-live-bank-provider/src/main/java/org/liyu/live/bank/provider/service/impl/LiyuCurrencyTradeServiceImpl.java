package org.liyu.live.bank.provider.service.impl;

import jakarta.annotation.Resource;
import org.liyu.live.bank.provider.dao.mapper.ILiyuCurrencyTradeMapper;
import org.liyu.live.bank.provider.dao.po.LiyuCurrencyTradePO;
import org.liyu.live.bank.provider.service.ILiyuCurrencyTradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:15
 * @Description
 */
@Service
public class LiyuCurrencyTradeServiceImpl implements ILiyuCurrencyTradeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LiyuCurrencyTradeServiceImpl.class);

    @Resource
    private ILiyuCurrencyTradeMapper liyuCurrencyTradeMapper;

    @Override
    public boolean insertOne(long userId, int num, int type) {
        try {
            LiyuCurrencyTradePO tradePO = new LiyuCurrencyTradePO();
            tradePO.setUserId(userId);
            tradePO.setNum(num);
            tradePO.setType(type);
            liyuCurrencyTradeMapper.insert(tradePO);
            return true;
        } catch (Exception e) {
            LOGGER.error("[LiyuCurrencyTradeServiceImpl] insert error is:", e);
        }
        return false;
    }
}