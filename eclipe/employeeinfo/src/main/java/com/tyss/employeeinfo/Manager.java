package com.tyss.employeeinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Manager {
	private void showAllRequest(Scanner scanner,Connection connection) throws Exception {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Leave_Info");
		int employeeId;
		String leaveDate=null;
		String leaveStatus=null;
		while(resultSet.next()) {
			employeeId=resultSet.getInt("Employee_Id");
			leaveDate=resultSet.getString("Leave_Date");
			leaveStatus=resultSet.getString("Leave_Status");
			System.out.println(" Employee_Id:"+employeeId+"\n Leave_Date:"+leaveDate+"\n Leave status:"+leaveStatus);
			
		}
	}
	
	private void editRequest(Scanner scanner,Connection connection) throws Exception {
		System.out.println("Enter Employee Id");
		int id=scanner.nextInt();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Leave_Info");
		int employeeId;
		String leaveDate=null;
		String leaveStatus=null;
		int flag=0;
		while(resultSet.next()) {
			employeeId=resultSet.getInt("Employee_Id");
			leaveStatus=resultSet.getString("Leave_Status");
			if(employeeId==id && (leaveStatus.compareTo("pending")==0 || leaveStatus.compareTo("Pending")==0)) {
				flag=1;
				leaveDate=resultSet.getString("Leave_Date");
				leaveStatus=resultSet.getString("Leave_Status");
				System.out.println(" Employee_Id:"+employeeId+"\n Leave_Date:"+leaveDate+"\n Leave status:"+leaveStatus);
				System.out.println("Enter the status to be applied");
				String status=scanner.next();
				String sql="update Leave_Info set Leave_Status=? where Employee_Id = ? and Leave_Status=?";
				PreparedStatement update = connection.prepareStatement(sql);
				update.setString(1, status);
				update.setByte(2,(byte) employeeId);
				update.setString(3, "pending");
				update.executeUpdate();
				System.out.println("Leave "+status);
			}
		}
		if(flag==0) {
			System.out.println("No leave request applied yet");
		}
	}
	
	
	
	public void manager(Scanner scanner,Connection connection,int employeeid) throws Exception {
		int y;
		do {
			Manager manager = new Manager();
			System.out.println("Enter the option \n\t1.show all leave request\n\t2.Approve/Reject Leave request ");
			int x=scanner.nextInt();
			switch (x) {
			case 1:
				manager.showAllRequest(scanner, connection);
				break;
			case 2:
				manager.editRequest(scanner, connection);
				break;

			default:
				System.out.println("Enter the correct option");
				break;
			}
			System.out.println("if you want to continue enter 1");
			y=scanner.nextInt();
		}while(y==1);
	}
}
