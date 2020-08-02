package com.bmft.yaml.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * EXTL表达式和占位符04 的拓展05
 * 04 因为 map的原因我们无法取取值，我们这里使用核心功能
 * @ConfigurationProperties("person05")
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//注册bean
@ConfigurationProperties("person05")//【重要】指向yaml的键值
public class Person05 {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog01回顾 dog;
}
