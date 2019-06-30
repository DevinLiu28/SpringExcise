package com.mp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
	
	//主键
	private Long id;
	//姓名
	private String name;
	//年龄
	private Integer age;
	//邮箱
	private String email;
	//直属上级
	private Long managerId;
	//创建时间
	private LocalDateTime createTime;
	

}
