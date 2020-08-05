package com.bmft;

import com.bmft.utils.MailUtil01;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/5 20:45
 */
@SpringBootTest
public class 邮件发送 {
    @Autowired
    MailUtil01 mailUtil01;

    /**
     * 这个是测试不了的，执行后程序会退出，后台还在么？不知道
     */
    @Test
    public void test(){

        mailUtil01.sendSimpleMail("bmft.rola@qq.com", "你好", "测试邮件发送");
        System.out.println("==========================");

    }

}
