package com.tyss.employee;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager {
	public void leaveRequest(EntityManager manager,EntityManagerFactory factory) {
		SessionFactory factory2 = new Configuration().configure().buildSessionFactory();
		Session session = factory2.openSession();
		List list = session.createQuery("From Leave_Info").list();
		System.out.println("Employee_ID \t Leave_Date \t Leave_Status");
		for (Object object : list) {
			System.out.println(object+"\t");
		}
	}
	
	
	public void manager(Scanner sc) {
		int y;
		do {
		System.out.println("Enter the option \n 1.Show all leave request \n 2.Approve/Reject leave request");
		int x=sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		switch (x) {
		case 1:	
			System.out.println("all leave request is here");
//			Manager manager2 = new Manager();
//			manager2.leaveRequest(manager);
			break;
		case 2:
			System.out.println("Approve/Reject leave request");
			break;
		default:
			System.out.println("enter the correct value");
			break;
		}
		System.out.println("if you want to continue press 1");
		y=sc.nextInt();
		}while(y==1);
	}
}		
