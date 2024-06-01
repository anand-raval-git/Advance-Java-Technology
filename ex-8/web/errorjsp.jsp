<%-- 
    Document   : Errorjsp
    Created on : Sep 26, 2023, 12:59:55 PM
    Author     : vishv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> <!DOCTYPE html> 
<html> 
 <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  <title>Error Page</title> 
 </head> 
 <body> 
 <%@ page isErrorPage="true" %>  
 <h3>Sorry an exception occured!</h3>  
 Exception is: <%= exception %>  
 </body> 
</html>