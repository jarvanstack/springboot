package com.bmft.sb06.filter;

import com.bmft.sb06.utils.Constant01;
import com.bmft.sb06.utils.StringUtil01;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器,
 */
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        String attribute = (String) request.getSession().getAttribute(Constant01.USERSESSION);
        if (StringUtil01.isNotNull(attribute)){//如果不为空，放行
            flag = true;
        }
        if (!flag) {//如果错误
            request.setAttribute(Constant01.loginMessage, "请重新登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
        }
        return flag;
    }
}
