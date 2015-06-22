<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'login.jsp' starting page</title>
    
	

  </head>
  
  <body>
   	<h1></h1>
   	<form action="/salaryManager/login.do?flag=login" method="post">
   		id:<input type="text" name="id"/></br>
   		password:<input type="password" name="pwd"/></br>
   		<input type="submit" value="login"/>
   		<input type="reset" value="reset"/>
   	</form>
  </body>
</html>
