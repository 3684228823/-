package org.liyu.live.living.provider.service.impl;

import jakarta.annotation.Resource;
import org.idea.liyu.live.framework.redis.starter.key.LivingProviderCacheKeyBuilder;
import org.liyu.live.common.interfaces.enums.CommonStatusEnum;
import org.liyu.live.common.interfaces.utils.ConvertBeanUtils;
import org.liyu.live.living.interfaces.dto.LivingRoomReqDTO;
import org.liyu.live.living.interfaces.dto.LivingRoomRespDTO;
import org.liyu.live.living.provider.dao.mapper.LivingRoomMapper;
import org.liyu.live.living.provider.dao.mapper.LivingRoomRecordMapper;
import org.liyu.live.living.provider.dao.po.LivingRoomRecordPO;
import org.liyu.live.living.provider.service.ILivingRoomService;
import org.liyu.live.living.provider.service.ILivingRoomTxService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author 傅泽杭
 * @Data 2024-04-05 14:38
 * @Description
 */
@Service
public class LivingRoomTxServiceImpl implements ILivingRoomTxService {

    @Resource
    private ILivingRoomService livingRoomService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private LivingRoomRecordMapper livingRoomRecordMapper;
    @Resource
    private LivingRoomMapper livingRoomMapper;
    @Resource
    private LivingProviderCacheKeyBuilder cacheKeyBuilder;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean closeLiving(LivingRoomReqDTO livingRoomReqDTO) {
        LivingRoomRespDTO livingRoomRespDTO = livingRoomService.queryByRoomId(livingRoomReqDTO.getRoomId());
        if (livingRoomRespDTO == null) {
            return false;
        }
        if (!(livingRoomRespDTO.getAnchorId().equals(livingRoomReqDTO.getAnchorId()))) {
            return false;
        }
        LivingRoomRecordPO livingRoomRecordPO = ConvertBeanUtils.convert(livingRoomRespDTO, LivingRoomRecordPO.class);
        livingRoomRecordPO.setEndTime(new Date());
        livingRoomRecordPO.setStatus(CommonStatusEnum.INVALID_STATUS.getCode());
        livingRoomRecordMapper.insert(livingRoomRecordPO);
        livingRoomMapper.deleteById(livingRoomRecordPO.getId());
        //移除掉直播间cache
        String cacheKey = cacheKeyBuilder.buildLivingRoomObj(livingRoomReqDTO.getRoomId());
        redisTemplate.delete(cacheKey);
        return true;
    }
}