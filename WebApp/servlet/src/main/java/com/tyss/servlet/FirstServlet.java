package com.tyss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		writer.println("<h1>Good Morning H1</h1>");
		writer.println("<h2>Good Morning H2</h2>");
		writer.println("<h3>Good Morning H3</h3>");
		writer.println("<h4>Good Morning H4</h4>");
		writer.println("<h5>Good Morning H5</h5>");
		writer.println("<h6>Good Morning H6</h6>");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
	}

}
