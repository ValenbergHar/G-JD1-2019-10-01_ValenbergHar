<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp: useBean id="user5" class = "src.beans.User" scope="page"></jsp: useBean>

<jsp:setProperty property="password" name="user5" value="passmein"/>
<%=   user5.get %>
</body>
</html>