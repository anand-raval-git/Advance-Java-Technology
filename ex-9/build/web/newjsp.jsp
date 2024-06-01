<%-- 
    Document   : Newjsp
    Created on : 04-Oct-2023, 5:50:25 pm
    Author     : ASUS
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>
<a href="functiontags.jsp"> Click Here For Function Tags </a>
<br><br>
<p>CORE TAGS
<u>OUT TAG</u></p>
<c:out value="${'Welcome to JSTL'}"/>
<br><br>
<p><u>SET TAG</u></p>
<c:set var="Income" scope="session" value="${4000*4}"/>
<c:out value="${Income}"/>
<br><br>
<p><u>SET and REMOVE TAG</u></p>
<c:set var="income" scope="session" value="${5000*4}"/>
<p>Before Remove Value is: <c:out value="${income}"/></p>
<c:remove var="income"/>
<p>After Remove Value is: <c:out value="${income}"/></p>
<br><br>
<p><u>IMPORT TAG</u></p>
<c:import var="data" url="https://marwadiuniversity.ac.in/"/>
<c:out value="${data}"/>
</body>
</html>
