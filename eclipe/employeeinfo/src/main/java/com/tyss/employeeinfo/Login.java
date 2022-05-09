package com.tyss.employeeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public void login(Scanner scanner,Connection connection) throws Exception {
		System.out.println("Enter your employee id");
		int id=scanner.nextInt();
		System.out.println("Enter your password");
		String password=scanner.next();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Employee_Info");
		int employeeId=0;
		String employeePassword=null;
		String employeeType=null;
		int flag=0;
		while(resultSet.next()) {
			employeeId=resultSet.getInt("Employee_Id");
			employeePassword=resultSet.getString("Password");			
			if(employeeId==id) {
				flag=1;
				if(employeePassword.compareTo(password)==0) {
					employeeType=resultSet.getString("Employee_Type");
					if(employeeType.compareTo("manager")==0 || employeeType.compareTo("Manager")==0) {
						Manager manager = new Manager();
						manager.manager(scanner, connection, employeeId);
					}else {
						Employee employee = new Employee();
						employee.employeeLeave(scanner, connection,employeeId);
					}					
				}else {
					System.out.println("your password is mismatching");
				}
				break;
			}
						
		}
		if(flag==0) {
			System.out.println("Please enter valid Employee Id");
		}
		
	}
}
