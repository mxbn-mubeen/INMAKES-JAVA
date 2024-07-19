<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SCRIPTING ELEMENTS</title>
</head>
<body>

<%-- declare variable --%>
<%! int x=10,y=20,z=0;
  String msg="hello world";
  
  int cube(int n){
	  return(n*n*n);
  }
  
  
  
  %>
  
<%-- expresssion tag --%>
<% z=x+y;%>

<%-- scriplet tag --%>
<% 
 out.println("result="+z);
 out.println("<h1 style='color:green;'>"+msg+"</h1>");
 %>
 
 <%= "cube of 2=" + cube(2) %>
 
 <%=new String("welcome") %>
</body>
</html>