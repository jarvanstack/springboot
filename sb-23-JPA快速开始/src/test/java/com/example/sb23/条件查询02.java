package com.example.sb23;

import com.example.sb23.dao.UserDAO;
import com.example.sb23.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/16 9:20
 */
@SpringBootTest
public class 条件查询02 {
    @Autowired
    UserDAO userDAO;

    /**
     * 通过向userDAO层增加接口声明直接能在这里使用
     * User getUserByAccount(String account);
     */
    @Test
    public void test01(){
        User account1 = userDAO.getUserByAccount("account1");
        if (account1 != null) {
            System.err.println(account1);
        }
    }
}
