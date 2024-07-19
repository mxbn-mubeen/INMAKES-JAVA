<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Details</title>
</head>
<body>

<h2 align="center">SQL JSP</h2>

<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/constraints"
    user="root" password="spectratec@22"/>

<sql:query var="customerData" dataSource="${db}">
    SELECT * FROM CUSTOMER
</sql:query>

<table border="1" align="center" width="100">
    <tr>
        <th>CUSTOMER ID</th>
        <th>CUSTOMER NAME</th>
        <th>ADDRESS</th>
        <th>CITY</th>
        <th>POSTAL CODE</th>
        <th>STATE</th>
        <th>COUNTRY</th>
    </tr>
    
    <c:forEach var="customer" items="${customerData.rows}">
        <tr>
            <td><c:out value="${customer.customerid}"/></td>
            <td><c:out value="${customer.customername}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><c:out value="${customer.city}"/></td>
            <td><c:out value="${customer.postalcode}"/></td>
            <td><c:out value="${customer.state}"/></td>
            <td><c:out value="${customer.country}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
