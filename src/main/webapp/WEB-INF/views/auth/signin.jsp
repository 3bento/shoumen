<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shoumen - signin</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">Turn back :D</a>

	<h3>Sign in - Get inside because that is rainning!!!</h3>
	<form action="${pageContext.request.contextPath}/auth/signin"
		method="POST">
		<div>
			Username: <input type="text" name="username"
				placeholder="What is your username?" />
			<form:errors path="account.username" />
		</div>
		<div>
			Password: <input type="text" name="password"
				placeholder="What is your password?" />
			<form:errors path="account.password" />
		</div>
		<div>
			<input type="submit" value="Sign up" />
		</div>
	</form>
</body>
</html>