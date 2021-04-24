<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cts.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("textBox") %><br/>
	<% String s= request.getParameter("textBox");
	out.println(s);
	%>
	<% PerformTask pt = new PerformTask();
	out.println(pt.doTask());
	%>
</body>
</html>