<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Welcome to JSP</h1>
	<% 
	 	Cookie c = new Cookie("MyCookie","Sam");
	    response.addCookie(c);
	%>
	<br/>

     <a href="/MyFirstEEProject/W5D3fetchcookie.jsp">Click cookie info</a>
</body>
</html>