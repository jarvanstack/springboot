package com.bmft.demo03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * 松散绑定模拟
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Validated//加上这个注解的意识就是启动数据校验功能
@ConfigurationProperties(prefix = "dog02")//指定全局y配置
public class Dog02 {
    @NotEmpty//不能为空
    private String name;
    @Past//出生必须在现在之前
    private Date birth;
    @Email//必须是一个电子邮件
    private String email;
    //如果校验失败直接抛出异常
}
