<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="c" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>EDIT USER</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${c}/resources/css/Sign-Up.css">
</head>
<body>
	<section class="vh-100 bg-image"
  style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Edit User</h2>		 
              <form action="${c}/update" method= "post"  >
             
							
                <div class="form-outline mb-4">
                  <input type="text" id="form3Example1cg" class="form-control form-control-lg" value="${account.username}" name="username" />
                  <label class="form-label" for="form3Example1cg">User Name</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="email" id="form3Example3cg" class="form-control form-control-lg" value="${account.email}" name="email" />
                  <label class="form-label" for="form3Example3cg">Your Email</label>
                </div>
                
                <div class="form-outline mb-4">
                  <input type="text" id="form3Example1cg" class="form-control form-control-lg" value="${account.phone}" name="phone" />
                  <label class="form-label" for="form3Example1cg">Phone</label>
                </div>
                
                
				<div class="form-outline mb-4">
				<label class="form-label" for="form3Example1cg">Gender</label>
				<div class="col" style="display: inline-block;">
               <div class="form-check">
				  <input class="form-check-input" type="radio" name="gender"  value="1"  <c:if test="${user.gender}" var="1"></c:if> checked id="maleGender"/>
				  <label class="form-check-label" for="maleGender">
				    male
				  </label>
				</div>
				
				<div class="form-check ">
				  <input class="form-check-input" type="radio" name="gender" value="0" <c:if test="${not user.gender}" var="0"></c:if> id="famaleGender" checked >
				  <label class="form-check-label" for="famaleGender">
				    famale
				  </label>
				</div>
               </div>
               </div>
                                
                 <div class="form-outline mb-4">
                  <input type="date" id="form3Example1cg" class="form-control form-control-lg" value="${account.birthDay}" name="birthDay" />
                  <label class="form-label" for="form3Example1cg">Birth Day</label>
                </div>
                

                <div class="form-outline mb-4">
                  <input type="password" id="form3Example4cg" class="form-control form-control-lg" value="${account.password}" name="password" />
                  <label class="form-label" for="form3Example4cg">Password</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="password" id="form3Example4cdg"  class="form-control form-control-lg" value="${account.password}"  />
                  <label class="form-label" for="form3Example4cdg">Repeat your password</label>
                </div>

                <div class="d-flex justify-content-center">
                  <button type="submit"
                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" >Update</button>
                </div>

              </form>
				
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>