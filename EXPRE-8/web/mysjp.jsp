<%-- 
    Document   : mysjp
    Created on : 30-Nov-2023, 5:23:14 pm
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
        <%@page errorPage="errorjsp.jsp" %>
    <%
        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        String operation = request.getParameter("r1");
        
        int a = Integer.parseInt("n1");
        int b = Integer.parseInt("n2");
        
        if(operation.equals("add"))
        {
        int add = a+b;
        out.println("addition is : "+add);
    }
    else if(operation.equals("division"))
    {
    int division = a/b;
    out.println("Division is :"+division);
    }
    else if(operation.equals("multi"))
    {
    int multi = a*b;
    out.println("Multi is"+multi);
    }
    else if(operation.equals("subtract"))
    {
    int subtract = a-b;
    out.println("subtract is: "+subtract);
    }
    
        
        %>
     </body>
  
</html>
