<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Home</title>
</head>
<body>
<h1>Welcome to MVC Spring</h1>
<%
String name = (String)request.getAttribute("Name");
Integer id = (Integer)request.getAttribute("Id");
Integer salary = (Integer)request.getAttribute("Salary");

out.println("ID: "+id);
out.println(" Name: "+name);
out.println(" Salary: "+salary);
%>
</body>
</html>