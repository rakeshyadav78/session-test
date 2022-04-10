<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/loginSignup.css">

<script src="resources/js/jquery-3.5.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/signup.js"></script>

</head>


<body>
	<div class="cotainer" style="margin-top: 20px;" id="regContainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card" id="loginCard">
					<div class="card-body">
						<div>

							<div class="row">
								<div class="col-md-12">
									<h5>Registration</h5>
								</div>
							</div>

							<br>

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<label for="email">Your Email</label> <input type="text"
											name="email" id="email" class="form-control"
											placeholder="Email" aria-describedby="">
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<label for="password">Password</label> <input type="password"
											name="password" id="password" class="form-control"
											placeholder="password" aria-describedby="">
									</div>
									<p></p>
								</div>

							</div>
							<br>
							<div class="row">
								<div class="col-md-6">
									<button type="button" class="btn btn-primary btn-block"
										id="btnSignUp">Sign Up</button>
								</div>
								<div class="col-md-6">
									<button type="button" class="btn btn-primary btn-block"
										id="btnAlreadyAccount" onclick="clickBtnAlreadyAccount()">Already
										Have Account?</button>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>

</html>