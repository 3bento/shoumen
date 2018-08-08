<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payments</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">Main page</a> /
	<a href="${pageContext.request.contextPath}/payment">Registry
		payment page</a>
	<table>
		<tr>
			<th>Description</th>
			<th>Value</th>
			<th>Pay</th>
			<th>Date time</th>
		</tr>
		<c:forEach items="${payments}" var="payment">
			<tr>
				<td>${payment.description}</td>
				<td>${payment.value}</td>
				<td id="payment_${payment.uuid}"><c:if
						test="${payment.pay eq false}">Not paid</c:if> <c:if
						test="${payment.pay eq true }">Paid</c:if></td>
				<td><fmt:formatDate value="${payment.paymentDate.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a
					href="${pageContext.request.contextPath}/pay?uuid=${payment.uuid}">pay</a></td>
				<td><a
					href="${pageContext.request.contextPath}/remove?uuid=${payment.uuid}">remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>