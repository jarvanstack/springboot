package com.example.sb19;

import com.example.sb19.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/7 15:19
 */
@SpringBootTest
public class 逻辑删除05 {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test(){
        userMapper.deleteById(30);
    }
}
