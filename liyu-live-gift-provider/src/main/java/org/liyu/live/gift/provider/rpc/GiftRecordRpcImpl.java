package org.liyu.live.gift.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.gift.dto.GiftRecordDTO;
import org.liyu.live.gift.interfaces.IGiftRecordRpc;
import org.liyu.live.gift.provider.service.IGiftRecordService;

/**
 * @Author 傅泽杭
 * @Date: Created in 15:10 2023/7/30
 * @Description
 */
@DubboService
public class GiftRecordRpcImpl implements IGiftRecordRpc {

    @Resource
    private IGiftRecordService giftRecordService;

    @Override
    public void insertOne(GiftRecordDTO giftRecordDTO) {
        giftRecordService.insertOne(giftRecordDTO);
    }
}
