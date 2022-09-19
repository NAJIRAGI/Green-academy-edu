<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form method = "get" action = "research.jsp">
		<label for = "userid">이름 : </label> 
		<input type = "text" name = "name" id = "name"><br>
		<label for="gender">성별 : </label>
		<input type="radio" id="gender" name="gender" value="male" checked> 남자
		<input type="radio" id="gender" name="gender" value="female"> 여자
		<br>
		<label for = "season">계절 : </label>
		<input type="checkbox" name="season" value="1"> 봄
		<input type="checkbox" name="season" value="2"> 여름
		<input type="checkbox" name="season" value="3"> 가을
		<input type="checkbox" name="season" value="4"> 겨울
		<br>
		<input type = "submit" value = "전송">
		<input type = "reset" value = "취소">
	</form>
</body>
</html>