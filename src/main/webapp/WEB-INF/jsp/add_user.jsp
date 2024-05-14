<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Add User</title>

	<link rel="stylesheet" type="text/css" href="../../css/inputform.css">

</head>

<body>

	<%@ include file="header.jsp" %>
	<br>
	<br>

	<div class="container">

		<h3>Add User</h3>
		<div>

			<form:form action="/save-user" method="post" modelAttribute="command">

				<form:hidden path="userId" />

				<div class="form-group">
					<label for="name">User Name</label>
					<form:input type="text" id="username" path="userName"
						placeholder="Enter User Name" />
				</div>

				<div class="form-group">
					<label for="password">Password</label>
					<form:input type="text" id="pass" path="password"
						placeholder="Enter Password" />
				</div>

				<div class="form-group">
					<label for="role">Role</label>
					<form:input type="text" id="role" path="userRole"
						placeholder="Enter User Role" />
				</div>

				<button type="submit" class="btn">Add User</button>


			</form:form>
		</div>
	</div>
</body>
</html>