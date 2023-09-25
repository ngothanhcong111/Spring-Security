<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="c" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOVIES</title>
<link rel="stylesheet" href="./resources/css/home-movies.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="shortcut icon" href="${c}/resources/img/movie-img/movie.png" type="image/x-icon">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@1,200&display=swap');
      </style>
</head>
	
<body>

    <header>
        <video src="${c}/resources/video/money heist.mp4" autoplay muted></video>
        <nav>
            <div class="logo_ul">
                <img src="${c}/resources/img/movie-img/logo.png" alt="">
                <ul>
                    <li>
                        <a href="#"> Home</a>
                    </li>
                        
                    <li>
                        <a href="#" id="movies">Movies</a>
                    </li>

                    <li>
                        <a href="#" id = "series">Series</a>
                    </li>

                    <li>
                        <a href="#">Kids</a>
                    </li>
                    
                </ul>
            </div>
            <div class="search_user">
                <input type="text" placeholder="search....." id="search_input">
                <img src="${c}/resources/img/movie-img/user.jpg" alt="">
                <div class="search">
                    <!-- <a href="#" class="card">
                        <img src="/assets/img/the boys.jpg" alt="">
                        <div class="cont">
                            <h3>
                                The Boys
                            </h3>
                            <p>
                                Action,2021, <span>IMDB</span> <i class="bi bi-star-fill"> </i> 9.6
                            </p>
                        </div>
                    </a> -->
                    

                </div>
                <ul>
                    <li>
                        <a href="#"> <i><c:out value="${userId}"></c:out> </i></a>
                        <a href="logout">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="content">
              <h1 id="title">Money Heist</h1>
              <p>Money Heist is a Spanish heist crime drama television series created by Álex Pina. The series traces two long-prepared heists led by the Professor (Álvaro Morte), one on the Royal Mint of Spain, and one on the Bank of Spain, told from the perspective of one of the robbers, Tokyo (Úrsula Corberó)
            </p> 
              <div class="details">
                <h6> A Netflix original Film</h6>
                <h5 id="gen"> Thriller</h5>
                <h4 id="date"> 2021</h4>
                <h3 id="rate">
                    <span>IMDB</span> <i class="bi bi-star-fill"> </i> 9.6
                </h3>
              </div>
              <div class="btns">
                <a href="#" id="play"> Watch <i class="bi bi-play-fill"> </i></a>
                <a href="#" id = "dowload_main"> <i class="bi bi-cloud-arrow-down-fill"></i></a>
              </div>

        </div>
        <section>
            <h4>
                Popular
            </h4>
            <i class="bi bi-chevron-left"> </i>
            <i class="bi bi-chevron-right"> </i>
            <div class="cards">
                <!-- <a href="#" class="card">
                    <img src="assets/img/the boys.jpg" alt="" class="poster">
                    <div class="rest_card">
                        <img src="assets/img/the boys1.jpg" alt="">
                        <div class="cont">
                            <h4>
                                The Boys
                            </h4>
                            <div class="sub">
                                <p>
                                    Action , 2022
                                </p>
                                <h3>
                                    <span>IMDB</span> <i class="bi bi-star-fill"> </i> 9.6
                                </h3>
                            </div>
                        </div>
                    </div>

                </a> -->

            </div>
        </section>

    </header>
    <script src="${c}/resources/js/app.js" ></script>
</body>
</html>