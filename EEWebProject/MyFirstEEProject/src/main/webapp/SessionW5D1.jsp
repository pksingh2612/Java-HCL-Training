<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=session.getId() %><br/>
	<%=session.getCreationTime() %><br/>
	<%=session.getLastAccessedTime() %><br/>
	<%=session.isNew() %><br/>
	<% session.setAttribute("mark",85);%>
	<a href="/MyFirstEEProject/Session1W5D1.jsp">Click here</a>
</body>
</html>