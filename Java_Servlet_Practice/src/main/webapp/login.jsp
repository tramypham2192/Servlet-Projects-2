<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping cart login</title>
</head>
<body>
	<form action="./Login" method="post">
	<label for="uname">User Name:</label> <input type="text" class="form-control" id="username" placeholder="User Name" name="username" required>
	<label for="uname">Password:</label> <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
	<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>