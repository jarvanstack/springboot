package com.example.sb21;

import com.example.sb21.mapper.UserMapper;
import com.example.sb21.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Sb21ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    UserMapper userMapper;

    /**
     * 测试环境
     */
    @Test
    public void test01() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
    /**
     * 测试
     */

}
