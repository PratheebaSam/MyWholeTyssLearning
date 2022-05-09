<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%-- Page Directory Tag --%>
<%@page import="javax.servlet.http.Cookie"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Get Cookie from the Browser --%>
	<%Cookie[] cookies = request.getCookies();%>
	<%String msg = request.getParameter("message");%>
	<h2>
		Sent by
		<%=cookies[1].getValue()%>
	</h2>
	<h2>
		Message is
		<%=msg%>
	</h2>
</body>
</html>