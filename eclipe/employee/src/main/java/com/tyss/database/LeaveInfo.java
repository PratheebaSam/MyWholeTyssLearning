package com.tyss.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leave_Info")
public class LeaveInfo {
	@Id
	@Column(name="Employee_Id")
	private int employeeId;
	@Column(name="Leave_Date",length=50)
	private String leaveDate;
	@Column(name="Leave_Status",length=50)
	private String leaveStatus;
	public LeaveInfo() {
		
	}
	public LeaveInfo(int employeeId, String leaveDate, String leaveStatus) {
		super();
		this.employeeId = employeeId;
		this.leaveDate = leaveDate;
		this.leaveStatus = leaveStatus;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	@Override
	public String toString() {
		return "LeaveInfo [employeeId=" + employeeId + ", leaveDate=" + leaveDate + ", leaveStatus=" + leaveStatus
				+ "]";
	}
	
	
}
