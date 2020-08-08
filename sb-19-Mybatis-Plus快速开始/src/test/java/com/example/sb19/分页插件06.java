package com.example.sb19;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sb19.mapper.UserMapper;
import com.example.sb19.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/7 16:02
 */
@SpringBootTest
public class 分页插件06 {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        Page<User> userPage = new Page<>();
        //设置当前页码
        userPage.setCurrent(1);
        //设置size
        userPage.setSize(5);
        userMapper.selectPage(userPage,null);
        for (User record : userPage.getRecords()) {
            System.out.println(record);
        }
    }
}
