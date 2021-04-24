<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("n1") %><br/>
	<%=request.getParameter("n2") %><br/>
	<%=request.getParameter("n3") %><br/>
	<%=request.getParameter("gen") %><br/>
	<% String[] temp=request.getParameterValues("hobby"); 
	 for(int i=0;i<temp.length;i++){
	%>
	<%=temp[i] %>
	<%} %>
	<br/>
	<% Enumeration e=request.getParameterNames();
	while(e.hasMoreElements()){
		String s1 = (String)e.nextElement();
		String s2 = request.getParameter(s1);
	%>
	<%=s1 %> <%=s2 %><br/>
	<%} %>
	<%=request.getProtocol() %><br/>
	<%=request.getScheme() %><br/>
	<%=request.getServerName() %><br/>
	<%=request.getContextPath() %><br/>
	<%=request.getServletPath() %><br/>
	<%=request.getQueryString() %><br/>
	<%=request.getHeader("accept-language") %><br/>
	<%=request.getHeader("host") %><br/>
	
	<% request.setAttribute("mark",78); %><br/>
	<jsp:forward page="SixW5D1.jsp"></jsp:forward>
	
</body>
</html>