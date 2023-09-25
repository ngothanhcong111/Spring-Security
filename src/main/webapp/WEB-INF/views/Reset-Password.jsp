<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="c" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RESET PASSWORD</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
	
</head>
<body>
	<form action="${c}/changePassword" method="post" class="form-control" >
	
		<div class="card text-center" style="width: 300px; margin-left: 450px;
    margin-top: 100px;">
			<div class="card-header h5 text-white bg-primary">Password
				Reset</div>
				<h3 style="color: red ; font-size: 20px; margin-top: 5px; margin-bottom: -10px"  >${message}</h3>
			<div class="card-body px-5">
				<p class="card-text py-2" >Enter your new  password .</p>
				<div class="form-outline">
					<input name='password' type="password" id="password" class="form-control my-3" /> <label
						class="form-label" for="typePassword">Password</label>
				</div>
				<div class="form-outline">
					<input name='confirmPassword' type="password" id="confirmPassword" class="form-control my-3" /> <label
						class="form-label" for="typePassword">Confirm Password</label>
				</div>
				
				
				 <input type="hidden" name="username"  value="${username}" >

				<input value="Update Password" type="submit" class="btn btn-primary w-100" >
				
			</div>
		</div>
	</form>
</body>
</html>