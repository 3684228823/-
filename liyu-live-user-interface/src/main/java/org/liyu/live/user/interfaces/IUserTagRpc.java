package org.liyu.live.user.interfaces;

import org.liyu.live.user.constants.UserTagsEnum;

/**
 * @Author 傅泽杭
 * @Data 2024-03-03 16:52
 * @Description 用户标签RPC服务
 */
public interface IUserTagRpc {

    /**
     * 设置标签
     *
     * @param userId
     * @param userTagsEnum
     * @return
     */
    boolean setTag(Long userId, UserTagsEnum userTagsEnum);

    /**
     * 取消标签
     *
     * @param userId
     * @param userTagsEnum
     * @return
     */
    boolean cancelTag(Long userId, UserTagsEnum userTagsEnum);

    /**
     * 是否包含某个标签
     *
     * @param userId
     * @param userTagsEnum
     * @return
     */
    boolean containTag(Long userId, UserTagsEnum userTagsEnum);
}
