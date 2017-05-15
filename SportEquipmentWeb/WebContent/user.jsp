<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User page</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
			$(document).ready(function(){
				$('table').addClass('table table-hover table-bordered-black');
				$('tr').addClass('warning');
			});
		</script>
</head>
<body background="sport.jpg">
	<h1 style="text-align: center">Welcome User!</h1>
	<form action="MainServlet" method="GET">
		<input type="hidden" name="action" value="make_order">
		<input type="submit" value="make order">
	</form>
	<table>
		<tr>
			<th colspan="4" style="text-align: center"><h2>List of
					available equipments</h2></th>
		</tr>
		<tr>
			<th>#</th>
			<th>Item</th>
			<th>Title</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${list_eq}" var="i">

			<tr>
				<td><h4>
						<c:out value="${list_eq.indexOf(i)+1}" />
					</h4></td>
				<td><h4>
						<c:out value="${i.getItemName()}" />
					</h4></td>
				<td><h4>
						<c:out value="${i.getTitle()}" />
				</h4></td>
				<td><h4>
						<c:out value="${i.getPrice()}" />
					</h4></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>