package com.tyss.employeeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	public void register(Scanner sc,Connection connection) throws Exception {
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Employee_Info");
		int employeeId;
		while(resultSet.next()) {
			employeeId=resultSet.getInt("Employee_Id");
			if(employeeId==id) {
				System.out.println("Employee id is already exist");
				return ;
			}
		}
		System.out.println("Enter the Employee name");
		String name=sc.next();
		System.out.println("Enter the Employee type");
		String type=sc.next();
		System.out.println("Enter the Email Id");
		String email=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		String sql="insert into Employee_Info(Employee_Id,Employee_Name,Employee_Type,Email,Password) values(?,?,?,?,?) ";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setByte(1, (byte) id);;
		insert.setString(2, name);
		insert.setString(3, type);
		insert.setString(4, email);
		insert.setString(5, password);
		insert.executeUpdate();
		System.out.println("Your data successfully added to the Employee Informations");
	}
}
