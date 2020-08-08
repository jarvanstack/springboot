package com.bmft.controller;

import com.bmft.pojo.User;
import com.bmft.service.UserService;
import com.bmft.service.UserServiceImpl;
import com.bmft.utils.Constant01;
import com.bmft.utils.MailUtil01;
import com.bmft.utils.RandomUtil01;
import com.bmft.utils.UserToMapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jarvan
 * @create 2020/8/4 19:05
 */
@Controller
public class Controller01 {

    @Autowired
    private UserService userService;
    @Autowired
    MailUtil01 mailUtil01;

    @ResponseBody
    @PostMapping("/sendPhrase")
    public String sendPhrase(HttpServletRequest req) {
        String email = req.getParameter("email");
        //获得随机数
        String randomNumCode = RandomUtil01.getRandomNumCode(4);
        //发送验证码
        try {
            mailUtil01.sendAttachmentsMail(email, "半亩方塘注册验证码", "验证码为: <h1><a style='color:blue;'>"+randomNumCode+"</a></h1>",null);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "发送失败请重试";
        }
        //储存验证码到session
        req.getSession().setAttribute(Constant01.phrase, randomNumCode);

        return "发送成功，请查收";
    }

    @GetMapping("/addUser")
    public String addUserPage() {
        return "user/add";
    }


    @PostMapping({"/addUser.do"})
    public String addUser(Model model, HttpServletRequest req) {
        boolean flag = false;
        Map<String, Object> map = null;
        try {
            map = UserToMapUtil.getMap(req);
        } catch (ParseException e) {
            e.printStackTrace();
            model.addAttribute("error", "添加失败请重试");
            return "user/add";
        }

        flag = userService.addUser(map) > 0;

        if (flag) {
            model.addAttribute("message", "添加成功");
            return "redirect:userList";
        }
        model.addAttribute("error", "添加失败请重试");
        return "user/add";
    }

    @RequestMapping({"/userList"})
    public String userList(Model model) {
        model.addAttribute("userList", userService.selectUsers());
        return "user/list";
    }

    @RequestMapping({"/login", "/"})
    public String login() {

        return "login";
    }


    @PostMapping("/login.do")
    public String doLogin(HttpServletRequest req, Model model) {


        boolean flag = false;
        String userCode = req.getParameter("userCode");
        String userPassword = req.getParameter("userPassword");
        HashMap<String, Object> map = new HashMap<>();
        map.put("userCode", userCode);
        map.put("userPassword", userPassword);
        User l = userService.login(map);
        if (l != null) {
            flag = true;
        }
        if (flag) {
            //成功
            //设置用户名，保存session
            req.getSession().setAttribute(Constant01.userSession, l);
            model.addAttribute(Constant01.username, l.getUserName());
            //只有重定向到拧另外一个controller，然后在转发到HTML才能访问templates 下的动态页面.
            return "redirect:index";
        }
        //返回错误信息
        model.addAttribute("error", "账号或者密码错误");
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpServletRequest req, Model model) {
        return "index";
    }


    @PostMapping("/signIn.do")
    public String doSignIn(HttpServletRequest req, Model model) {
        boolean flag = false;

        //获取session的验证码
        Object attribute = req.getSession().getAttribute(Constant01.phrase);
        if (attribute != null) {
            //表单获取验证码
            String phrase = req.getParameter("phrase");

            //验证成功才继续
            if (phrase.equals(attribute)) {
                Map<String, Object> map = null;
                try {
                    map = UserToMapUtil.getMap(req);
                } catch (ParseException e) {
                    e.printStackTrace();
                    model.addAttribute("error", "注册失败");
                    return "login";
                }
                int i = userService.signIn(map);
                if (i > 0) {
                    flag = true;
                }
                if (flag) {
                    //传递username 这里constant 的值是 username ，前端就用这个接受
                    model.addAttribute("username", map.get("userName"));
                    return "login";
                }
            }
        }

        model.addAttribute("error", "注册失败");
        return "login";
    }


}

















