<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
</head>
<body>
    <h1>Edit Employee</h1>
    <form action="EditServlet" method="post">
        <input type="hidden" name="action" value="save">
        <input type="hidden" name="id" value="${employee.id}">
       
