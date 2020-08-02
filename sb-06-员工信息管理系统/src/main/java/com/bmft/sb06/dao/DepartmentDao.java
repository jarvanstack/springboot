package com.bmft.sb06.dao;

import com.bmft.sb06.pojo.Department;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    //使用map模拟数据库
    private static Map<Integer, Department> departments;

    static {
        departments = new HashMap<Integer, Department>();
        departments.put(1,new Department(1,"教学部"));
        departments.put(2,new Department(2,"市场部"));
        departments.put(3,new Department(3,"研发部"));
        departments.put(4,new Department(4,"运营部"));
        departments.put(5,new Department(5,"开发部"));

    }
    //获取所有的的部门的信息
    public Collection<Department> getDepartments(){
        return departments.values();
    }
    //通过id获取部门
    public Department getDepartmentById(int id){
        return departments.get(id);
    }
}
