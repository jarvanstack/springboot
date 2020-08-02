package com.bmft.demo03;

import com.bmft.demo03.pojo.Dog01;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class 松散绑定01 {
    @Autowired
    private Dog01 dog01;
    @Test
    public void test(){
        System.err.println(dog01);
    }
}
