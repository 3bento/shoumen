<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payments</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">Main page</a> / 
	<a href="${pageContext.request.contextPath}/payment">Registry payment page</a>
	<table>
		<tr>
			<th>Description</th>
			<th>Value</th>
		</tr>
		<c:forEach items="${payments}" var="payment">
			<tr>
				<td>${payment.description}</td>
				<td>${payment.value}</td>
				<%-- i will implement it ;D
				<td><a href="${pageContext.request.contextPath}/edit">edit</a></td>
				<td><a href="${pageContext.request.contextPath}/delete">delete</a></td> 
				--%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>