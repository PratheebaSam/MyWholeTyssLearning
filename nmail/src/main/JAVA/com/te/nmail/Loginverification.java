package com.te.nmail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Loginverification extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		int id = -1;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_info");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery(" select id from User where username=:text");
		try {
			id = (int) query.setParameter("text", req.getParameter("username")).getResultList().get(0);
			if (req.getParameter("password").compareTo(em.getReference(User.class, id).getPass()) == 0) {
				Cookie c = new Cookie("username", req.getParameter("username"));
				Cookie c2 = new Cookie("namil_id",em.getReference(User.class, id).getEmail_id() );
				resp.addCookie(c);
				resp.addCookie(c2);
				resp.sendRedirect("./inbox");
			} else {
				w.println("<html><h1>password mismatch :(</h1></html>");
				w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
			}
		} catch (IndexOutOfBoundsException e) {
			w.println("<html><h1>id not found :( </h1></html>");
			w.println("<a href='./signup'><input type='button' value='register'></a>");
			w.println("<button type='button' name='back' onclick='history.back()'>BACK</button>");
			 
		}

	}

}
