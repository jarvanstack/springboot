package com.bmft.sb06.config;

import com.bmft.sb06.filter.LoginIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 首页建议使用自定义配置方式 2
 * 继承WebMvcConfigurer web配置器即可
 *
 * 装配Bean国际化
 */
@Configuration
//@EnableAutoConfiguration 不要使用这个会全面接管，配置
public class MyIndexConfig implements WebMvcConfigurer {
    /**
     * 登录 映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");//如果空就index\
        registry.addViewController("/index.html").setViewName("index");//
        registry.addViewController("/index").setViewName("index");//
        //同样的你可以再IndexController使用数组达到上面的效果
        //    @RequestMapping({"/","index.html","/index"})
    }

    /**
     * 国际化 bean
     * @return
     */
    //用@Bean将自定义的国际化注册进来
    @Bean //加上这个类里@Component也行,不行，这种覆盖式的必须在配置类中写
    //注意注意，这里要用接口名称，这里要用接口名称，这里要用接口名，这里要用接口名
    //这里要用接口名称，这里要用接口名称，接口名称，localeResolver localeResolver localeResolver！！
    //不然方法都进不去，不然方法都进不去，不然方法都进不去，不然方法都进不去.
    public LocaleResolver localeResolver(){
        return new Myi18nConfig();
    }
    /**
     * 实现方法：addInterceptors
     * 添加拦截器和拦截对象不拦截对象
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercepter())
                .addPathPatterns("/**")//所有资源都拦截，其实也可放到sys目录下
                .excludePathPatterns("/index.html","/","/css/**","/js/**",
                        "/img/**","/login");//放行的资源
    }
}
