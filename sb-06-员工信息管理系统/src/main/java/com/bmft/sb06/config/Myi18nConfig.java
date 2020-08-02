package com.bmft.sb06.config;
import com.bmft.sb06.utils.StringUtil01;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Component
//可以在链接上携带区域信息
public class Myi18nConfig implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault(); // 如果没有获取到就使用系统默认的
        //如果请求链接不为空
        if (StringUtil01.isNotNull(language)){
            //分割请求参数
            String[] split = language.split("_");
            //国家，地区
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse httpServletResponse, Locale locale) {
        System.out.println("=========in2==========");
        String language = request.getParameter("l");
        Locale locale1 = Locale.getDefault(); // 如果没有获取到就使用系统默认的
        //如果请求链接不为空
        if (StringUtil01.isNotNull(language)){
            //分割请求参数
            String[] split = language.split("_");
            //国家，地区
            locale1 = new Locale(split[0],split[1]);
        }
        Locale.setDefault(locale);
    }
}