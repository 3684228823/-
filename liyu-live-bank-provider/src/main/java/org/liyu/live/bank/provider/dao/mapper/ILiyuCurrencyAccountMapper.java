package org.liyu.live.bank.provider.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.liyu.live.bank.provider.dao.po.LiyuCurrencyAccountPO;

/**
 * @Author 傅泽杭
 * @Data 2024-04-19 23:08
 * @Description
 */
@Mapper
public interface ILiyuCurrencyAccountMapper extends BaseMapper<LiyuCurrencyAccountPO> {

    @Update("update t_liyu_currency_account set current_balance = current_balance + #{num} where user_id = #{userId}")
    void incr(@Param("userId") long userId, @Param("num") int num);

    @Select("select current_balance from t_liyu_currency_account where user_id=#{userId} and status = 1 limit 1")
    Integer queryBalance(@Param("userId") long userId);

    @Update("update t_liyu_currency_account set current_balance = current_balance - #{num} where user_id = #{userId}")
    void decr(@Param("userId") long userId,@Param("num") int num);


}