package com.bmft.service;

import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author Jarvan
 * @create 2020/8/4 20:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(Map<String, Object> map) {
        return userMapper.login(map);
    }

    @Override
    public int signIn(Map<String, Object> map) {
        return userMapper.signIn(map);
    }

    @Override
    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }

    /**
     * 阿里巴巴太智能了
     *
     * @param map
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addUser(Map<String, Object> map) {
        return userMapper.addUser(map);
    }
}
