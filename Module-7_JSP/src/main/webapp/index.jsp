<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<jsp:useBean id="str" class="com.beans.Msg"></jsp:useBean>
<%
String message = "Hello World";
str.setS(message);
String m = str.getS();
out.print(m);
%>
</body>
</html>
