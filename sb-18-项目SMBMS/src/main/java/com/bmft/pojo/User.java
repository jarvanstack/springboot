package com.bmft.pojo;

import com.bmft.utils.DateUtil01;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * @Author Jarvan
 * @create 2020/8/4 10:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
	private Integer id; //id 
	private String userCode; //用户编码
	private String userName; //用户名称
	private String userPassword; //用户密码
	private Integer gender;  //性别
	private Date birthday;  //出生日期
	private String phone;   //电话
	private String address; //地址
	private Integer userRole;    //用户角色的id，
	private Integer createdBy;   //创建者
	private Date creationDate; //创建时间
	private Integer modifyBy;     //更新者
	private Date modifyDate;   //更新时间
	
	private Integer age;//年龄
	
	private String userRoleName;    //用户角色名称


	/**
	 * 通过生日，计算年龄
	 * @return 年龄
	 */
	public Integer getAge() {
		return DateUtil01.getAgeByBirth(birthday);
	}

}
