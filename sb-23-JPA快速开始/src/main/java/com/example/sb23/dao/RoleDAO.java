package com.example.sb23.dao;

import com.example.sb23.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Jarvan
 * @create 2020/8/16 9:44
 */
@Repository
public interface RoleDAO extends JpaRepository<Role,Integer> {
}
