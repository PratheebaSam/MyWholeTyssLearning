<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORGET_PASSWORD</title>
</head>
<body>
	<h1>NMAIL_FORGET_PASSWORD</h1>
	<form action="./passcodechange" method="post">
        USERNAME :<input type="text" name="username" style=" margin-left: 150px"><br><br>
		WHICH IS YOUR FAVORITE PET : <input type="text" name="answer"  ><br><br>
		ENTER THE NEW PASSWORD<input type="password" name="npass" style=" margin-left: 32px"><br><br>
		RE-ENTER THE NEW PASSWORD<input type="password" name="rpass" style=" margin-left: 10px"><br><br>
		<input type="submit"  value="submit" >
		<br>
		<br>
	</form>

</body>
</html>