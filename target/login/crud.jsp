<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 ${message }
<form action="add.jsp" method="post">

<input type="submit" value="Add employees" />
</form>
<form action="edit" method="post">

<input type="submit" value="Edit employees"/>
</form>
<form action="delete" method="post">

<input type="submit" value="Delete employees"/>
</form>
<form action="list" method="post">

<input type="submit" value="Display employees"/>
</form>

</body>
</html>