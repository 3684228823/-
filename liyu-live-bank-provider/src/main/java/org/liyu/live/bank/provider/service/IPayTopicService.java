package org.liyu.live.bank.provider.service;

import org.liyu.live.bank.provider.dao.po.PayTopicPO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:11
 * @Description
 */
public interface IPayTopicService {

    /**
     * 根据code查询
     *
     * @param code
     * @return
     */
    PayTopicPO getByCode(Integer code);
}