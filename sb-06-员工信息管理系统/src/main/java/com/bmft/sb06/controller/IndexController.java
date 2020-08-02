package com.bmft.sb06.controller;

import com.bmft.sb06.dao.DepartmentDao;
import com.bmft.sb06.dao.EmployeeDao;
import com.bmft.sb06.pojo.Department;
import com.bmft.sb06.pojo.Employee;
import com.bmft.sb06.utils.Constant01;
import com.bmft.sb06.utils.StringUtil01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * 方式1.
 */
@Controller
public class IndexController {

    EmployeeDao employeeDao = new EmployeeDao();
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping({"/", "index.html", "/index"})//方式1.
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {
        boolean flag = false;
        if (StringUtil01.isNotNull(username) && StringUtil01.isNotNull(password)) {
            if (password.equals("123456")) {
                model.addAttribute("username", username);
                session.setAttribute(Constant01.USERSESSION, username);
                flag = true;//如果不为空就
            }
        }
        if (flag) {
            return "dashboard";
        } else {
            model.addAttribute("message", "账号或者密码错误");
            return "redirect:/main";
        }

    }

    @RequestMapping({"/main", "/main.html", "/dashboard.html"})
    public String main(HttpSession session, Model model) {
        model.addAttribute("username", session.getAttribute(Constant01.USERNAME));
        return "dashboard";
    }

    @GetMapping({"/emps"})
    public String 员工管理(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        List<Employee> employees1 = new ArrayList<>(employees);
        model.addAttribute("employees", employees1);
        return "emp/list";
    }
//跳转到添加页面
    @GetMapping({"/addEmp"})
    public String 添加员工(Model model) {
//查出所有的部门的信息给员工选择
        Collection<Department> departments = departmentDao.getDepartments();
        ArrayList<Department> departments1 = new ArrayList<>(departments);
        model.addAttribute("departments", departments1);
        return "emp/add";
    }
    //添加页面提交
    @PostMapping({"/addEmp.do"})
    public String 添加页面提交(Model model,Employee employee) {
        boolean flag = false;
        System.out.println("============"+employee);
        flag = employeeDao.insertEm(employee);
        if (!flag){//如果不成功
            System.err.println("========= 失败");
            //查出所有的部门的信息给员工选择
            Collection<Department> departments = departmentDao.getDepartments();
            ArrayList<Department> departments1 = new ArrayList<>(departments);
            model.addAttribute("departments", departments1);
            model.addAttribute("error","添加失败");
            return "emp/add";
        }
        Collection<Employee> employees = employeeDao.getEmployees();
        List<Employee> employees1 = new ArrayList<>(employees);
        model.addAttribute("employees",employees1);
        return "emp/list";
    }

}
