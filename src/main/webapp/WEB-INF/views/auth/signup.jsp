<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Shoumen - signup</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">Turn back :D</a>
	<h3>New account only HERE!!!! You are user 1.000.000.000.000</h3>
	<form action="${pageContext.request.contextPath}/auth/signup" method="POST">
		Username: <input type="text" name="username" placeholder="What is your username?" /> <br /> 
		pwd: <input type="text" name="password" placeholder="What is your password?" /> <br />
		<input type="submit" value="Sign up" />
	</form>
</body>
</html>