package com.tyss.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Students find = manager.find(Students.class, 1);
		System.out.println(find);
		find.setMark(89);
		manager.persist(find);
		transaction.begin();
		transaction.commit();
	}
}
