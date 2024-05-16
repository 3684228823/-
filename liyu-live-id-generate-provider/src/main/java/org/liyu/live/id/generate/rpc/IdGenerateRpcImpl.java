package org.liyu.live.id.generate.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.liyu.live.id.generate.interfaces.IdGenerateRpc;
import org.liyu.live.id.generate.service.IdGenerateService;

/**
 * @Author 傅泽杭
 * @Data 2024-03-02 19:17
 * @Description
 */
@DubboService
public class IdGenerateRpcImpl implements IdGenerateRpc {
    @Resource
    private IdGenerateService idGenerateService;

    @Override
    public Long getSeqId(Integer id) {
        return idGenerateService.getSeqId(id);
    }

    @Override
    public Long getUnSeqId(Integer id) {
        return idGenerateService.getUnSeqId(id);
    }
}
