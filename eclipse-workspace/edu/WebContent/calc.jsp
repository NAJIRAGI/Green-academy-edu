<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	더하기 계산기
	<form method = "get" action = "calcSum.jsp">
		<label for = "one">식 1 : </label> <input type = "text" name = "one" id = "one"><br>
		<label for = "two">식 2 : </label> <input type = "text" name = "two" id = "two"><br>
		<input type = "submit" value = "계산">
	</form>

</body>
</html>