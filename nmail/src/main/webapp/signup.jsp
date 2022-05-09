<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NMAIL-SIGNUP</title>
</head>
<body>
	<h2>NMAIL_REGISTRATION</h2>
	<form action="./Verification" method="post">
		FULLNAME :<input type="text" name="username" style="margin-left: 80px"><br><br> 
		
		AGE:<input type="number" name="age"style="margin-left: 138px"><br> <br> 
		
		EMAIL_ID: <input type="text" name="email_id" style="margin-left: 90px">@nmail.com<br><br> 
		
		PHONE NUMBER :<input type="number" name="phone_number" style="margin-left: 41px"><br> <br> 
		
		PASSWORD :<input type="password" name="password"  style="margin-left: 82px" onclick=""><br><br> 
		
		CONFRIM_PASSWORD :<input type="password" name="c_password" style="margin-left: 2px"><br> <br>
		
	 	SECURITY QUESTION :<br>FAVORITE PET:<input type="text" name="answer" size="10" style="margin-left: 70px"><br><br>

		
		<input type="submit" value="register" style="margin-left: 290px">
		


	</form>

</body>
</html>