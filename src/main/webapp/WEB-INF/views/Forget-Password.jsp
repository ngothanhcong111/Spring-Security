<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="c" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORGET PASSWORD</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<form action="forgetPassword" method="post" class="form-control" >
	
		<div class="card text-center" style="width: 300px; margin-left: 450px;
    margin-top: 100px;">
			<div class="card-header h5 text-white bg-primary">Password
				Reset</div>
				<h3 style="color: red;font-size: 20px;">${message}</h3>
				
			<div class="card-body px-5">
				<p class="card-text py-2">Enter your email address and we'll
					send you an email with instructions to reset your password.</p>
				<div class="form-outline">
					<input type="email" id="typeEmail" class="form-control my-3" name="email"  /> <label
						class="form-label" for="typeEmail">Email input</label>
				</div>
				
				<input value="Send" type="submit" class="btn btn-primary w-100" >
				
				
				<div class="d-flex justify-content-between mt-4">
					<a class="" href="login">Login</a> <a class="" href="register">Register</a>
				</div>
			</div>
		</div>
	</form>
</body>
</html>