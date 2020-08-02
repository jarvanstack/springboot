package com.example.demo07;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class JDBCTemp使用02 {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //增
    @Test
    public void insert(){
        String sql = "insert into mybatis.user (name, password) value ('发','hello')";
        int update = jdbcTemplate.update(sql);
        System.err.println(update);
    }
    //删
    @Test
    public void delete(){
        String sql = "delete from mybatis.user where id = 22";
        int update = jdbcTemplate.update(sql);
        System.err.println(update);
    }
    //改
    @Test
    public void update(){
        String sql = "update mybatis.user set name = '哈哈哈' where id = 21";
        int update = jdbcTemplate.update(sql);
        System.err.println(update);
    }
    //查
    @Test
    public void select(){
        String sql = "select * from mybatis.user ";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> stringObjectMap : maps) {
            System.out.println(stringObjectMap);
        }


    }
}
