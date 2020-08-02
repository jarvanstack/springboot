package com.example.sb10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Jarvan
 * @create 2020/8/2 9:36
 */
@Controller
public class Controller01 {
    @RequestMapping({"/", "/login"})
    public String index() {
        return "index";
    }

    @RequestMapping({"/toLogin","/error"})
    public String toLogin() {
        return "views/login";
    }

    /**
     * 用这个方法可以实现复用
     * @param id
     * @return
     */
    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") int id) {
        return "views/level1/" + id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") int id) {
        return "views/level2/" + id;
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") int id) {
        return "views/level3/" + id;
    }
}