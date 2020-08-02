package com.example.sb10.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Jarvan
 * @date 2020/8/2 9:59
 * 【开启】WebSecurity 模式
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final Log logger = LogFactory.getLog(WebSecurityConfigurerAdapter.class);

    /**
     * 我们直接在父类的方法里CV然后修改
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        logger.debug("子类覆盖父类的配置.");

        http
                .authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3")
        ;
        http.formLogin();//开启自动配置的登录功能，没有权限vip就会跳转到登录页面
        //于是我们在继续给登录者赋予权限
        //开启权限注销
        http.logout().logoutSuccessUrl("/");
        http.csrf().disable();//关闭恶意攻击
        //开启记住我
        http.rememberMe().rememberMeParameter("remember");
        //定制登页面
        http.formLogin()
                //登录页面
                .loginPage("/toLogin")
                //登录表单提交请求
                .loginProcessingUrl("/login")
        .usernameParameter("username")
        .passwordParameter("password");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //新增加了许多加密方式，我们这里使用官方推荐的一种，
        //没有加密访问不了，防止反编译.
        auth.inMemoryAuthentication().
                //半亩方塘
                passwordEncoder(new BCryptPasswordEncoder()).withUser("bmft")
                .password(new BCryptPasswordEncoder().encode("123456")).roles("vip2", "vip3").
                //管理员
                and().withUser("root").password(new BCryptPasswordEncoder().encode("123456")).
                roles("vip1", "vip2", "vip3").
                //普通用户
                and().withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).
                roles("vip1");
    }
}
