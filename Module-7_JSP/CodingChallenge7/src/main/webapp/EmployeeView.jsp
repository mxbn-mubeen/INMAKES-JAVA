<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Employees</title>
</head>
<body>
    <h1>View All Employees</h1>

    <table border="2" width="100%">
        <tr style='background-color:#EF6079FF; color:white;'>
            <th>ID</th>
            <th>Name</th>
            <th>Password</th>
            <th>Email</th>
            <th>Country</th>
            <th colspan="2">Action</th>
        </tr>

        <c:forEach items="${allEmployees}" var="employee">
            <tr style='color:black;'>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.password}</td>
                <td>${employee.email}</td>
                <td>${employee.country}</td>
                <td><a href="EditServlet?action=edit&id=${employee.id}">Edit</a></td>
                <td><a href="ViewServlet?action=delete&id=${employee.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
