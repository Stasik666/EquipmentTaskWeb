<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
<style>
body {
	background: url(404.jpg);
	background-size: cover;
}
</style>
</head>
<body>
	<h1 style="text-align: center">
		<!--mySQL database Community Server-->
		<c:out value="${error_msg}" />
	</h1>
</body>
</html>