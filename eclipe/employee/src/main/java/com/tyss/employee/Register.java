package com.tyss.employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.database.EmployeeInfo;

public class Register {
	public void register(Scanner sc) {
		System.out.println("Enter the Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter the Employee name");
		String name=sc.next();
		System.out.println("Enter the Employee type");
		String type=sc.next();
		System.out.println("Enter the Email Id");
		String email=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		EmployeeInfo employeeInfo = new EmployeeInfo(id, name, type, email, password);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employeeInfo);
		transaction.commit();
	}
}
