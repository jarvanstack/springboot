package com.example.sb23.dao;

import com.example.sb23.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/15 20:33
 */
public interface UserDAO extends JpaRepository<User,Long> {
    User getUserByAccount(String account);
    @Query("SELECT U.* FROM AUTH_USER U ,AUTH_ROLE_USER RU WHERE U.id = RU.user_id AND RU.role_id = :roleId")
    List<User> findUsersByRole(@Param("roleId") Long roleId);
}
