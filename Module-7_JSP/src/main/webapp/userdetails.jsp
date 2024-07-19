<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userinfo" class="com.beans.Details"></jsp:useBean>
<jsp:setProperty property="" name="userinfo"/>

<jsp:getProperty property="Username" name="userinfo"/>
<jsp:getProperty property="age" name="userinfo"/>
</body>
</html>