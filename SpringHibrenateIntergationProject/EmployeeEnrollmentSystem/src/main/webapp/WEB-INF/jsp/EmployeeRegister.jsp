<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Page</title>
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
<h3>Employee Registration form</h3>
<c:url var="empAction" value="/insertEmp"/>
<form:form action="${empAction}" method="post" modelAttribute="employeeForm">
<table>
  <tr>
     <td>Employee Name:</td>
     <td><form:input type="text" path="name"/><font color="red"><form:errors path="name"/></font></td>
  </tr>
  <tr>
     <td>Employee Age:</td>
     <td><form:input type="text" path="age"/><font color="red"><form:errors path="age"/></font></td>
  </tr>
  <tr>
     <td>Address:</td>
     <td><form:input type="text" path="address"/><font color="red"><form:errors path="address"/></font></td>
  </tr>
  <tr>
     <td>Gender</td>
     <td><form:radiobutton path="gender" value="male"/>Male
         <form:radiobutton path="gender" value="female"/>Female
     </td>
  </tr>
   <tr>
     <td>Date of Join:</td>
     <td><form:input type="date" path="doj"/><font color="red"><form:errors path="doj"/></font></td>
  </tr>
   <tr>
     <td>Email:</td>
     <td><form:input type="email" path="email"/><font color="red"><form:errors path="email"/></font></td>
  </tr>
   <tr>
     <td><input type="submit" value="Add Employee"/></td>
     <td><input type="reset" value="Cancel"/></td>
  </tr>
</table>
</form:form>
</body>
</html>