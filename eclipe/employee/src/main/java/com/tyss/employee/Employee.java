package com.tyss.employee;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.database.EmployeeInfo;
import com.tyss.database.LeaveInfo;

public class Employee {
	public void leaveRequest(Scanner sc) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		System.out.println("Enter your Id");
		int employeeId=sc.nextInt();
		Query query = manager.createQuery("from Employee_Info");
//		List<EmployeeInfo> list=
//		
//		for (Object object : employeeList) {
//			System.out.println(object);
//		}
		
		
		System.out.println("Enter the Date");
		String leaveDate=sc.next();
		String leaveStatus="pending";
		LeaveInfo leaveInfo = new LeaveInfo(employeeId, leaveDate, leaveStatus);
		manager.persist(leaveInfo);
		transaction.commit();		
	}
	
	
	public void employee(Scanner sc) {
		int y;
		do {
			System.out.println("Enter the option \n 1.show all leave request\n 2.request for a leave");
			int x=sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("leave request");
				break;
			case 2:
				Employee employee = new Employee();
				employee.leaveRequest(sc);

			default:
				System.out.println("enter the correct number");
				break;
			}
			System.out.println("do you want to continue press 1");
			y=sc.nextInt();
		}while(y==1);
	}
}
