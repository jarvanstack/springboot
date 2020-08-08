package com.example.sb22;

import com.example.sb22.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb22ApplicationTests {

    @Autowired
    UserMapper userMapper;
    /**
     * 测试环境
     */
    @Test
    void contextLoads() {
        userMapper.selectList(null);
    }

}
