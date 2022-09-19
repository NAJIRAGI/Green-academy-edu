<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label {
width : 100px;
display: inline-block;
}
</style>
</head>
<body>
	<form method = "get" action = "movieWrite.jsp">
		<label for = "userid">제목 : </label> 
		<input type = "text" name = "title" id = "title"><br>
		<label for = "userid">가격 : </label> 
		<input type = "text" name = "price" id = "price"><br>
		<label for = "userid">감독 : </label> 
		<input type = "text" name = "director" id = "director"><br>
		<label for = "userid">출연 배우 : </label> 
		<input type = "text" name = "actor" id = "actor"><br>
		<label for = "userid">시놉시스 : </label> 
		<textarea rows="20" cols="30" name="synopsis"></textarea><br>
		<label for = "genre"> 장르 :  </label>
		<select id = "genre" name = "genre" size = '1'>
			<option value = "액션"> 액션 </option>
			<option value = "멜로"> 멜로 </option>
			<option value = "코메디"> 코메디 </option>
			<option value = "호러"> 호러 </option>		
		</select><br>
		<input type = "submit" value = "등록">
		<input type = "reset" value = "초기화">
	</form>
</body>
</html>