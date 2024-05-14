<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Sales Report</title>

	<link rel="stylesheet" type="text/css" href="../../css/table.css">
</head>

<body>
	<%@ include file="header.jsp" %>
	<br><br>
	<h2>Sales Report</h2>
	<div>
		

		<c:if test="${bill.size()==0}">
			<h2>No record found !!</h2>
		</c:if>


		<c:if test="${bill.size() gt 0 }">
			<div>

				<table>

					<thead>
						<tr>
							
							<th>Date</th>
							<th>Sales</th>
							
							
						</tr>
					</thead>


					<tbody>
						<c:forEach var="item" items="${bill}">

							<tr>
								
								<td>${item}</td>
								
								<td><a href="/view-sales/${item}">View Sales</a></td>
								
							</tr>

						</c:forEach>

					</tbody>


				</table>
			</div>
		</c:if>
		
	</div>
</body>
</html>