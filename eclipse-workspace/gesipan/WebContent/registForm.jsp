<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regist.jsp" method="post"> 
		<div>
			<label>title</label>
			<input type="text" id="title" name="title" placeholder="Enter Title">
		</div>
		<div>
			<label>writer</label>
			<input type="text" id="writer" name="writer" placeholder="Enter Writer">
		</div>
		<div>
			<label>content</label>
			<textarea rows="5" cols="5" id="content" name="content" placeholder="Enter Content"></textarea>
		</div>
		<input type="submit" value="Upload">
	</form>
	

</body>
</html>