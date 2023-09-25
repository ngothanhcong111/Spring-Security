<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    	<c:set var="c" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>LIST FILM</title>
    <link rel="stylesheet" href="${c}/resources/css/list-movie.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  </head>
  <body>
  	<!-- NAVBAR  -->
  
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ADMIN SYSTEM</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${c}/admin">Home</a>
        </li>
        <li class="nav-item justify-content-end">
          <a class="nav-link md-4" href="listUser">LIST USER</a>
        </li>
        </ul>
    </div>
  </div>
</nav>


<!-- LIST  -->
<div class="container p-5 "> 
<a type="button" class="btn btn-primary"  style="margin-bottom: 3px" href="${c}/admin/listMovie/editMovie" >ADD</a>
<table class="table table-dark table-striped" >
  <thead class=" text-white" >
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Bposter</th>
      <th scope="col">Sposter</th>
      <th scope="col">Type</th>
      <th scope="col">Imdb</th>
      <th scope="col">Genre</th>
      <th scope="col">Url</th>
      <th scope="col">Date</th>
      <th scope="col">Trailer</th>
      <th scope="col">Edit</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  <tbody >
    <c:forEach var="listMovies" items="${listMovie}">
  	<c:url var="updateMovie" value="/admin/listMovie/edit/{name}" >
  		<c:param name="name" value="${listMovies.name}"></c:param>
  	 </c:url>
  	<c:url var="deleteMovie" value="/admin/listMovie/delete/{name}" >
  		<c:param name="name" value="${listMovies.name}"></c:param>	
  	 </c:url>
    <tr>
      <th scope="row">${listMovies.name}</th>
      <td>${listMovies.bposter}</td>
      <td>${listMovies.sposter}</td>
      <td>${listMovies.type}</td>
      <td>${listMovies.imdb}</td>
      <td>${listMovies.genre}</td>
      <td>${listMovies.url}</td>
      <td>${listMovies.date}</td>
      <td>${listMovies.trailer}</td>
      <td><a href="${updateMovie}" >Edit </a>  </td>
      <td><a href="${deleteMovie}" >Delete </a>  </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js" integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa" crossorigin="anonymous"></script>
  </body>
</html>
	
