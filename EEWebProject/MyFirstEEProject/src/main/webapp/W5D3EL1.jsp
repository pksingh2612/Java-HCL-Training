<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("mark1",56); %>
	<%= request.getAttribute("mark1") %> <br/>
	
	${requestScope.mark1} <br/>
	
	<% session.setAttribute("mark2",76); %>
	<%= session.getAttribute("mark2") %> <br/>
	
	${sessionScope.mark2} <br/>
	
	<% application.setAttribute("mark3",45); %>
	<%= application.getAttribute("mark3") %> <br/>
	
	${applicationScope.mark3} <br/>
	
	<% pageContext.setAttribute("mark4",78); %>
	<%= pageContext.getAttribute("mark4") %> <br/>
	
	${pageScope.mark4}
</body>
</html>