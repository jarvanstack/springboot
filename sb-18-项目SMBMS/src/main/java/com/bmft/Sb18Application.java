package com.bmft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author 嘉文
 */
@SpringBootApplication
//开启多线程 @Async注解功能
@EnableAsync
//开启事务注解功能
@EnableTransactionManagement
public class Sb18Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb18Application.class, args);
    }

}
