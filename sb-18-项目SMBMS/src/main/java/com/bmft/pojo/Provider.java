package com.bmft.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Provider {
	//id
	private Integer id;
	//供应商编码
	private String proCode;
	//供应商名称
	private String proName;
	//供应商描述
	private String proDesc;
	//供应商联系人
	private String proContact;
	//供应商电话
	private String proPhone;
	//供应商地址
	private String proAddress;
	//供应商传真
	private String proFax;
	//创建者
	private Integer createdBy;
	//创建时间
	private Date creationDate;
	//更新者
	private Integer modifyBy;
	//更新时间

	
	
}
