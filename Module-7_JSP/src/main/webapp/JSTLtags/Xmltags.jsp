<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XML TAGS</title>
</head>
<body>
<h1>VEGEATAVBLES INFORMATION</h1>
<c:set var="vegetables">

<vegetables>

<vegetable>
<name>onion</name>
<price>50</price>
</vegetable>

<vegetable>
<name>potato</name>
<price>60</price>
</vegetable>

<vegetable>
<name>chilli</name>
<price>5.0</price>
</vegetable>

<vegetable>
<name>carrot</name>
<price>15</price>
</vegetable>


</vegetables>

</c:set>

<x:parse xml="${vegetables}" var="output"></x:parse>

<b>VEGETABLE NAME:<x:out select="$output/vegetables/vegetable[0]/name"/></b><br>
<b>VEGETABLE PRICE:<x:out select="$output/vegetables/vegetable[0]/price"/></b><br>

<b>VEGETABLE NAME:<x:out select="$output/vegetables/vegetable[1]/name"/></b><br>
<b>VEGETABLE PRICE:<x:out select="$output/vegetables/vegetable[1]/price"/></b><br>

<b>VEGETABLE NAME:<x:out select="$output/vegetables/vegetable[2]/name"/></b><br>
<b>VEGETABLE PRICE:<x:out select="$output/vegetables/vegetable[2]/price"/></b><br>

<b>VEGETABLE NAME:<x:out select="$output/vegetables/vegetable[3]/name"/></b><br>
<b>VEGETABLE PRICE:<x:out select="$output/vegetables/vegetable[3]/price"/></b><br>

<b>VEGETABLE NAME:<x:out select="$output/vegetables/vegetable[4]/name"/></b><br>
<b>VEGETABLE PRICE:<x:out select="$output/vegetables/vegetable[4]/price"/></b><br>

<br>

<h1>VEGETABLES DATA</h1>

<table border=2 width="100px" height="100px" bordercolor="red">

<tr>
<th>name</th>
<th>price</th>
</tr>

<x:forEach select="$output/vegetables/vegetable">

<tr>
<td><x:out select="name"/></td>
<td><x:out select="price"/></td>
</tr>

</x:forEach>
</table>
</body>
</html>