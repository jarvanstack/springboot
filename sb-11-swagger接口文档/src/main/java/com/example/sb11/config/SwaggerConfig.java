package com.example.sb11.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

/**
 * @author 嘉文
 */
//注解开启 swagger2 功能
@EnableSwagger2
//注解标示,这是一个配置类,@Configuation注解包含了@Component注解
//可以不用在使用@Component注解标记这是个bean了
@Configuration
//导入SpringMVC配置
@EnableWebMvc
public class SwaggerConfig implements WebMvcConfigurer {
    @Value("bmft")//项目初始目录  一般就是自己springboot启动类的包名
    private String baseLocation;

    /**
     * 重写方法
     * 解决页面惊天页面无法访问的问题
     * 默认地址 http://localhost:8011/bmft/swagger-ui.html
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    @Bean
    public Docket myDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //信息
                .apiInfo(myApiInfo())
                ;
    }

    private ApiInfo myApiInfo(){
        //联系作者
        //Terms of service
        Contact contact = new Contact("嘉文", "https://blog.csdn.net/", "2530196154@qq.com");
        return new ApiInfo(
                "半亩方塘的Swagger",
                "这是Swagger的描述部分",
                "b1.0",
                //团队网站
                "https://blog.csdn.net/",
                contact,
                //证书
                "证书Apache 2.0",
                //证书的跳转的地址
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}

