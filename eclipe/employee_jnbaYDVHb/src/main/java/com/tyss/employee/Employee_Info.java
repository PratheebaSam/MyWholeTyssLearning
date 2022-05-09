package com.tyss.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.type.TrueFalseType;

@Entity
public class Employee_Info {
	@Id
	private int Employee_ID;
	@Column (nullable=true,length=50 )
	private String Employee_Name;
	@Column()
	private String Employee_Type;
	private String Email;
	private String password;
	
}