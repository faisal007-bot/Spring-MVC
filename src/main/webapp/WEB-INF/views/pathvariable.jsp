<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>View 2</title>
</head>
<body style="background-color: black;color: white;">
	<div class="container m-5">
		<div class="text-center">
			<h1>Path ID = ${requestScope.id}</h1>
			<h1>Path Name = ${requestScope.name}</h1>
		</div>
	</div>
</body>
</html>