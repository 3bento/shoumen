<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment</title>
<script src="resources/js/jquery.min.js"></script>
</head>
<body>
	<a href="${pageContext.request.contextPath}/payments">List of payments</a>
		<a href="${pageContext.request.contextPath}/auth/logout">Logout</a>
	<form action="${pageContext.request.contextPath}/payment" method="post">
		Description: <input value="" type="text" name="description" /></br> Value:
		<input value="" type="text" name="value" /></br> <input type="submit"
			value="registry" />
	</form>
</body>
</html>