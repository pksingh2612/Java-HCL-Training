<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <c:set var="salary" value="${2000*4}" scope="session"/>

	My Salary is <c:out value="${salary}"/>
	
	<br/>
	
	${sessionScope.salary}
	
	<br/>
	
	<c:remove var="salary"/>
	
	After removing my salary is <c:out value="${salary}"/>
	
	<br/>
	<c:set var="sal" value="${2000*4}" scope="session"/>
	<c:if test="${sal > 5000}">
	
	   My Salary is <c:out value="${sal}"/>
	
	</c:if>
	
	<br/>
	<c:choose>
	
	   <c:when test="${salary>5000}">
	
	      Salary is good
	
	   </c:when>
	
	   <c:when test="${salary<3000}">
	
	      Salary is less
	
	   </c:when>
	
	   <c:otherwise>
	
	       No comments about salary
	
	   </c:otherwise>
	
	</c:choose>
	
	<br/>
	
	<c:forEach var="i" begin="1" end="15" step="3">
	
	  Item <c:out value="${i}"/>
	
	</c:forEach>
	
	<br/>
	
	<c:forTokens items="apple,grapes,banana,oranges" delims="," var="fruit">
	
	    <c:out value="${fruit}"/>
	
	</c:forTokens>
	
	<br/>
	
	<c:catch var="e">

	   <%int i=10/0; %>
	
	</c:catch>
	
	<c:if test="${e!=null}">
	
	  The exception is ${e}
	
	</c:if>
	
	<c:redirect url="https://www.google.com"/>


</body>
</html>