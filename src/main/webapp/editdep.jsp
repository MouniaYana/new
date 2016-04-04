<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
	<form:form action="updatedep" method="post" modelAttribute="Department">
	<div>
	
Department id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="id" value="${emp1.id }" readonly><br><br>
Department name&nbsp;<input type="text" name="name" value="${emp1.name } "><br><br>
<input type="submit" value="submit"/><br><br>
<input type="reset" value="reset"/>

</div>

	</form:form>

</body>
</html>