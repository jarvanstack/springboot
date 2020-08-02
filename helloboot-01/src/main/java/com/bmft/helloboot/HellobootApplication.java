package com.bmft.helloboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个Application代表这是SpringBoot的一个应用，哈哈哈，这个Application就是应用的意思
@SpringBootApplication
public class HellobootApplication {
    //为何启动一个main方法就自动开启了一个web应用？？Amazing，诡异
    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
