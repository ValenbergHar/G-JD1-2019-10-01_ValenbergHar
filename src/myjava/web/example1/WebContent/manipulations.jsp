<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 0; i < 5; i++) {
	%>
<p>HTML is in a scriplet loop iteration <%= i %></p>
	<%
		}
	%>

</body>
</html>