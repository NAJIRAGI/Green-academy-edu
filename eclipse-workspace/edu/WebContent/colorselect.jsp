<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="getcolor.jsp">		
		<select id = "color" name = "color" size = "1">		
			<option value="1"> 빨강 </option>
			<option value="2"> 파랑 </option>
			<option value="3"> 노랑 </option>			
		</select>	
		<br><br>
		<input type = "submit" value = "전송">
	</form>
</body>
</html>