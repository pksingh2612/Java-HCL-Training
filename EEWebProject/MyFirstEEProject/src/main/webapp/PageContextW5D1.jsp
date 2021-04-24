<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%request.setAttribute("subject1","maths"); %>

	<%= request.getAttribute("subject1") %>
	
	<br/>
	
	<%pageContext.setAttribute("subject2","Engilsh",pageContext.REQUEST_SCOPE); %>
	
	<%= pageContext.getAttribute("subject2",pageContext.REQUEST_SCOPE) %>
	
	<br/>
	
	<%session.setAttribute("subject3","chemistry"); %>
	
	<%= session.getAttribute("subject3") %>
	
	<br/>
	
	<%pageContext.setAttribute("subject4","History",pageContext.SESSION_SCOPE); %>
	
	<%= pageContext.getAttribute("subject4",pageContext.SESSION_SCOPE) %>
	
	<br/>
	
	<%application.setAttribute("subject5","Physics"); %>
	
	<%= application.getAttribute("subject5") %>
	
	<br/>
	
	<%pageContext.setAttribute("subject6","Biology",pageContext.APPLICATION_SCOPE); %>
	
	<%= pageContext.getAttribute("subject6",pageContext.APPLICATION_SCOPE) %>

<BR/>
</body>
</html>