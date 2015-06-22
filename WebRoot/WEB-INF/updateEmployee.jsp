<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateEmployee.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>This is my JSP page. </h1>>
    
    <form action="${pageContext.request.contextPath}/employee.do?flag=update" method="post">
    id: <input type="text" value="${employee.id }"name="id" readonly="readonly"/></br>
    name:<input type="text" value="${employee.name }"name="name"/></br>
    email:<input type="text" value="${employee.email }"name="email"/></br>
    pwd:<input type="text" value="${employee.pwd }"name="pwd"/></br>
    grade:<input type="text" value="${employee.grade }"name="grade"/></br>
    salary:<input type="text" value="${employee.salary }"name="salary"/></br>
    department:
    <select name="departmentId">
    <option value="1">math</option>
    <option value="2">biology</option>
    </select></br>
    <input type="submit" value="update"/>
    <input type="reset" value="redo"/>
    </form>
  </body>
</html>
