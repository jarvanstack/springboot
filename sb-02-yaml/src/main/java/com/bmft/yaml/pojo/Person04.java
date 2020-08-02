package com.bmft.yaml.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@PropertySource(value = "classpath:person04.yaml")
public class Person04 {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    private Boolean happy;

    private Date birth;

    private Map<String,Object> maps;

    private List<Object> lists;

    private Dog01回顾 dog;
}
