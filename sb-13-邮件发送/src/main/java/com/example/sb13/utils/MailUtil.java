package com.example.sb13.utils;

import org.springframework.lang.Nullable;

/**
 * @Author Jarvan
 * @create 2020/8/3 10:04
 */
public interface MailUtil {

    /**
     * 发送文本邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    public boolean sendSimpleMail(String to, String subject, String content);


    /**
     * 发送带附件的邮件，使用参数可以为空的方式，实现方法复用,.
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     * @param filePaths 多个附件的地址.
     */
    public boolean sendAttachmentsMail(String to, String subject, String content,@Nullable String[] filePaths);
}
