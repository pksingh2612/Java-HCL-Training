<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8086/MyFirstEEProject/resultW5D1.jsp">
		Text Box: <input type="text" name="textBox"> <br/>
		<input type="submit" value="OK">
	</form>
	
	<%! int j=0; %>
	<% if(j==1){ %>
	<%="You are visiting the page for: 1 time" %>
	<%} %>
	<% if(j==10){ %>
	<%="You are visiting the page for: 10 time" %>
	<%} %>
</body>
</html>