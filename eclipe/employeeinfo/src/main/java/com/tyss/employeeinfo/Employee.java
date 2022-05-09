package com.tyss.employeeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	private void showLeaveRequest(int id,Connection connection) throws Exception {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Leave_Info");
		int employeeId;
		String leaveDate=null;
		String leaveStatus=null;
		int flag=0;
		while(resultSet.next()) {
			employeeId=resultSet.getInt("Employee_Id");
			if(employeeId==id) {
				flag=1;
				leaveDate=resultSet.getString("Leave_Date");
				leaveStatus=resultSet.getString("Leave_Status");
				System.out.println(" Employee_Id:"+employeeId+"\n Leave_Date:"+leaveDate+"\n Leave status:"+leaveStatus);
			}
		}
		if(flag==0) {
			System.out.println("No leave request applied yet");
		}		
	}	
	private void createLeaveRequest(Scanner scanner,Connection connection,int id) throws Exception {
		System.out.println("Enter the leave date");
		String date=scanner.next();
		String status="Pending";
		String sql="insert into Leave_Info values(?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setByte(1,(byte) id);
		statement.setString(2, date);
		statement.setString(3, status);
		statement.executeUpdate();
		System.out.println("Leave applied");
	}	
	public void employeeLeave(Scanner scanner,Connection connection,int employeeId) throws Exception {
		int y;
		do {
			Employee employee = new Employee();
			System.out.println("Enter the option \n 1.show all leave request\n 2.create new leave request");
			int x=scanner.nextInt();
			switch (x) {
			case 1:				
				employee.showLeaveRequest(employeeId, connection);
				break;
			case 2:
				employee.createLeaveRequest(scanner, connection, employeeId);
				break;
			default:
				System.out.println("enter the correct option");
				break;
			}
			System.out.println("if you want to continue enter 1");
			y=scanner.nextInt();			
		}while(y==1);
	}
}
