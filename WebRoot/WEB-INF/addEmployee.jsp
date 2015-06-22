<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    

  </head>
  
  <body>
   <h1> Add Employee </h1>
    
    <form action="${pageContext.request.contextPath}/employee.do?flag=add" method="post">
    name:<input type="text" name="name"/></br>
    email:<input type="text" name="email"/></br>
    pwd:<input type="text" name="pwd"/></br>
    grade:<input type="text" name="grade"/></br>
    salary:<input type="text" name="salary"/></br>
    department:
    <select name="departmentId">
    <option value="1">math</option>
    <option value="2">biology</option>
    </select></br>
    <input type="submit" value="add"/>
    <input type="reset" value="redo"/>
    </form>
  </body>
</html>
