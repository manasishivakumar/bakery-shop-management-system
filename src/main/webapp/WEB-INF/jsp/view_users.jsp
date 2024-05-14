<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>View Users</title>
	<link rel="stylesheet" type="text/css" href="../../css/table.css">

</head>

<body>

	<%@ include file="header.jsp" %><br><br>
	<h2>User List</h2>
	
	<div>
		<a href="/add-user">Add User</a>

		<c:if test="${users.size()==0}">
			<h2>No record found !!</h2>
		</c:if>


		<c:if test="${users.size() gt 0 }">
			<div>

				<table>

					<thead>
						<tr>
							<th>User</th>
							<th>User Name</th>
							<th>Password</th>
							<th>Role</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>


					<tbody>
						<c:forEach var="user" items="${users}">

							<tr>
								<td>${user.userId}</td>
								<td>${user.userName}</td>
								<td>${user.password}</td>
								<td>${user.userRole}</td>
								<td><a href="/user-update/${user.userId}">Edit</a></td>
								<td><a href="/user-delete/${user.userId}">Delete</a></td>
							</tr>

						</c:forEach>

					</tbody>


				</table>
			</div>
		</c:if>
		
	</div>
</body>
</html>