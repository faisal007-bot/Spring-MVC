<%@page import="java.util.List" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Form</title>
</head>
<body style="background-color: black; color: white;">
	<div class="container mt-5">
		<h1 class="text-center">Email of the student = ${student.email}</h1>
		<h1 class="text-center">password of the student = ${student.password}</h1>
		<h1 class="text-center">city of the student = ${student.address.city}</h1>
		<h1 class="text-center">country of the student = ${student.address.country}</h1>
	</div>
</body>
</html>