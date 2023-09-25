<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="c" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${c}/resources/css/edit-movie.css">

<title>EDIT MOVIE</title>
</head>
<body>

	<form action="${c}/updateMovie" method="post">
	<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100" >
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Update Movie Form</h3>
            

              <div class="row">
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <input type="text" name="name" id="name" value="${editMovies.name}" class="form-control form-control-lg" />
                    <label class="form-label" for="tName">Name</label>
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <input type="text" id="lastName" name="imdb" value="${editMovies.imdb}" class="form-control form-control-lg" />
                    <label class="form-label" for="IMDB">IMDB</label>
                  </div>

                </div>
              </div>

              <div class="row">
                <div class="col-md-6 mb-4 d-flex align-items-center">

                  <div class="form-outline datepicker w-100">
                    <input type="text" name="date" value="${editMovies.date}" class="form-control form-control-lg"  />
                    <label for="Date" class="form-label">Date</label>
                  </div>

                </div>
                
                <div class="col-md-6 mb-4 d-flex align-items-center">

                  <div class="form-outline datepicker w-100">
                    <input type="text" name="sposter" value="${editMovies.sposter}" class="form-control form-control-lg"  />
                    <label for="sposter" class="form-label">sposter</label>
                  </div>

                </div>
                
              </div>

              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <input type="text" id="bposter" name="bposter" value="${editMovies.bposter}" class="form-control form-control-lg" />
                    <label class="form-label" for="bposter">Bposter</label>
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <input type="text" id="phoneNumber" name="genre" value="${editMovies.genre}" class="form-control form-control-lg" />
                    <label class="form-label" for="Genre">Genre</label>
                  </div>

                </div>
              </div>
              
              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <input type="text" id="type" name="type" value="${editMovies.type}" class="form-control form-control-lg" />
                    <label class="form-label" for="emailAddress">Type</label>
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <input type="text" id="url" name="url" value="${editMovies.url}" class="form-control form-control-lg" />
                    <label class="form-label" for="phoneNumber">Url</label>
                  </div>

                </div>
              </div>
              
              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <input type="text" id="trailer" name="trailer" value="${editMovies.trailer}" class="form-control form-control-lg" />
                    <label class="form-label" for="trailer">Trailer</label>
                  </div>

                </div>
                
              </div>

              

              <div class="mt-4 pt-2">
                <input class="btn btn-primary btn-lg" type="submit" value="Update" />
                <a type="button" class="btn btn-primary btn-lg" style="margin-left: 300px" href="${c}/admin/listMovie" > Return</a>
              </div>
              
              

            
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form>
</body>
</html>