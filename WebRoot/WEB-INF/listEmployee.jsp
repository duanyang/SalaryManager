<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Employee List</title>
  </head>
  
  <body> 
    <h1> Employee List</h1>
    <table>
    <tr><td>id</td><td>name</td><td>email</td><td>grade</td><td>salary</td><td>delete</td><td>update</td></tr>
    <c:forEach items="${employeeList}" var="employee">
    <tr><td>${employee.id }</td><td>${employee.name }</td>
    <td>${employee.email }</td><td>${employee.grade }</td>
    <td>${employee.salary }</td>
    <td><a href="${pageContext.request.contextPath}/employee.do?flag=deleteEmployee&id=${employee.id }">delete</a></td>
    <td><a href="${pageContext.request.contextPath}/employee.do?flag=updateEmployee&id=${employee.id }">update</a></td></tr>
    </c:forEach>
    </table>
    <c:forEach var="i" begin="1" end="${pageCount}">
    <a class="deleteId" href="${pageContext.request.contextPath}/employee.do?flag=listEmployee&pageNow=${i}">${i}</a>
    </c:forEach>
  </body>
</html>
