<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="MainServlet" method="GET">
	<input type="hidden" name="action" value="create_order">
	<input type="text" name="user_id">
	<input type="text" name="equipment_id">
	<input type="text" name="date_start">
	<input type="text" name="date_end">
	<input type="submit" value="order">
	</form>
</body>
</html>