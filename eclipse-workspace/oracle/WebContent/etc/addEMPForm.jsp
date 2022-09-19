<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원의 정보 입력 폼</h2>
	<form method="post" action="addEMP.jsp">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>지역</td>
				<td><input type="text" name="address" size="20"></td>
			</tr>
			<tr>
				<td>주민번호</td>
				<td><input type="text" name="ssn" size="20"></td>
			</tr>			
			<tr>
				<td><input type="submit" value="전송"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>