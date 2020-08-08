package com.example.sb19;

import com.example.sb19.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/7 14:36
 */
@SpringBootTest
public class 自动生成主键id策略 {
    @Autowired
    UserMapper userMapper;
    
    @Test
    public void test(){
        
    }
}
