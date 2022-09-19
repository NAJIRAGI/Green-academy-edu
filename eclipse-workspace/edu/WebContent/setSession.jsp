<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	session.setAttribute("id", "kkamagui");
	session.setAttribute("pwd","1234");
	session.setAttribute("age",28);
	%>
	<h3>세션 설정이 완료되었습니다.</h3>
	<a href="getSessions.jsp">설정된 세션 배열로 확인하러 가기</a><br>
	<a href="getSession.jsp">설정된 세션 확인하러 가기</a>
</body>
</html>