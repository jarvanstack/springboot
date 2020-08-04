package com.bmft.utils;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author Jarvan
 * @create 2020/8/4 10:10
 */
@Component
public class DateUtil01 {
    /**
     * 通过生日获取年龄工具类。
     * @param birthday 生日
     * @return 年龄
     */

    public static int getAgeByBirth(Date birthday) {
        int age = 0;
        try {
            Calendar now = Calendar.getInstance();
            now.setTime(new Date());// 当前时间

            Calendar birth = Calendar.getInstance();
            birth.setTime(birthday);

            if (birth.after(now)) {//如果传入的时间，在当前时间的后面，返回0岁
                age = 0;
            } else {
                age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
                if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
                    age += 1;
                }
            }
            return age;
        } catch (Exception e) {//兼容性更强,异常后返回数据
            return 0;
        }
    }
}
