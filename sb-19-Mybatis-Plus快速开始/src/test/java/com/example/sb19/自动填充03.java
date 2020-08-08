package com.example.sb19;

import com.example.sb19.mapper.UserMapper;
import com.example.sb19.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/7 14:50
 */
@SpringBootTest
public class 自动填充03 {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){

        User user = new User();
        user.setName("嗯嗯嗯呃");
        userMapper.insert(user);
    }
}
