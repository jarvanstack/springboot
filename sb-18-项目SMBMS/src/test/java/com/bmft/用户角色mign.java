package com.bmft;

import com.bmft.pojo.User;
import com.bmft.service.UserService;
import com.bmft.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/5 15:09
 * 测试成功过
 * 可以通过链表加上别名 as 实现 实体类的角色名称的查询
 */
@SpringBootTest
public class 用户角色mign {
    @Autowired
    UserServiceImpl userService;
    @Test
    public void test(){
        List<User> users = userService.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
