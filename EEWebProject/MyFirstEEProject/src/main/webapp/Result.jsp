<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	    <jsp:useBean id="hello" class="com.cts.Employee11">
			<jsp:setProperty name="hello" property="*"/>
		</jsp:useBean>
		Employee Name <jsp:getProperty property="Name" name="hello"/>
		Employee Id <jsp:getProperty property="empCode" name="hello"/>
	    Employee Age <jsp:getProperty property="Salary" name="hello"/>
	<br/>
	    
</body>
</html>