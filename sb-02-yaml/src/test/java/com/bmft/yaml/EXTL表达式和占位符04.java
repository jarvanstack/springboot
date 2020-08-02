package com.bmft.yaml;

import com.bmft.yaml.pojo.Person04;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EXTL表达式和占位符04 {
    @Autowired
    Person04 person04;
    @Test
    public void test(){
        System.out.println(person04);
    }
}
