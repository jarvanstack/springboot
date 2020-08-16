package com.example.sb23;


import com.example.sb23.dao.RoleDAO;
import com.example.sb23.dao.UserDAO;
import com.example.sb23.pojo.Role;
import com.example.sb23.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

/**
 * @Author Jarvan
 * @create 2020/8/15 20:35
 */
@SpringBootTest
public class 插入数据01Test {

    @Autowired
    private UserDAO userDao;

    /**
     * save插入，填充数据,这玩意不仅可以插入还能更新，
     * 但是更新之后，之前的数据呢？奇怪后面的覆盖了前面的，一定执行了删除操作
     */
    @Test
    public void test() {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setId(i+1L);
            user.setName("员工"+(i+1)+"号");
            user.setPwd("123456");
            user.setAccount("account"+(i+1));
            user.setRoleId(1L);
            userDao.save(user);
        }
    }

    /**
     * 通过id获取user
     */
    @Test
    public void test02(){

        Optional<User> byId = userDao.findById(2L);
        if (byId.isPresent()) {
            User user = byId.get();
            System.out.println(user.getName());
        }
    }
    /**
     * 获取所有user
     */

    @Test
    public void test03(){
        List<User> all = userDao.findAll();
        for (User user : all) {
            System.out.println(user.getName());
        }
    }

    /**
     * 初始化，这个连表是真的恶心，
     * 初始化role数据
     */

    @Autowired
    RoleDAO roleDAO;
    @Test
    public void test04(){
        Role role = new Role();
        role.setId(1);
        role.setName("角色1");
        role.setNote("恶心");
        roleDAO.save(role);

    }


}
























