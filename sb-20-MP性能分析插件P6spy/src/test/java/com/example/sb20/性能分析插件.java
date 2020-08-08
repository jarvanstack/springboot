package com.example.sb20;

import com.example.sb20.mapper.UserMapper;

import com.example.sb20.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/7 16:46
 */
@SpringBootTest
public class 性能分析插件 {
    @Autowired
    UserMapper userMapper;
    
    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
