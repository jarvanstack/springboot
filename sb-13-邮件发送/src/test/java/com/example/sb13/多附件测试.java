package com.example.sb13;

import com.example.sb13.utils.MailUtilImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Jarvan
 * @create 2020/8/3 11:15
 */
@SpringBootTest
public class 多附件测试 {
    @Autowired
    MailUtilImpl mailUtil;
    @Test
    public void test(){
        String html = "<h1 style='color:red'>半亩方塘一鉴开</h1>";
        ArrayList<String> paths = new ArrayList<String>();
        paths.add("D:\\Enviroment\\java\\SpringBoot\\sb-13-邮件发送\\src\\main\\resources\\application.yaml");
        paths.add("D:\\Enviroment\\java\\SpringBoot\\sb-13-邮件发送\\src\\main\\resources\\application-qq.yaml");
        boolean html邮件 = mailUtil.sendAttachmentsMail("2530196154@qq.com", "多附件测试",
                html,paths.toArray(new String[paths.size()]));
        System.err.println("===============");
        System.err.println(html邮件);
    }
}
