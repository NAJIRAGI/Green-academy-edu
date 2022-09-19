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
	Cookie cookie = new Cookie("pwd", "");
	Cookie cookie2 = new Cookie("age", "");
	cookie.setMaxAge(0);
	cookie2.setMaxAge(0);
	response.addCookie(cookie);
	response.addCookie(cookie2);
%>
<h3>쿠키가 삭제되었습니다.</h3>
<a href="getCookies.jsp">생성된 쿠키 확인</a>
</body>
</html>