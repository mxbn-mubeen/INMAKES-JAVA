<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CORE TAGS</title>
</head>
<body>
 <c:out value="${'welcome '}"></c:out>
 
 <c:set var="balance" value="120000.2309"></c:set>
 
 <p>Format Number(1):<fmt:formatNumber value="${balance}" type="currency"></fmt:formatNumber></p>
 <p>Format Number(2):<fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="3"></fmt:formatNumber></p>
 <p>Format Number(3):<fmt:formatNumber value="${balance}" type="number" maxFractionDigits="3"></fmt:formatNumber></p>
 <p>Format Number(4):<fmt:formatNumber value="${balance}" type="number" groupingUsed="false"></fmt:formatNumber></p>
 <p>Format Number(5):<fmt:formatNumber value="${balance}" type="percent" maxFractionDigits="3"></fmt:formatNumber></p>
 <p>Format Number(6):<fmt:formatNumber value="${balance}" type="percent" minFractionDigits="10"></fmt:formatNumber></p>
 <p>Format Number(7):<fmt:formatNumber value="${balance}" type="percent" maxFractionDigits="3"></fmt:formatNumber></p>
 <p>Format Number(8):<fmt:formatNumber value="${balance}" type="number" pattern="###.###E0"></fmt:formatNumber></p>
 
 <p>
 CURRENCY IN USA:
 <fmt:setLocale value="en_us"/>
 <fmt:formatNumber value="${balance}" type="currency"></fmt:formatNumber>
 </p>
</body>
</html>

