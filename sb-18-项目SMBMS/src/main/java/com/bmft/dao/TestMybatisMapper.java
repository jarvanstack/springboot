package com.bmft.dao;
import com.bmft.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Jarvan
 * @create 2020/8/4 10:01
 */
@Repository
@Mapper //别忘记了这里不然会报错，配置不了
public interface TestMybatisMapper {
    List<User> getUsers();
}
