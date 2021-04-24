<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= config.getInitParameter("qualification") %><br/>
	<% String st=config.getInitParameter("department");
	out.println(st);
	%>
	<br/>
	<%=application.getAttribute("mark2")%>
</body>
</html>