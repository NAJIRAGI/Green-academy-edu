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
	<form method = "get" action = "addMember.jsp">
		<label for = "userid">이름 : </label> 
		<input type = "text" name = "name" id = "name"><br>
		<label for = "userid">아이디 : </label> 
		<input type = "text" name = "userid" id = "userid"><br>
		<label for = "userid">별명 : </label> 
		<input type = "text" name = "nickname" id = "nickname"><br>
		<label for = "userid">비밀번호 : </label> 
		<input type = "password" name = "pwd" id = "pwd"><br>
		<label for = "userid">이메일 : </label> 
		<input type = "email" name = "email" id = "email"><br>
		<label for = "userid">전화번호 : </label> 
		<input type = "tel" name = "phone" id = "phone"><br>
		<input type = "submit" value = "전송">
		<input type = "reset" value = "취소">
	</form>
</body>
</html>