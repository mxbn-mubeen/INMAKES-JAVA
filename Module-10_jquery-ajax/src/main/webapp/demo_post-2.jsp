<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>xml http post method</title>
</head>
<body>
	<%
	String firstname=request.getParameter("fname");
	String lastname=request.getParameter("lname");
	out.println("welcome "+firstname+" "+lastname);
	out.println("thank you for visiting my web page");
	
	
	%>
</body>
</html>