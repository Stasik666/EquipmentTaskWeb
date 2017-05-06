<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
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
<body>
	<h1 style="text-align: center">Welcome admin!</h1>
	<!--  <table>
			<tr>
				<th>#</th>
				<th>login</th>
				<th>password</th>
			</tr>
			<c:forEach items="${list}" var="i">
			<h3>
			<tr> 
				<td> <c:out value="${list.indexOf(i)}"/></td>
				<td> <c:out value="${i.getLogin()}" /></td>
     			<td><c:out value="${i.getPassword()}" /> </td>
			</tr>
			</h3>
 			 </c:forEach>
		</table>-->
</body>
</html>