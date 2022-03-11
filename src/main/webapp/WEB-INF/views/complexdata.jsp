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
		<h1 class="text-center">ID of the user = ${complexuser.id}</h1>
		<h1 class="text-center">Name of the user = ${complexuser.name}</h1>
		<h1 class="text-center">Email of the user = ${complexuser.email}</h1>
		<h1 class="text-center">Password of the user = ${complexuser.password}</h1>
		<h1 class="text-center">Gender of the user = ${complexuser.gender}</h1><br/><br/>
		<h1 class="text-center">Courses Of the User</h1>
		<c:forEach var="c" items="${complexuser.courses}">
			<h1 class="text-center"><c:out value="${c}"/></h1>
		</c:forEach>
	</div>
</body>
</html>