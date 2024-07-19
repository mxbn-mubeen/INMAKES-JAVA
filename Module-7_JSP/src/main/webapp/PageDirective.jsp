<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAGE DIRECTIVE</title>
</head>
<body>
<p>today is :<%=new Date().toString()%></p>
<p>number:<%=Math.random() %></p>
<%
	ArrayList <String> a1=new ArrayList<>();
	a1.add("java");
	a1.add("C");
	a1.add("PHP");
	a1.add("RUBY");
	
	for(String s:a1){
	%>
	<p style='color:green' align="center">
	<% 
	out.println(s);
	%>
	
	</p>
	<%
	}
	%>
</body>
</html>