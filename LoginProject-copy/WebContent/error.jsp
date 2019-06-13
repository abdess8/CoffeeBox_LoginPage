<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Error 404 - Pizza Delivery</title>
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
			<h3>Password or Username invalid!</h3>
		</div>
</body>
</html>