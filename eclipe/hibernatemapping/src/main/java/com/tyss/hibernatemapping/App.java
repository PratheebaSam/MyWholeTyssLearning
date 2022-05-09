package com.tyss.hibernatemapping;

import java.util.Arrays;

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
        User prathi= new User();
        prathi.setName("Prathi");
        prathi.setMailid("prathi@gmail.com");
        
        User sam = new User();
        sam.setName("sam");
        sam.setMailid("sam@gmail.com");
        
        Apps whatsapp = new Apps();
        whatsapp.setId(1);
        whatsapp.setAppName("whatsapp");
        whatsapp.setUsers(Arrays.asList(prathi,sam));
        
        Apps insta = new Apps();
        insta.setId(2);
        insta.setAppName("instagram");
        insta.setUsers(Arrays.asList(prathi,sam));
        
        prathi.setApps(Arrays.asList(whatsapp,insta));
        sam.setApps(Arrays.asList(whatsapp,insta));
        
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manytomany");
        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        System.out.println(transaction.isActive());
        manager.persist(prathi);
        manager.persist(sam);
        transaction.commit();
        
        
        
        
        
    }
}
