<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("logoURL","https://lenskills.com"); %><br/>
	<% request.setAttribute("organizationName","LenSkills"); %><br/>
	<jsp:include page="Problem8b.jsp"></jsp:include>
	<jsp:include page="Problem8c.jsp"></jsp:include>
</body>
</html>