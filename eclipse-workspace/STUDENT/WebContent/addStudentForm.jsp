<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생 등록</h2>
	<form action="addStudent.jsp" method="post">
		<input type="text" name="name" placeholder="학생이름" required><br>
		<input type="text" name="cname" placeholder="반" required><br>
		<input type="number" name="kor" placeholder="국어점수" required><br>
		<input type="number" name="eng" placeholder="영어점수" required><br>
		<input type="number" name="mat" placeholder="수학점수" required><br>
		<input type="number" name="his" placeholder="한국사점수" required><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>