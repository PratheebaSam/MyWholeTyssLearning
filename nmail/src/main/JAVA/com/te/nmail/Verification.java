package com.te.nmail;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Verification extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter wr = resp.getWriter();
		 
		if (req.getParameter("password").compareTo(req.getParameter("c_password"))!=0) {
			wr.println("<html><h2>passcode mismatch</h2>"+"<button type='button' name='back' onclick='history.back()'>BACK</button>");
		}
		else {
			User u = new User();
			u.setUsername(req.getParameter("username"));
			u.setEmail_id(req.getParameter("email_id")+"@nmail.com");
			u.setPass(req.getParameter("password"));
			u.setAnswer(req.getParameter("answer"));
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_info");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tran = em.getTransaction();
			try {
			em.persist(u);
			tran.begin();
			tran.commit();
			wr.println("<html><h1>REGISTRATION_SUCCESSFULL</h1></html>");
			wr.println("<br><br><a href='./login'>LOGIN</a>");
			} catch ( RollbackException e) {
				 wr.print("<html><h2>USERNAME OR EMAIL_ID ALREADY EXCIST</h2>"
				 		+ "<button type='button' name='back' onclick='history.back()'>BACK</button>");
			}
			
			
		}
		
		
		
	}
}
