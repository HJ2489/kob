package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Torch
 * @Date: 2023/12/05 21:53
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
