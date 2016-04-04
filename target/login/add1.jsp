<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="update" method="post" modelAttribute="Employee">
	<div>
	<pre>
	<c:if test="${ !empty emp1}"></c:if>
		Employee id&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="id" required="required" value="${emp1.id }" readonly/><br> 
		Employee Name&nbsp;&nbsp;<input type="text" name="name"  required="required" value="${emp1.name }"/><br>
		Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="gender" required="required" value="${emp1.gender }"/><br>
		Age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="age" required="required" value="${emp1.age }"/><br> 
		Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email"required="required" value="${emp1.email }"/><br> 
		Salary&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="salary" required="required" value="${emp1.salary }"/> <br>
		Designation&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="designation" required="required" value="${emp1.designation }"/><br> 
		Department Name<input type="text" name="department" required="required" value="${emp1.departmentname }"/> <br>
		<input type="submit" value="submit" />&nbsp;&nbsp;<input type="reset" /><br>
		
		</pre>
		
</div>

	</form:form>

</body>
</html>