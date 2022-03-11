<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Success</title>
</head>
<body style="background-color: black;color: white;">
	<%-- <div class="container m-5 p-3">
		<h1 class="text-center">Email of the user = ${requestScope.email}</h1>
		<h1 class="text-center">Password of the user = ${requestScope.password}</h1>
	</div> --%>
	
	<div class="container m-5 p-3">
		<h1 class="text-center">Email of the user = ${user.email}</h1>
		<h1 class="text-center">Password of the user = ${user.password}</h1>
	</div>
</body>
</html>