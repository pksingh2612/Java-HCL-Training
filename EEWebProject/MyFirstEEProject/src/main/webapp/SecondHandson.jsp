<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cts.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= request.getParameter("name") %><br/>
	<% 
	    int age= Integer.parseInt(request.getParameter("age"));
		PerformTask pt = new PerformTask();
		out.print(request.getParameter("age"));
		out.print(" = ");
		out.println(pt.convertLessThanOneThousand(age));
	%>
	
</body>
</html>