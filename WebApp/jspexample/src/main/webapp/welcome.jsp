<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="javax.servlet.http.Cookie"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- Generate Cookie from the Input --%>
	<% String s = request.getParameter("username"); 
	Cookie c = new Cookie("username",s);
	response.addCookie(c);
	%>

	<h2>
		Welcome
		<%=s%>
	</h2>
	<form action="./message" method="post">
		<input type="text" name="message"> <input type="submit"
			value="send">
	</form>
</body>
</html>