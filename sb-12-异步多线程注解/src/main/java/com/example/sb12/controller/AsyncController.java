package com.example.sb12.controller;

import com.example.sb12.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jarvan
 * @create 2020/8/2 18:22
 */
@RestController
public class AsyncController {
    @Autowired
    private AsyncService service;

    @GetMapping("/async")
    public String demo() {
        //模拟邮件发送异步执行
        service.async();
        return "邮件发送10秒钟异步执行";
    }
}
