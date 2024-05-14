<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Item</title>

	<link rel="stylesheet" type="text/css" href="../../css/inputform.css">

</head>

<body>

	<%@ include file="header.jsp" %>
	<br>
	<br>

	<div class="container">

		<h3>Add Item</h3>
		<div>

			<form:form action="/save-item" method="post" modelAttribute="command">

				<form:hidden path="itemId" />

				<div class="form-group">
					<label for="name">Item Name</label>
					<form:input type="text" id="itemname" path="itemName"
						placeholder="Enter Item" />
				</div>

				<div class="form-group">
					<label for="quantity">Item Quantity</label>
					<form:input type="text" id="itemqty" path="itemQuantity"
						placeholder="Enter Quantity" />
				</div>

				<div class="form-group">
					<label for="price">Item Price</label>
					<form:input type="text" id="itemprice" path="itemPrice"
						placeholder="Enter price" />
				</div>

				<button type="submit" class="btn">Add Item</button>


			</form:form>
		</div>
	</div>
</body>
</html>