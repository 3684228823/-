package org.liyu.live.user.provider.service;

import org.liyu.live.user.dto.UserDTO;

import java.util.List;
import java.util.Map;

/**
 * @Author 傅泽杭
 * @Data 2024-02-28 13:04
 * @Description
 */
public interface IUserService {

    /**
     * 根据用户id进行查询
     * @param userId
     * @return
     */
    UserDTO getByUserId(Long userId);

    /**
     * 用户更新
     * @param userDTO
     * @return
     */
    boolean updateUserInfo(UserDTO userDTO);

    /**
     * 插入用户信息
     * @param userDTO
     * @return
     */
    boolean insertOne(UserDTO userDTO);

    /**
     * 批量查询用户信息
     * @param userIdList
     * @return
     */
    Map<Long,UserDTO> batchQueryUserInfo(List<Long> userIdList);
}
