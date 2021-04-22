<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Updation Pages</title>
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
<h3>Student Updation Details</h3>
<c:url var="updateaction" value="/updateStu"/>
<form:form action="${updateaction}" method="post" modelAttribute="editForm">
<table>
  <tr>
     <td>Student Id:</td>
     <td><form:input type="text" path="sid" readonly="true" /></td>
  </tr>
  <tr>
     <td>Student Name:</td>
     <td><form:input type="text" path="sname"/><font color="red"><form:errors path="sname"/></font></td>
  </tr>
  <tr>
     <td>Student Age:</td>
     <td><form:input type="text" path="sage" readonly="true" /></font></td>
  </tr>
  <tr>
     <td>Gender</td>
     <td><form:radiobutton path="sgender" value="male" onclick="return false" />Male
         <form:radiobutton path="sgender" value="female" onclick="return false" />Female
     </td>
  </tr>
   <tr>
     <td>Date of Birth:</td>
     <td><form:input type="date" path="sdob"/><font color="red"><form:errors path="sdob"/></font></td>
  </tr>
  <tr>
     <td>Address:</td>
     <td><form:input type="text" path="saddress"/><font color="red"><form:errors path="saddress"/></font></td>
  </tr>
   <tr>
     <td><input type="submit" value="Update Student"/></td>
     <td><input type="reset" value="Cancel"/></td>
  </tr>
</table>
</form:form>
</body>
</html>