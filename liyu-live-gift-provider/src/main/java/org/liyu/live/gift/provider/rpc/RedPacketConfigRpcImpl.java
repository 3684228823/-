package org.liyu.live.gift.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.common.interfaces.utils.ConvertBeanUtils;
import org.liyu.live.gift.dto.RedPacketConfigReqDTO;
import org.liyu.live.gift.dto.RedPacketConfigRespDTO;
import org.liyu.live.gift.dto.RedPacketReceiveDTO;
import org.liyu.live.gift.interfaces.IRedPacketConfigRpc;
import org.liyu.live.gift.provider.dao.po.RedPacketConfigPO;
import org.liyu.live.gift.provider.service.IRedPacketConfigService;

/**
 * @Author 傅泽杭
 * @Date: Created in 22:56 2023/9/5
 * @Description
 */
@DubboService
public class RedPacketConfigRpcImpl implements IRedPacketConfigRpc {

    @Resource
    private IRedPacketConfigService redPacketConfigService;

    @Override
    public RedPacketConfigRespDTO queryByAnchorId(Long anchorId) {
        return ConvertBeanUtils.convert(redPacketConfigService.queryByAnchorId(anchorId), RedPacketConfigRespDTO.class);
    }

    @Override
    public boolean addOne(RedPacketConfigReqDTO redPacketConfigReqDTO) {
        return redPacketConfigService.addOne(ConvertBeanUtils.convert(redPacketConfigReqDTO, RedPacketConfigPO.class));
    }

    @Override
    public boolean updateById(RedPacketConfigReqDTO redPacketConfigReqDTO) {
        return redPacketConfigService.updateById(ConvertBeanUtils.convert(redPacketConfigReqDTO,RedPacketConfigPO.class));
    }

    @Override
    public boolean prepareRedPacket(Long anchorId) {
        return redPacketConfigService.prepareRedPacket(anchorId);
    }

    @Override
    public RedPacketReceiveDTO receiveRedPacket(RedPacketConfigReqDTO reqDTO) {
        return redPacketConfigService.receiveRedPacket(reqDTO);
    }

    @Override
    public Boolean startRedPacket(RedPacketConfigReqDTO reqDTO) {
        return redPacketConfigService.startRedPacket(reqDTO);
    }
}
