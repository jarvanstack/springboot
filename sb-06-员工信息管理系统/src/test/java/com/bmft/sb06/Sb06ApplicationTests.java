package com.bmft.sb06;

import com.bmft.sb06.dao.DepartmentDao;

import com.bmft.sb06.dao.EmployeeDao;
import com.bmft.sb06.pojo.Employee;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Date;

@SpringBootTest
class Sb06ApplicationTests {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    @Test
    void contextLoads() {

    }

}
