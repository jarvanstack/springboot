package com.example.sb13;

import com.example.sb13.utils.MailUtilImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @Author Jarvan
 * @create 2020/8/3 10:13
 * 测试成功，注意地址别写错了，不然会退回邮件。
 */
@SpringBootTest
public class 邮件发送接口02 {
    @Autowired
    MailUtilImpl mailUtil;
    @Test
    public void test(){
        mailUtil.sendSimpleMail("2530196154@qq.com","邮件发送接口02","半亩方塘一鉴开");
    }
}
