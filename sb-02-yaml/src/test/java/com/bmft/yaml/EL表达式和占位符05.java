package com.bmft.yaml;

import com.bmft.yaml.pojo.Person05;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 *  * EXTL表达式和占位符04 的拓展05
 *  * 04 因为 map的原因我们无法取取值，我们这里使用核心功能
 *  * @ConfigurationProperties("person05")
 *
 */
@SpringBootTest
public class EL表达式和占位符05 {
    @Autowired
    private Person05 person05;
    @Test
    public void test(){
        System.err.println(person05);
    }
}
