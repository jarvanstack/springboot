package com.bmft.utils;

import com.bmft.pojo.User;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jarvan
 * @create 2020/8/5 17:04
 * 通过传入HttpServletRequest 参数动态返回对应的 map
 */
public class UserToMapUtil {
    public static Map<String, Object> getMap(HttpServletRequest req) throws ParseException {
        String userCode = null;
        String userName = null;
        String userPassword = null;
        String gender = null;
        Date birthday = null;
        String phone = null;
        String address = null;
        String userRole = null;
        String email = null;
        if (StringUtil01.isNotNull(req.getParameter("userCode"))) {
            userCode = req.getParameter("userCode");
        }
        if (StringUtil01.isNotNull(req.getParameter("userName"))) {
            userName = req.getParameter("userName");
        }
        if (StringUtil01.isNotNull(req.getParameter("userPassword"))) {
            userPassword = req.getParameter("userPassword");
        }
        if (StringUtil01.isNotNull(req.getParameter("gender"))) {
            gender = req.getParameter("gender");
        }
        if (StringUtil01.isNotNull(req.getParameter("birthday"))) {
            birthday = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("birthday"));
        }
        if (StringUtil01.isNotNull(req.getParameter("phone"))) {
            phone = req.getParameter("phone");
        }
        if (StringUtil01.isNotNull(req.getParameter("address"))) {
            address = req.getParameter("address");
        }
        if (StringUtil01.isNotNull(req.getParameter("userRole"))) {
            userRole = req.getParameter("userRole");
        }
        if (StringUtil01.isNotNull(req.getParameter("email"))) {
            email = req.getParameter("email");
        }
        User user = null;
        String createdBy = null;
        if (req.getSession().getAttribute(Constant01.username) != null) {
            user = (User) req.getSession().getAttribute(Constant01.username);
            createdBy = "" + user.getId();
        }
        Date creationDate = new Date();
        HashMap<String, Object> map = new HashMap<>();
        map.put("userCode", userCode);
        map.put("userName", userName);
        map.put("userPassword", userPassword);
        map.put("gender", gender);
        map.put("birthday", birthday);
        map.put("phone", phone);
        map.put("address", address);
        map.put("userRole", userRole);
        map.put("email", email);
        map.put("createdBy", createdBy);
        map.put("creationDate", creationDate);

        return map;
    }
}
