<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="age" value="30" scope="page"></c:set>
나이 :	<c:out value="${age}">10</c:out> <!-- 설정된 변수값 30이 출력 -->
		<br>
		<c:remove var="age" scope="page"></c:remove>
나이 :	<c:out value="${age}">10</c:out> <!-- 입력된 값 10이 출력 -->
</body>
</html>