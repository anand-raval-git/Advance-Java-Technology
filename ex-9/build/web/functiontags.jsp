<%-- 
    Document   : Functiontags
    Created on : 04-Oct-2023, 5:54:23 pm
    Author     : ASUS
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title> Using JSTL Function Tags </title>
</head>
<body>
<p><u> TO LOWER CASE </u></p>
<c:set var="string" value="Welcome to JSP Programming"/>
${fn:toLowerCase("HELLO,")}
${fn:toLowerCase(string)}
<br><br>
<p><u> TO UPPER CASE </u></p>
<c:set var="string" value="Welcome to JSP Programming"/>
${fn:toUpperCase("HELLO,")}
${fn:toUpperCase(string)}
<br><br>
<p><u> SUB-STRING </u></p>
<c:set var="string" value="This is the first string."/>
${fn:substring(string, 5, 17)}
<br><br>
<p><u> REPLACE </u></p>
<c:set var="author" value="Ramesh Kumar"/>
<c:set var="string" value="pqr xyz abc PQR"/>
${fn:replace(author, "Ramesh", "Suresh")}
${fn:replace(string, "pqr", "hello")}
</body>
</html> 