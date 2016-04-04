<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
	<div>
	<pre>
		Employee id&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="id" required="required"/><br> 
		Employee Name&nbsp;&nbsp;<input type="text" name="name"  required="required"/><br>
		Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="gender" required="required"/><br>
		Age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="age" required="required"/><br> 
		Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email"required="required"/><br> 
		Salary&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="salary" required="required"/> <br>
		Designation&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="designation" required="required"/><br> 
		Department Name<input type="text" name="department" required="required"/> <br>
		<input type="submit" value="submit" />&nbsp;&nbsp;<input type="reset" /><br>
		
		
		</pre>
</div>

	</form>

</body>
</html>