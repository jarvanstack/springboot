package com.example.sb13;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Sb13ApplicationTests {

    //邮件发送的主要对象
    @Autowired
    private JavaMailSenderImpl mailSender;
    /**
     * 简单的邮件发送
     */
    @Test
    void test01() {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("简单的邮件的题目");
        simpleMailMessage.setText("简单的邮件的内容");
        simpleMailMessage.setFrom("2160149069@qq.com");
        simpleMailMessage.setTo("2160149069@qq.com");
        mailSender.send(simpleMailMessage);

    }
    @Test
    void test02() {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("简单的邮件的题目");
        simpleMailMessage.setText("简单的邮件的内容");
        simpleMailMessage.setFrom("2530196154@qq.com");
        simpleMailMessage.setTo("2530196154@qq.com");
        mailSender.send(simpleMailMessage);

    }

}
