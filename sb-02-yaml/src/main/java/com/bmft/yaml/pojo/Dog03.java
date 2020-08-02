package com.bmft.yaml.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 拓展
 * 加载指定的配置文件 properties文件
 * @PropertySource("dog.properties") ：加载指定的配置文件；
 * @configurationProperties：默认从全局配置文件中获取值；
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
//@PropertySource(value="classpath:dog.properties")//这个
@PropertySource(value = "classpath:dog03.yaml")
public class Dog03 {
    //使用EXTL表达式取值【感觉还不如方式1好用】这个取值会乱码
    @Value("${name}")
    private String name;
}
