package com.example.sb19.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author Jarvan
 * @create 2020/8/7 15:06
 */
@Configuration
public class MybatisPlusConfig {
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    /**
     * 分页插件
     *
     * @return
     * @Bean 必须bean注册不然报错.
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    /** 这个弃用了
//     * SQL执行效率插件
//     * // 设置 dev test 环境开启，保证我们的效率
//     */
//    @Bean
//    @Profile({"dev","test"})
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        performanceInterceptor.setMaxTime(100); //ms 设置sql执行的最大时间，如果超过了则不执行
//        performanceInterceptor.setFormat(true);
//        return performanceInterceptor;
//    }
}



