<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<h1>
<body>
	<h1>Welcome ${loginuser.name} Your department is ${loginuser.department.name}</h1>
	<a href="${pageContext.request.contextPath}/employee.do?flag=addEmployee">Add Employee</a></br>
	<a href="${pageContext.request.contextPath}/employee.do?flag=listEmployee">List Employee</a></br>
	<a href="${pageContext.request.contextPath}/login.do?flag=logout">logout</a></br>
</body>

</h1>
</html>