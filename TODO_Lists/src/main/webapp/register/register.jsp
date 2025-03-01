<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container">

		<h2>User Register Form</h2>
		<div class="col-md-6 col-md-offset-3">
			<div class="alert alert-success center" role="alert">
				<p>${NOTIFICATION}</p>
			</div>

			<form action="<%=request.getContextPath()%>/register" method="post">

				<div class="form-group">
					<label for="fullname">Full Name:</label> <input type="text"
						class="form-control" id="fullname" placeholder="Enter your Full Name"
						name="fullName" required>
				</div>

				<div class="form-group">
					<label for="email">Email:</label> <input type="text"
						class="form-control" id="email" placeholder="Emter your Email"
						name="email" required>
				</div>

				<div class="form-group">
					<label for="uname">User Name:</label> <input type="text"
						class="form-control" id="username" placeholder="Enter User Name"
						name="username" required>
				</div>

				<div class="form-group">
					<label for="uname">Password:</label> <input type="password"
						class="form-control" id="password" placeholder="Enter Password"
						name="password" required>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>

			</form>
		</div>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>