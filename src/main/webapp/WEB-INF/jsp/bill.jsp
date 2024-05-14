<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Generated Bill</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 20px;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 5px;
}

.header {
	text-align: center;
	margin-bottom: 20px;
}

.bill-table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 20px;
}

.bill-table th, .bill-table td {
	padding: 10px;
	border-bottom: 1px solid #ddd;
}

.bill-table th {
	text-align: left;
}

.total {
	text-align: right;
}

.footer {
	margin-top: 20px;
	text-align: center;
}
</style>

</head>
<body>
	<div class="container">
		<div class="header">
			<h2>Bakery Shop Bill</h2>

		</div>
		<p>Bill No : ${billNo}</p>
		<table class="bill-table">
			<thead>
				<tr>
					<th>Item Name</th>
					<th>Quantity</th>
					<th>Price</th>
					<th>Total</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="bill" items="${bills}">

					<tr>
						<td>${bill.itemName}</td>
						<td>${bill.quantity}</td>
						<td>${bill.itemPrice}</td>
						<td>${bill.itemPrice * bill.quantity}</td>
					</tr>

				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="3">Total Amount:</td>
					<td>${totalAmount}</td>
				</tr>
			</tfoot>
		</table>
		<div class="footer">
			<p>Thank you !!!</p>
		</div>
	</div>
</body>
</html>
