<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
var xyz =100;
</script>
<body>
   Name:<input type="text" name="fname"/>
   
   <%! int age=100; %>
   
   
   <%
   int x =10;
   int y = 20;
   
   System.out.println("Sum:"+(x+y));
   //Inpbuilt Objects are available 
   out.println("<BR>Hi System Time is :"+new Date());
   out.println("<BR>Hi Person age:"+age);
   out.println("<BR>Hi Page Session:"+session.getId());
   out.println("<BR>Name:"+request.getParameter("fname"));
  
   %>
   
   <%= "<BR>Age:"+age %>
   
</body>
</html>