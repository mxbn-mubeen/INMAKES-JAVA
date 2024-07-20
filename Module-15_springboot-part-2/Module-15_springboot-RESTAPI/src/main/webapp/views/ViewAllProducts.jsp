<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Products</title>
</head>
<body>
    <h1>View All Products</h1>
    <table border="1" width="80%">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.pid}</td>
                <td>${product.pname}</td>
                <td>${product.quantity}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>    
    </table>
</body>
</html>
