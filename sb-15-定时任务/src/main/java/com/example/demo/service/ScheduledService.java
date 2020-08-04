package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author Jarvan
 * @create 2020/8/3 15:01
 */
@Service
public class ScheduledService {

    /**
     * cron表达式 秒 分 时 日 月 周几
     * 要使用的时候去百度搜索，有生成器或者例子搬过来就能用。
     * 正则表达式也是.
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduled(){
        System.out.println("这个cron表达式是每间隔2秒执行一次");
    }

}
