package com.example.sb23.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author Jarvan
 * @create 2020/8/16 9:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auth_role")
public class Role implements Serializable {

    @Id
    private int id;
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String note;
}
