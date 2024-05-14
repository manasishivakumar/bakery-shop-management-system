<!DOCTYPE html>
<html>
<head>
<title>Bill Form</title>
	<link rel="stylesheet" type="text/css" href="../../css/inputform.css">
	
</head>

<body>
	<%@ include file="cashier_header.jsp" %><br><br>
	<div class="container">
		<h3>Generate Bill</h3>
		<div>

			<form action="/generateBill" method="get">
				<div class="form-group">
					<label>Item ID:</label><br> <input type="text" name="itemId"><br>
				</div>

				<div class="form-group">
					<label>Quantity:</label><br> <input type="text"
						name="quantity"><br>
				</div>

				<button type="submit" class="btn">Generate Bill</button>
			</form>
		</div>
	</div>
</body>
</html>
