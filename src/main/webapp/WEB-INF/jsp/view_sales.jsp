<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>View Sales</title>
	<link rel="stylesheet" type="text/css" href="../../css/table.css">

</head>

<body>

	<%@ include file="header.jsp" %><br><br>
	<h2>Bakery Shop Sales</h2>
	
	<div>
		

		<c:if test="${items.size()==0}">
			<h2>No record found !!</h2>
		</c:if>


		<c:if test="${items.size() gt 0 }">
			<div>

				<table>

					<thead>
						<tr>
							
							<th>Bill No</th>							
							<th>Bill Date</th>							
							<th>Total Amount</th>
							<th>Bill Details</th>
							
						</tr>
					</thead>


					<tbody>
						<c:forEach var="item" items="${items}">

							<tr>
								
								<td>${item.billNo}</td>
								<td>${item.date}</td>
								<td>${item.totalAmount}</td>
								<td><a href="/bill-details/${item.billNo}">Bill Details</a></td>
								
							</tr>

						</c:forEach>

					</tbody>


				</table>
			</div>
		</c:if>
		
	</div>
</body>
</html>