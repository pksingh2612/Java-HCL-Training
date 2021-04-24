<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= request.getParameter("n1") %> <br/>

	${param.n2} <br/>
	
	${param.n3} <br/>
	
	${param.gender} <br/>
	
	${paramValues.hobby["0"]} <br/>
	
	${paramValues.hobby["1"]} <br/>
	
	${header["accept-language"]} <br/>
	
	${header["host"]} <br/>
	
	${headerValues.accept["0"]} <br/>
	
	${initParam.zipcode } <br/>
	
	${pageContext.request.contextPath} <br/>
	
	${pageContext.request.protocol } <br/>
	
	${pageContext.request.scheme } <br/>
	
	${pageContext.session.id } <br/>
		
</body>
</html>