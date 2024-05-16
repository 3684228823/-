package org.liyu.live.id.generate.interfaces;

/**
 * @Author 傅泽杭
 * @Data 2024-03-02 19:12
 * @Description
 */
public interface IdGenerateRpc {

    /**
     * 获取有序id
     * @param id
     * @return
     */
    Long getSeqId(Integer id);

    /**
     * 获取无序id
     * @param id
     * @return
     */
    Long getUnSeqId(Integer id);
}
