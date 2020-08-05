package com.bmft.filter;

import com.bmft.utils.Constant01;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Jarvan
 * @create 2020/8/5 18:56
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //return true 是放行。
        Object attribute = request.getSession().getAttribute(Constant01.username);
        if (attribute != null) {
            return true;
        }
        //这个提示信息展示不了可以试试url传递参数，啥的.能用现在先不管.我们看看其他开源项目.
        request.setAttribute("message","请登录再继续访问");
        //动态templates 需要转发调用controller才能访问.转发.到controller
        request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }
}
