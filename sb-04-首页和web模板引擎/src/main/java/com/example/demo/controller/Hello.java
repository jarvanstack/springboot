package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Component//这个有啥用来着？？标志组件，如果没有能用不？
// 不要也能用？参考 4种标记组件的区别
@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","hello Thymeleaf");
        return "hello";
    }
}
