package com.bmft;

import com.bmft.pojo.User;
import com.bmft.service.UserService;
import com.bmft.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/5 9:46
 */
@SpringBootTest
public class 测试注册 {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void test(){
        User user = userService.selectUserById("15");
        user.setUserCode("防守打法");
        System.out.println(user);
    }
}
