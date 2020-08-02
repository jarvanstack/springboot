package com.bmft.demo03;

import com.bmft.demo03.pojo.Dog02;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JSR303校验02 {
    @Autowired
    private Dog02 dog;
    @Test
    public void test(){
        System.err.println(dog);
    }
}
