<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form method = "get" action = "actionTagTest.jsp">
		<label for = "userid">아이디 : </label> <input type = "text" name = "id" id = "id"><br>
		<label for = "userpwd"> 암 &nbsp; 호 : </label> <input type = "password" name = "pwd" id = "pwd"><br>
		<input type="radio" id="chk_user" name="chk_user" value="manager"> 관리자
		<input type="radio" id="chk_user" name="chk_user" value="user"> 사용자
		<input type = "submit" value = "로그인">
	</form>
</body>
</html>