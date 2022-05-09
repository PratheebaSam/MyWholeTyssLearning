package com.tyss.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Employee employee = new Employee(1, "prathi", 30000);
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
//        EntityManager manager = factory.createEntityManager();
//        manager.persist(employee);
//        EntityTransaction transaction = manager.getTransaction();
//        transaction.begin();
//        transaction.commit();
    	Students student = new Students(2, "prathi",99);
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
    	EntityManager manager = factory.createEntityManager();
    	EntityTransaction transaction = manager.getTransaction();
    	manager.persist(student);    	
    	transaction.begin();
    	transaction.commit();
    }
}
