package org.liyu.live.im.provider.service.impl;

import jakarta.annotation.Resource;
import org.liyu.live.im.core.server.interfaces.constants.ImCoreServerConstants;
import org.liyu.live.im.provider.service.ImOnlineService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author 傅泽杭
 * @Data 2024-03-28 16:27
 * @Description
 */
@Service
public class ImOnlineServiceImpl implements ImOnlineService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public boolean isOnline(long userId, int appId) {
        return redisTemplate.hasKey(ImCoreServerConstants.IM_BIND_IP_KEY + appId + ":" + userId);
    }

}