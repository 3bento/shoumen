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
	<h3>Account - register</h3>
	<form action="${pageContext.request.contextPath}/auth/save"
		method="post">
		Description: <br />${pageContext.request.contextPath}
		<textarea name="description" rows="5" cols="100"></textarea>
		<br /> Value: <br /> <input type="text" name="value" /><br />
		Type: <br /> <select name="type">
			<option value="INFLOW">INFLOW</option>
			<option value="OUTFLOW">OUTFLOW</option>
		</select> <br /> <input type="submit" value="Sign in" />
	</form>
</body>
</html>