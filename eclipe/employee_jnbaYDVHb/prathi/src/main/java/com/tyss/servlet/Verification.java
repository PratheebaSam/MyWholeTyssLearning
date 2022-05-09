package com.tyss.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Verification extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter wr = resp.getWriter();
			Name u = new Name();
			u.setUsername(req.getParameter("username"));
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_info");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tran = em.getTransaction();
			em.persist(u);
			tran.begin();
			tran.commit();
			wr.println("REGISTRATION SUCCESSFULL");
		
		
		
	}
}
