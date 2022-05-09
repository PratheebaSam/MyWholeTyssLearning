package com.tyss.assign1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = null;
		Cookie[] cookies = req.getCookies();
		PrintWriter writer = resp.getWriter();
		writer.println("Welcome " + cookies[0].getName());
	}
}
