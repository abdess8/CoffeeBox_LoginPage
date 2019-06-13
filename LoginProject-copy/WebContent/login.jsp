<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Pizza Delivery - Login Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
			<div class="loginBox">
			<img src="admin.png" class="user">
			<h2>Login Form</h2>
			<form action="${pageContext.request.contextPath}/login" method="post">
				<p>Username</p>
				<input type="text" name="username" placeholder="Enter Username" required>
				<p>Password</p>
				<input type="password" name="password" placeholder="***********" required>
				<input type="submit" value="Sign In">	
			</form>
		</div>
	</body>
</html>