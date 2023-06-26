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
</head>
<body>
	<div class="container">
		<h1>회원 정보 리스트</h1>
		<table class="table text-center">
			<thead>
				<tr>
					<th>No</th>
					<th>이름</th>
					<th>전화 번호</th>
					<th>국적</th>
					<th>이메일</th>
					<th>자기소개</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${members}" var="member" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${member.name}</td>
					<td><fmt:formatNumber value="${candidate}" /></td>
					<td><fmt:formatNumber type="percent" value="${candidate / totalCount}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>