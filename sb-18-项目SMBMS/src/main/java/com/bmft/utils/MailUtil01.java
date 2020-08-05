package com.bmft.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Author Jarvan
 * @create 2020/8/3 10:04
 */
@Component
public class MailUtil01 {
    private boolean debug = true;
    @Autowired
    JavaMailSenderImpl mailSender;
    /**
     * 配置文件中我的qq邮箱
     */
    @Value("${spring.mail.from}")
    private String from;

    /**
     * 发送文本邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     *  多线程执行@Async
     */
    @Async
    public  void sendSimpleMail(String to, String subject, String content) throws MailException{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(content);
            simpleMailMessage.setFrom(from);
            simpleMailMessage.setTo(to);
            mailSender.send(simpleMailMessage);
    }


    /**
     * 发送带附件的邮件,使用参数可以为空的方法
     * 实现方法的复用，
     *
     * @param to        收件人
     * @param subject   主题
     * @param content   内容
     * @param filePaths 多个附件的地址.可以为空，
     */
    @Async
    public void sendAttachmentsMail(String to, String subject, String content,@Nullable String[] filePaths) throws MessagingException {
        //获取MimeMessage对象
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper;
            messageHelper = new MimeMessageHelper(message, true);
            //邮件发送人
            messageHelper.setFrom(from);
            //邮件接收人
            messageHelper.setTo(to);
            //邮件主题
            messageHelper.setSubject(subject);
            //邮件内容，html格式
            messageHelper.setText(content, true);
            //如果有附件就发送附件
            if (filePaths!=null){
                //遍历附件的数量，添加附件.
                for (int i = 0; i < filePaths.length; i++) {
                    File file = new File(filePaths[0]);
                    messageHelper.addAttachment(file.getName(),file);
                }
            }
            //发送
            mailSender.send(message);

    }
}
