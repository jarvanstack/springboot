package com.example.sb19;

import com.example.sb19.mapper.UserMapper;
import com.example.sb19.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/7 14:12
 */
@SpringBootTest
public class 快速开始 {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test01(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

}
