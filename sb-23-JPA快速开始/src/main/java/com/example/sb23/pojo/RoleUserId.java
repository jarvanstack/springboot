package com.example.sb23.pojo;

import java.io.Serializable;

/**
 * @Author Jarvan
 * @create 2020/8/16 9:35
 * 联合主键id，这是个什么鬼，哎，代码和SQL放到一起，恶心
 */
public class RoleUserId implements Serializable {
    private Long roleId;
    private Long userId;
}
