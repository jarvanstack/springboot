package com.example.sb20.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

/**
 * @Author Jarvan
 * @create 2020/8/7 14:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * 主键自增策略。通过代码层实现
     */
    @TableId(type = AUTO)
    private Integer id;

    private String name;
    private String password;

    /**
     * 标记填充字段，createTime
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 标记填充字段
     * 插入和更新时候更改
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;
    /**
     * version
     *  乐观锁
     */
    @Version
    private int version;
    /**
     * 逻辑删除
     */
    @TableLogic
    private int deleted;
}
