<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Page</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h3>Student Registration form</h3>
<c:url var="stuAction" value="/insertStu"/>
<form:form action="${stuAction}" method="post" modelAttribute="studentForm">
<table>
  <tr>
     <td>Student Name:</td>
     <td><form:input type="text" path="sname"/><font color="red"><form:errors path="sname"/></font></td>
  </tr>
  <tr>
     <td>Student Age:</td>
     <td><form:input type="text" path="sage"/><font color="red"><form:errors path="sage"/></font></td>
  </tr>
  <tr>
     <td>Gender</td>
     <td><form:radiobutton path="sgender" value="male"/>Male
         <form:radiobutton path="sgender" value="female"/>Female
     </td>
  </tr>
  <tr>
     <td>Date of Join:</td>
     <td><form:input type="date" path="sdob"/><font color="red"><form:errors path="sdob"/></font></td>
  </tr>
  <tr>
     <td>Address:</td>
     <td><form:input type="text" path="saddress"/><font color="red"><form:errors path="saddress"/></font></td>
  </tr>
   <tr>
     <td><input type="submit" value="Add Student"/></td>
     <td><input type="reset" value="Cancel"/></td>
  </tr>
</table>
</form:form>
</body>
</html>