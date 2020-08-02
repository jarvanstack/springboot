package com.bmft.sb06.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Employee {
    private int id;
    private String lastName;
    private String email;
    private int gender; // 0 是女 1 是男，生动形象
    private Department department;
    private int departmentID;
    private Date birth;

    public Employee(int id, String lastName, String email, int gender, Department department,Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date(System.currentTimeMillis());
        departmentID = department.getId();
    }
}
