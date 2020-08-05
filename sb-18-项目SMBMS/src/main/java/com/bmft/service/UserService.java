package com.bmft.service;

import com.bmft.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author Jarvan
 * @create 2020/8/4 20:37
 */

@Mapper
@Service
public interface UserService {
    User login(Map<String, Object> map);
    int signIn(Map<String, Object> map);
    User selectUserById( String id);
    List<User> selectUsers();
    int addUser(Map<String, Object> map);
}
