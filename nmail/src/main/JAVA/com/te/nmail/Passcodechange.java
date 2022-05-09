package com.te.nmail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Passcodechange extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		int id = -1;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_info");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trn = em.getTransaction();
		
		Query query = em.createQuery(" select id from User where username=:text");
		
		try {
			
			id = (int) query.setParameter("text", req.getParameter("username")).getResultList().get(0);
			
			User user = em.getReference(User.class, id);

			if (req.getParameter("answer").compareToIgnoreCase(user.getAnswer()) == 0) {

				 
				if (req.getParameter("npass").compareTo(req.getParameter("rpass")) == 0) {
					em.remove(user);
					trn.begin();
					user.setPass(req.getParameter("npass"));
					em.persist(user);
					trn.commit();
					w.println("<html><h2>PASSWORD CHANGE SUCCESSFULL<h2><html>");
					w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
				}

			 else {
				w.println("<html><h1>password mismatch :(</h1></html>");
				w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
			}
		}
			else {
				w.println("<html><h1>SEQURITY VERIFICATION FAILED</h1></html>");
				w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
			}
		} catch (IndexOutOfBoundsException e) {
			w.println("<html ><h1>id not found :( </h1></html>");
			w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
			w.println("<a href='./signup'><input type='button' value='register'></a>");
		}
	}

}
