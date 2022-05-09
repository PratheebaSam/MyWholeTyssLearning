package com.tyss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		writer.println("<h1>Login Form </h1>");
		writer.println("<form action='./home'>" + "Username		:		"
				+ "<input type='text' name = 'username' placeholder='username'/><br>" + "Password		:		"
				+ "<input type='password' name='password' placeholder='password'/><br>"
				+ "<input type='submit' value ='submit'>" + "</form>");
	}

}
