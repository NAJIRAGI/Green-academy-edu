<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="movie" class="com.edu.test.MovieBean" />
<jsp:setProperty name="movie" property="*" />

제목 : <jsp:getProperty property="title" name="movie"/><br>
가격 : <jsp:getProperty property="price" name="movie"/><br>
감독 : <jsp:getProperty property="director" name="movie"/><br>
출연 배우 : <jsp:getProperty property="actor" name="movie"/><br>
시놉시스 : <jsp:getProperty property="synopsis" name="movie"/><br>
장르 : <jsp:getProperty property="genre" name="movie"/><br>
</body>
</html>