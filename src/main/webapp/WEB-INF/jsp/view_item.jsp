<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>View Items</title>
	<link rel="stylesheet" type="text/css" href="../../css/table.css">

</head>

<body>

	<%@ include file="header.jsp" %><br><br>
	<h2>Bakery Shop Items</h2>
	
	<div>
		<a href="/add-item">Add item</a>

		<c:if test="${items.size()==0}">
			<h2>No record found !!</h2>
		</c:if>


		<c:if test="${items.size() gt 0 }">
			<div>

				<table>

					<thead>
						<tr>
							<th>Item</th>
							<th>Item Name</th>
							<th>Item Quantity</th>
							<th>Item Price</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>


					<tbody>
						<c:forEach var="item" items="${items}">

							<tr>
								<td>${item.itemId}</td>
								<td>${item.itemName}</td>
								<td>${item.itemQuantity}</td>
								<td>${item.itemPrice}</td>
								<td><a href="/item-update/${item.itemId}">Edit</a></td>
								<td><a href="/item-delete/${item.itemId}">Delete</a></td>
							</tr>

						</c:forEach>

					</tbody>


				</table>
			</div>
		</c:if>
		
	</div>
</body>
</html>