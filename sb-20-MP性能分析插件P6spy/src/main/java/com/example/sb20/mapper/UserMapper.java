package com.example.sb20.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sb20.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author Jarvan
 * @create 2020/8/7 14:09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
