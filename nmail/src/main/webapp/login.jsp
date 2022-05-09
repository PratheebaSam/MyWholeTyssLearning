<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NMAIL-LOGIN</title>
</head>
<body>
	<h3>NMAIL_LOGIN :)</h3>

	<form action="./loginverification" method="post">
		USERNAME <input type="text" name="username"   > <br> <br>
		PASSWORD <input type="password" name="password"> <br> <br>
		
		<input type="submit" value="LOGIN"  ><br> <br> 
		<a href="./forgetpassword"><input type="button" value="FORGET_PASSCODE"></a> <br> <br> 
		<a href="./signup"><input type="button" value="SIGN_UP"></a> <br> <br> 
	</form>
	 
</body>
</html>