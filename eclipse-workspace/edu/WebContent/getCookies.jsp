<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>생성된 쿠키 정보</h3>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie c : cookies) {
		out.print(c.getName() + " : " + c.getValue()+"<br>");
	}
%>
<a href="removeCookies.jsp">생성된 쿠키 삭제</a>
</body>
</html>