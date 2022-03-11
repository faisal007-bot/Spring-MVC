<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<title>File Form</title>
</head>
<body style="background-color: black; color: white;">
	<div class="container m-5">
		<form class="form-control" action="processfile" method="post"
			enctype="multipart/form-data">
			<div class="input-group mb-3">
				<input type="file" class="form-control" name="profile"
					id="inputGroupFile02"> <label class="input-group-text"
					for="inputGroupFile02">Choose</label>
			</div>
			<div>
				<button type="submit" class="btn btn-primary">Upload Image</button>
			</div>
		</form>
	</div>
</body>
</html>