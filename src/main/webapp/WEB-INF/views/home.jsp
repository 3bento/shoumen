<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shoumen - homepage</title>
</head>
<body>
	Hello world with Spring!!!
	<div>
		<a name="toSignUp" href="${pageContext.request.contextPath}/auth/signup">Join us dude!!</a>
	</div>
	<div>
		<a name="toSignIn" href="${pageContext.request.contextPath}/auth/signin">Get inside,
			today is rainning!!!</a>
	</div>
</body>
</html>