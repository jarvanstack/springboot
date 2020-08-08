package com.example.sb21;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.sb21.mapper.UserMapper;
import com.example.sb21.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;
import java.util.Queue;

/**
 * @Author Jarvan
 * @create 2020/8/7 18:53
 * 这个可以完成几乎所有的操作，自己下去多多练习，这里介绍到这里
 * 用时即查即可.
 */
@SpringBootTest
public class Test01 {
    @Autowired
    UserMapper userMapper;

    /**
     *  * 类似动态SQL map赋值法
     *  * 测试创建时间不为空的，+ modify_time不为空的用户. +年龄大于 0
     *
     *  SQL: SELECT  id,name,password,create_time,modify_time,version,deleted
     *  FROM user
     *  WHERE
     *  deleted=0  AND
     *  (createTime IS NOT NULL AND modifyTime IS NOT NULL)
     */
    @Test
    public void test01(){
        //这个是Wrapper的子类 查询条件构造器
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.isNotNull("createTime")
                .isNotNull("modifyTime");
//                .ge("age",10); age >= 10,g是大于，e是等于,
        List<User> users = userMapper.selectList(userQueryWrapper);
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 查询名字 王二
     *  SELECT
     *  id,name,password,create_time,modify_time,version,deleted
     *  FROM user
     *  WHERE deleted=0 AND (name = ?)
     */
    @Test
    public void test02(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("name","王二");

        //狂神这里使用的是selectOne（）one就必须要保证唯一。
        List<User> users = userMapper.selectList(userQueryWrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }
    /**
     * 3.查 名字长度在 4 - 7 之间的人
     * FROM user WHERE deleted=0 AND (name BETWEEN ? AND ?)
     * 哎这个炸裂了
     */

    @Test
    public void test03(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("name",4,7);
        List<User> users = userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }
    /**
     * 4.模糊查询
     * 查询名字没有王，并且姓为李的User
     */

    @Test
    public void test04(){
        QueryWrapper<User> w = new QueryWrapper<>();
        // not like %王%
        w.notLike("name","王")
        // and like 李%,是错误的，百分号的方向就是
                //这个是错误的，Left是百分号的朝向，left是百分号的朝向.

        .likeRight("name","李");
        List<User> users = userMapper.selectList(w);
        for (User user : users) {
            System.out.println(user);
        }
    }
}



















