package com.tyss.assign1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Login Form </h1>");
		writer.println("<form action='./first' method='post'>" + "Username		:		"
				+ "<input type='text' name = 'username' placeholder='username'/><br>" + "Password		:		"
				+ "<input type='password' name='password' placeholder='password'/><br>"
				+ "<input type='submit' value ='submit'>" + "</form>");
	}
}
