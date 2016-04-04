<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
	<c:if test="${!empty emp1 }">
		<table align="center" bordercolor="red" border="1px" >
			<tr>
				<th>Employee Id</th>
				<th>Name</th>
				<th>Gender</th>
				<th>Age</th>
				<th>Email</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Department</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<c:forEach items="${emp1 }" var="users">
				<tr>
					<td>${users.id}</td>
					<td>${users.name }</td>
					<td>${users.gender }</td>
					<td>${users.age }</td>
					<td>${users.email }</td>
					<td>${users.salary }</td>
					<td>${users.designation }</td>
					<td>${users.department.name }</td>

					
					<td><a href="edit?id=${users.id}">Edit</a></td>
					<td><a href="delete?id=${users.id}">Delete</a></td>
			</c:forEach>
		</table><br>
		<div align="center">
		<a href="empid">Display By Employee id</a><br>
		<a href="empname">Display By Employee Name</a><br>
		<a href="empsal">Display By Employee Salary</a><br>
		<a href="empdesg">Display By Employee Designation</a><br>
		</div> 
	</c:if>
	
	
</body>
</html>