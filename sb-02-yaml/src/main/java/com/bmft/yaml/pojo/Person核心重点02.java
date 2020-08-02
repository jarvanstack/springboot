package com.bmft.yaml.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**【这个是核心重点其他是拓展】
 * yaml注册的方式，重要
 * @ConfigurationProperties("person")作用
 * 1.person指向yaml的键值
 * 2.将yaml配置文件中的每一个属性注入到这个组件中
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//注册bean
@ConfigurationProperties("person")//【重要】指向yaml的键值
public class Person核心重点02 {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog01回顾 dog;

}
