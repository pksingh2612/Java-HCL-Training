<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<table border="1">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Age</th>
		<th>Employee Salary</th>
		<th>Employee Department</th>
		<th>Employee Gender</th>
		<th>Employee Date of Join</th>
	</tr>
	<c:forEach items="${empList}" var="empl">
		<tr>
			<td>${empl.empid}</td>
			<td>${empl.name}</td>
			<td>${empl.age}</td>
			<td>${empl.salary}</td>
			<td>${empl.dept}</td>
			<td>${empl.gender}</td>
			<td>${empl.doj}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>