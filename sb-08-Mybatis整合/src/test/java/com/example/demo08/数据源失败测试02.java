package com.example.demo08;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class 数据源失败测试02 {

    @Autowired
    DataSource dataSource;

    /**
     * Mybatis start不能删除，我们先回复 jdbc starter试试
     * 还是url配置错误。
     */
    @Test
    public void test(){
        System.err.println("+++++++++++"+dataSource);
    }

    /**
     * 我们删除试试 jdbc starter试试
     */
    @Test
    public void test2(){
        System.err.println("+++++++++++"+dataSource);
    }

    /**
     * 我们复制 sb-07  的yaml测试试试
     */
    @Test
    public void test3(){
        System.err.println("+++++++++++"+dataSource);
    }





}
