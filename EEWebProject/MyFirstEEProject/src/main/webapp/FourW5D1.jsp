<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/MyFirstEEProject/FiveW5D1.jsp" method="post">

        Name: <input type="text" name="n1"><br />

        Age: <input type="text" name="n2"><br />

        Salary: <input type="text" name="n3"><br />

        Gender:

        <input type="radio" name="gen" value="male">Male

        <input type="radio" name="gen" value="female">Female

        <input type="radio" name="gen" value="other">Other

        <br />

        Hobbies:

        <input type="checkbox" name="hobby" value="dance">Dancing

        <input type="checkbox" name="hobby" value="sing">Singing

        <input type="checkbox" name="hobby" value="play">Playing

        <input type="checkbox" name="hobby" value="swim">Swimming

        <br />

        <input type="submit" value="Click">

    </form>
	
</body>
</html>