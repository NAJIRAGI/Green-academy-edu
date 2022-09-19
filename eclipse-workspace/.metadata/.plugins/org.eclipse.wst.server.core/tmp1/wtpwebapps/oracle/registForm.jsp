<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 등록하기</h2>
<form action="regist.jsp" method="post">
	<input type="text" name="title" placeholder="제목" required><br>
	<input type="text" name="nickname" value="${loginUser.userid}" required readonly><br>
	<textarea rows="10" cols="25" name="text" placeholder="내용"></textarea><br>
	<input type="submit" value="등록">
</form>

</body>
</html>