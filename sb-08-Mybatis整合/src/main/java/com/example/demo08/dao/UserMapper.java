package com.example.demo08.dao;

import com.example.demo08.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;




@Repository
@Mapper
public interface UserMapper {
    /**
     *
     * @return
     */
    List<User> selectUsers();
}
