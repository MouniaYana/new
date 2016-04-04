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
				<th>Employee Name</th>
				<th>Department id</th>
				<th>Name</th>
				<th>Functionalities</th>
				
			</tr>
<c:forEach items="${emp1 }" var="users">
				<tr>
					<td>${users.name }</td>
					<td>${users.department.id}</td>
					<td>${users.department.name }</td>
					
					
					<td><a href="editdep?id=${users.department.id}">Edit</a>/
					<a href="deletedep?id=${users.department.id}">Delete</a></td>
			</c:forEach>



</table>
</c:if>

</body>
</html>