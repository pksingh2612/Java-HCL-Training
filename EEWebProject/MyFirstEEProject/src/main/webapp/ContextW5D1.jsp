<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= application.getInitParameter("zipcode") %><br/>
	<%= application.getInitParameter("department")  %><br/>
	<% application.setAttribute("mark2",67);  %><br/>
	<a href="/MyFirstEEProject/configW5D1.jsp">Click here</a>
</body>
</html>