<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<table border="1">
	<tr>
		<th>User Age</th>
	</tr>
	<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.age}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>