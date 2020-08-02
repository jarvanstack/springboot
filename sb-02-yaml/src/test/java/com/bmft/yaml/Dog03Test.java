package com.bmft.yaml;

import com.bmft.yaml.pojo.Dog03;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Dog03Test {
    @Autowired
    Dog03 dog03;
    @Test
    public void test(){
        System.err.println(dog03);
    }
}
