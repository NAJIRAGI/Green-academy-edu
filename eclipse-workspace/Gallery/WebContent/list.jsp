<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, td,th {
		border: 1px solid #222;
		border-collapse: collapse;
		padding: 5px;		
	}
</style>
</head>
<body>
	<h2>자유 게시판</h2>
	<form method="post" action="BoardInsert.do">
		<table>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>내용</th>
				<th>등록 날짜</th>
				<th>조회수</th>
			</tr>		
		</table>
	</form>
</body>
</html>