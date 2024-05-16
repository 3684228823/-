package org.liyu.live.user.provider.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.liyu.live.user.provider.dao.po.UserPO;

/**
 * @Author 傅泽杭
 * @Data 2024-02-28 13:03
 * @Description
 */
@Mapper
public interface IUserMapper extends BaseMapper<UserPO> {
}
