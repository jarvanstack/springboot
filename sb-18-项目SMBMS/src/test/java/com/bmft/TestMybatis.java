package com.bmft;

import com.bmft.dao.TestMybatisMapper;
import com.bmft.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/4 10:16
 */
@SpringBootTest
public class TestMybatis {
    @Autowired
    private TestMybatisMapper mapper;
    @Test
    public void test(){
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
