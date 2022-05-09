package com.tyss.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class EmployeeInfo {
	@Id
	@Column(name="Employee_Id")
	private int employeeId;
	@Column(name="Employee_Name", length=50)
	private String employeeName;
	@Column(name="Employee_Type", length=50)
	private String employeeType;
	@Column(name="Email",length=100)
	private String email;
	@Column(name="Password",length=50)
	private String password;
	public EmployeeInfo() {
	}
	
	public EmployeeInfo(int employeeId, String employeeName, String employeeType, String email, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "employeeInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeType="
				+ employeeType + ", email=" + email + ", password=" + password + "]";
	}	
}