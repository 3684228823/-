package org.liyu.live.gift.provider.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.liyu.live.gift.provider.dao.po.RedPacketConfigPO;

/**
 * @Author 傅泽杭
 * @Date: Created in 08:14 2023/9/5
 * @Description
 */
@Mapper
public interface RedPacketConfigMapper extends BaseMapper<RedPacketConfigPO> {

    @Update("UPDATE t_red_packet_config SET total_get_price = total_get_price + #{price}, max_get_price = CASE WHEN #{price} > max_get_price THEN #{price} ELSE max_get_price END WHERE config_code = #{code}")
    void incrTotalGetPrice(@Param("code") String code, @Param("price") Integer price);

    @Update("update t_red_packet_config set total_get=total_get+1 where config_code=#{code} ")
    void incrTotalGet(@Param("code") String code);

}
