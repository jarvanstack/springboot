package com.example.sb21;

import com.example.sb21.mapper.UserMapper;
import com.example.sb21.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/7 18:50
 */
@SpringBootTest
public class 测试环境 {
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
