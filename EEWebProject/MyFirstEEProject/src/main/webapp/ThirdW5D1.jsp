<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="hello" class="com.Week_5_Day1.User">
		<jsp:setProperty name="hello" property="*"/>
	</jsp:useBean>
	User with name <jsp:getProperty property="name" name="hello"/>
    has an age <jsp:getProperty property="age" name="hello"/>
	<br/>
	User with name <%=hello.getName() %> has an age <%=hello.getAge() %>
</body>
</html>