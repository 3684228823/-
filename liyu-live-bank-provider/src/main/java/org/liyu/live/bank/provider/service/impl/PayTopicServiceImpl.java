package org.liyu.live.bank.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.liyu.live.bank.provider.dao.mapper.IPayTopicMapper;
import org.liyu.live.bank.provider.dao.po.PayTopicPO;
import org.liyu.live.bank.provider.service.IPayTopicService;
import org.liyu.live.common.interfaces.enums.CommonStatusEnum;
import org.springframework.stereotype.Service;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:14
 * @Description
 */
@Service
public class PayTopicServiceImpl implements IPayTopicService {

    @Resource
    private IPayTopicMapper payTopicMapper;

    @Override
    public PayTopicPO getByCode(Integer code) {
        LambdaQueryWrapper<PayTopicPO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(PayTopicPO::getBizCode,code);
        queryWrapper.eq(PayTopicPO::getStatus, CommonStatusEnum.VALID_STATUS.getCode());
        queryWrapper.last("limit 1");
        return payTopicMapper.selectOne(queryWrapper);
    }
}
