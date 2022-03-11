<!doctype html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>View1</title>
</head>
<body style="background-color: black;color: white;">
	<%
		Integer id = (Integer)(request.getAttribute("id"));
		String name = request.getAttribute("name").toString();
		List<String> friends = (List<String>)request.getAttribute("friends");
	%>
	<div class="container m-5">
	<h1 class="text-center">ID of the user = <%= id %></h1>
	<h1 class="text-center">Name of the user = <%= name %></h1><br/><br/>
	<h1 class="text-center">NickNames</h1>
	<% for(String s:friends) { %>
	<h1 class="text-center"><%= s %></h1>
	<% } %>
	</div>
</body>
</html>