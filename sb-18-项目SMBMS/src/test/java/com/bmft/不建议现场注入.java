package com.bmft;

import com.bmft.pojo.User;
import com.bmft.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/6 9:39
 * 警告提示
 * Field injection is not recommended
 * 不建议现场注入，于是自动使用构造方法注入
 * 1.我们测试是否有效 userService
 * java.lang.NullPointerException 空指针异常
 * 2.我们加入SBT在试试
 * The bean 'userServiceImpl' could not be injected as a 'com.bmft.service.UserServiceImpl' because it is a JDK dynamic proxy that implements:
 * com.bmft.service.UserService
 * java.lang.IllegalStateException: Failed to load ApplicationContext
 * Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException:
 * Error creating bean with name 'controller01':
 * Unsatisfied dependency expressed through field 'userService';
 * nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'userServiceImpl'
 * is expected to be of type 'com.bmft.service.UserServiceImpl' but was actually of type 'com.sun.proxy.$Proxy70'
 * 3.别人my-site网站是使用的接口就是接口没有service，自动注入都在现场进行
 * 4.正确的流程是在 service接口里不加@Service注解，在ServiceImpl加@Service注解并字段注入Mapper
 * controller访问的时候注入接口而不是实现类
 * @AutoWired UserService userService
 */
@SpringBootTest
public class 不建议现场注入 {

    @Autowired
    UserService userService;


    @Test
    public void test() {
        User user = userService.selectUserById("1");
        System.out.println(user);
    }

}
