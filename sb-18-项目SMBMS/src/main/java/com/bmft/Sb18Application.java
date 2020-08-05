package com.bmft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//开启多线程 @Async注解功能
@EnableAsync
public class Sb18Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb18Application.class, args);
    }

}
