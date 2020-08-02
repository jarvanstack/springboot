package com.bmft.yaml;

import com.bmft.yaml.pojo.Person核心重点02;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Person02Test {
    @Autowired//如果不AutoWired就为null
            Person核心重点02 person;
    @Test
    public void test(){
        System.err.println(person);
    }
}
