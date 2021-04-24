<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee Search </title>
</head>
<body>
	<form action="http://localhost:8086/MyFirstEEProject/EmpServlet" method="post" >
		Employee ID: <input type="number" name="empId"> <br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>