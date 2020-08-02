package com.bmft.sb06.dao;

import com.bmft.sb06.pojo.Department;
import com.bmft.sb06.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    //模拟数据库
    private static Map<Integer, Employee> employees;
    @Autowired
    private DepartmentDao departmentDao;
    private static int id = 105;
    private static int emplId = 105;

    public EmployeeDao() {
        System.out.println(new DepartmentDao().getDepartmentById(1));

        employees = new HashMap<Integer, Employee>();
        employees.put(1, new Employee(101, "AA", "25301fa96154@qq.com", 0, new DepartmentDao().getDepartmentById(1), new Date()));
        employees.put(2, new Employee(102, "bb", "25301dff96154@qq.com", 1, new DepartmentDao().getDepartmentById(2), new Date()));
        employees.put(3, new Employee(103, "cc", "2530196154@qq.com", 0, new DepartmentDao().getDepartmentById(3), new Date()));
        employees.put(4, new Employee(104, "dd", "2530196fs154@qq.com", 1, new DepartmentDao().getDepartmentById(4), new Date()));
        employees.put(5, new Employee(105, "33", "25301fa96154@qq.com", 1, new DepartmentDao().getDepartmentById(5), new Date()));

    }


    //增
    public boolean insertEm(Employee employee) {
        employee.setId(emplId++);
        Employee put = employees.put(id++, employee);
        return true;
    }

    //删除
    public boolean deleteById(int id) {
        Employee remove = employees.remove(id);
        return remove != null;
    }
    //改

    //查
    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    public Employee getEmployeeById(int Id) {
        return employees.get(id);
    }
}
