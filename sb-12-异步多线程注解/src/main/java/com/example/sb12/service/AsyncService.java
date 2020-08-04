package com.example.sb12.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author Jarvan
 * @create 2020/8/2 18:26
 */
@Service
public class AsyncService {
    /**
     * 模拟邮件发送，10秒钟
     */
    @Async
    public void async(){
        try {
            Thread.sleep(10*1000);
            System.out.println("==========发送成功===========");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
