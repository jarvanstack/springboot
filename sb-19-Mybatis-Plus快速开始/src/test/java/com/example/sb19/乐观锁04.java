package com.example.sb19;

import com.example.sb19.mapper.UserMapper;
import com.example.sb19.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/7 15:04
 */
@SpringBootTest
public class 乐观锁04 {
    @Autowired
    UserMapper userMapper;
    
    @Test
    public void test(){
        User user = userMapper.selectById(30);
        user.setName("法外狂徒张三");
        int update = userMapper.updateById(user);
    }
}
