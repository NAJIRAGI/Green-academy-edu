<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="fruitSelect.jsp">		
		<select id = "fruit" name = "fruit" size = "1">		
			<option value="1"> 사과 </option>
			<option value="2"> 바나나 </option>
			<option value="3"> 포도 </option>			
		</select>	
		<br><br>
		<input type = "submit" value = "전송">
	</form>
</body>
</html>