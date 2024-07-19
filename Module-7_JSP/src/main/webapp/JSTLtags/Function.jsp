<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL FUNCTIONS</title>
</head>
<body>

<h1>JSTL FUNCTIONS</h1>

<c:set value="           I am a Full Stack Java Developer          " var="msg1"></c:set>
<c:set value="I am a Full Stack <course>Java</course> Developer" var="msg2"></c:set>
<c:set value="${fn:split(msg1,' ')}" var="msgarray"></c:set>

<p>MESSAGE: ${msg1}</p>

<p>MESSAGE contains 'java': ${fn:contains(msg1,'java')}</p>
<p>MESSAGE contains 'JAVA': ${fn:containsIgnoreCase(msg1,'JAVA')}</p>
<p>MESSAGE contains 'python': ${fn:contains(msg1,'python')}</p>

<p>MESSAGE ends with 'JAVA': ${fn:endsWith(msg1,'JAVA')}</p>
<p>MESSAGE ends with 'Developer': ${fn:endsWith(msg1,'Developer')}</p>

<p>MESSAGE with escape xml: ${fn:escapeXml(msg2)}</p>

<p>MESSAGE index of 'a': ${fn:indexOf(msg1,'a')}</p>
<p>MESSAGE index of 'x': ${fn:indexOf(msg1,'x')}</p>

<c:forEach items="${msgarray}" var="msg3">
    <p>MESSAGE 2: ${msg3}</p>
</c:forEach>

<p>MESSAGE 2 join with '-': ${fn:join(msgarray,'-')}</p>
<p>MESSAGE 2 join with '%': ${fn:join(msgarray,'%')}</p>

<p>LENGTH of message: ${fn:length(msg1)}</p>

<p>MESSAGE replace 'java' to 'python': ${fn:replace(msg1,'java','python')}</p>

<p>MESSAGE starts with 'I': ${fn:startsWith(msg1,'I')}</p>
<p>MESSAGE starts with 'you': ${fn:startsWith(msg1,'you')}</p>
 
<p>Message substring from 7 to 17: ${fn:substring(msg1,7,17)}</p>
<p>Message substring before 'Full Stack': ${fn:substringBefore(msg1,'Full Stack')}</p>
<p>Message substring after 'Full Stack': ${fn:substringAfter(msg1,'Full Stack')}</p>

<p>Message to lowercase: ${fn:toLowerCase(msg1)}</p>
<p>Message to uppercase: ${fn:toUpperCase(msg1)}</p>

<p>Message trim white spaces: ${fn:trim(msg1)}</p>

</body>
</html>