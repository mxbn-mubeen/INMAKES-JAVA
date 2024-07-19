<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AJAX GET Method</title>
</head>
<body>
    <%
        String t = request.getQueryString();
        if (t!=null) {
            Date today = new Date();
            out.println("This page was requested at: " + today);
        }
    %>
</body>
</html>