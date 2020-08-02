package com.bmft.yaml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 模拟我们之前的注入范式测试
 * @Value("阿强")
 */
@SpringBootTest
public class Dog01 {
    @Autowired//这个自动 自动注入后才会能访问值
    com.bmft.yaml.pojo.Dog01回顾 dog01;
    @Test
    public void test() {
        System.out.println(dog01);
    }

}
