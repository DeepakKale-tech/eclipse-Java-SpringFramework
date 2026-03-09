<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students List</title>
</head>
<body>
<h1>Student List</h1>
	<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
			</tr>
		<c:forEach var="student" items="${students}">
			<tr style="text-align: center;">
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>