<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div id="wrap">
		<section>
			<div>
				<img src="/image/logo.jpg">
				<ul class="nav">
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-weight-bold">날씨</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-weight-bold">날씨입력</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-weight-bold">테마날씨</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link text-dark font-weight-bold">관측 기후</a></li>
				</ul>
			</div>
			<div>
				<h1>과거 날씨</h1>
				<table class="table text-center">
					<thead>
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${weatherHistoryList}" var="weatherList" varStatus="status">
							<tr>
								<td>${weatherList.date}</td>
								<td>${weatherList.weather}</td>
								<td>${weatherList.temperatures}</td>
								<td>${weatherList.precipitation}</td>
								<td>${weatherList.microDust}</td>
								<td>${weatherList.windSpeed}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</section>
		<footer>
			<div id=footer-logo></div>
			<div class="small">(07062) 서울시 동작구 여의대방로16길 61</div>
			<div class="small">Copyright © marondal 2021</div>
		</footer>
	</div>
</body>
</html>