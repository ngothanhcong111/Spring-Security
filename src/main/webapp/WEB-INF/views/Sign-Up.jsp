<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="c" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>SIGN UP</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${c}/resources/css/Sign-Up.css">
</head>
<body>
	<section class="vh-100 bg-image"
		style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
		<div
			class="mask d-fl
  ex align-items-center h-100 gradient-custom-3">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<h2 class="text-uppercase text-center mb-5">Create an
									account</h2>
								<h3 style="color: red;font-size: 20px;margin-bottom: 10px"   >${message}</h3>

								<form id="register" action="register" method="post">
										
									<div class="form-outline mb-4">
										<input type="text" id="username"
											class="form-control form-control-lg" name="username" required placeholder="Enter Username" /> <label
											class="form-label" for="form3Example1cg">User Name</label>
									</div>

									<div class="form-outline mb-4">
										<input type="email" id="email"
											class="form-control form-control-lg" name="email" required placeholder="Enter Email" /> <label
											class="form-label" for="form3Example3cg">Your Email</label>
									</div>

									<div class="form-outline mb-4">
										<input type="text" id="phone"
											class="form-control form-control-lg" name="phone" required placeholder="Enter Phone" /> <label
											class="form-label" for="form3Example1cg">Phone</label>
									</div>


									<div class="form-outline mb-4">
										<label class="form-label" for="form3Example1cg"  >Gender</label>
										<div class="col" style="display: inline-block;">
											<div class="form-check">
												<input class="form-check-input" type="radio" name="gender"
													id="maleGender" value="1"  > <label
													class="form-check-label" for="maleGender"> male </label>
											</div>

											<div class="form-check ">
												<input class="form-check-input" type="radio" name="gender"
													id="famaleGender" checked value="0"> <label
													class="form-check-label" for="famaleGender"> famale
												</label>
											</div>
										</div>
									</div>

									<div class="form-outline mb-4">
										<input type="date" id="birthDay"
											class="form-control form-control-lg" name="birthDay" required placeholder="Enter BirthDay" /> <label
											class="form-label" for="form3Example1cg">Birth Day</label>
									</div>


									<div class="form-outline mb-4">
										<input type="password" id="password"
											class="form-control form-control-lg" name="password" required placeholder="Enter Password" /> <label
											class="form-label" for="form3Example4cg">Password</label>
									</div>

									<div class="form-outline mb-4">
										<input type="password" id="confirmPassword" name="confirmPassword" 
											class="form-control form-control-lg"  required placeholder="Enter Confirm Password" /> <label
											class="form-label" for="form3Example4cdg">Repeat your
											password</label>
									</div>

									<div class="d-flex justify-content-center">
										<button type="submit" id="create"
											class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
									</div>

									<p class="text-center text-muted mt-5 mb-0">
										Have already an account? <a href="${c}/login"
											class="fw-bold text-body"><u>Login here</u></a>
									</p>

								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script>
	
		
	</script>
</body>
</html>