package com.example.sb23;

import com.example.sb23.dao.UserDAO;
import com.example.sb23.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/16 9:39
 * 我真的服了，这个连表查询.不搞了，还是mp香
 */
@SpringBootTest
public class 连表查询03  {
    @Autowired
    UserDAO userDAO;

    @Test
    public void test(){
        List<User> usersByRole = userDAO.findUsersByRole(1L);
    }
}
