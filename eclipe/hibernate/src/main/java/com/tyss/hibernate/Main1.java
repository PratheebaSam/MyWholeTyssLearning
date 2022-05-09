package com.tyss.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		Laptop laptop = new Laptop(2, "dell","dell");
		Trainee trainee = new Trainee("prathi", 400000, laptop);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(laptop);
		manager.persist(trainee);
		transaction.commit();
	}
}
