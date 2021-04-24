<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=1;i<=6;i++){ %>
	<h<%=i %>>Hello world</h<%=i %>>
	<%}%>
	<br/><br/>
	<%! int j=5; %>
	<%=++j %>
	<% int k=5; %>
	<%=++k %>
	<br/><br/>
	<%for(int m=0;m<5;m++){ %>
	out.println(m);
	<%} %>
	<br/><br/>
		
	<% x=5; %>
	<% int x=3; %>
	<%! int x=7; %>
	<%= this.x %> <%= x %>
</body>
</html>