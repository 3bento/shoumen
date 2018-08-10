<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shoumen - homepage</title>
<script src="resources/js/jquery.min.js"></script>
</head>
<body>
	<a href="${pageContext.request.contextPath}/payment">Registry payment page</a>
	<a href="${pageContext.request.contextPath}/payments">List of payments</a>

	<h1>Welcome to your home, :D</h1>

<%-- 	Hello world with Spring!!!
	<div>
		<a name="toSignUp" href="${pageContext.request.contextPath}/auth/signup">Join us dude!!</a>
	</div>
	<div>
		<a name="toSignIn" href="${pageContext.request.contextPath}/auth/signin">Get inside,
			today is rainning!!!</a>
	</div> --%>
</body>
</html>