package com.bmft.yaml.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 模拟我们之前的注入范式
 */
@Component//组件 扫描注册bean到 容器中
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog01回顾 {
    @Value("阿强")
    private String name;
    @Value("2")
    private int age;
}
