package com.example.sb13;

import com.example.sb13.utils.MailUtilImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jarvan
 * @create 2020/8/3 10:45
 */
@SpringBootTest
public class Html邮件 {
    @Autowired
    MailUtilImpl mailUtil;
    @Test
    public void test(){
        String html = "<h1 style='color:red'>半亩方塘一鉴开</h1>";
        boolean html邮件 = mailUtil.sendAttachmentsMail("2530196154@qq.com", "Html邮件", html,null);
        System.err.println("===============");
        System.err.println(html邮件);
    }
}
