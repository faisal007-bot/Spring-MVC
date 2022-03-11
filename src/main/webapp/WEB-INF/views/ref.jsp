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
<body style="background-color: black;color: white;">

	<div class="container m-5 p-3">
		<form action="refprocess" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Enter Email
					address</label> <input type="email" name="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter Password</label>
				<input type="password" name="password" class="form-control"
					id="exampleInputPassword1">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Enter City
				</label> <input type="text" name="address.city" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Enter Country
					</label> <input type="text" name="address.country" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>
