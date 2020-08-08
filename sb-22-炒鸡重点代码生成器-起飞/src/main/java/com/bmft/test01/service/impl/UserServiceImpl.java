package com.bmft.test01.service.impl;

import com.bmft.test01.pojo.User;
import com.bmft.test01.mapper.UserMapper;
import com.bmft.test01.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 嘉文
 * @since 2020-08-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
