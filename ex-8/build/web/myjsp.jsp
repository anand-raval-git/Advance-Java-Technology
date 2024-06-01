<%-- 
    Document   : Myjsp
    Created on : Sep 26, 2023, 12:59:23 PM
    Author     : vishv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> <!DOCTYPE html> 
<html> 
 <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  <title>Calculation</title> 
 </head> 
 <%@ page errorPage="errorjsp.jsp" %>  
 <%  
 String num1=request.getParameter("n1");  
 String num2=request.getParameter("n2");  
 String operation = request.getParameter("r1");  
  
 int a=Integer.parseInt(num1);  
 int b=Integer.parseInt(num2);  
  
 if(operation.equals("add")){ 
 int add=a+b; 
 out.println("Addition is: "+add); 
 } 
 else if(operation.equals("subtract")){ 
 int sub=a-b; 
 out.println("Substraction is: "+sub); 
 }
 else if(operation.equals("multiply")){ 
 int mul=a*b; 
 out.println("multiplication is: "+mul); 
 } 
 else if(operation.equals("divide")) 
 { 
 int div = a/b; 
 if(a>=b) 
 out.println("division is: "+div); 
 else 
 out.println("The division cannot be performed"); 
 } 
 %>  
 </body> 
</html>