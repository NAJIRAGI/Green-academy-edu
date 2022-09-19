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
	Cookie c = new Cookie("id","kkamagui"); // 변수를 이용한 쿠키 객체 생성
	response.addCookie(c); // 생성한 쿠키 클라이언트로 전송
	response.addCookie(new Cookie("pwd","1234")); // 쿠키 객체 생성과 동시에 클라이언트로 전송
	response.addCookie(new Cookie("age","28"));	
%>
<h3>쿠키가 생성되었습니다.</h3>
<a href="getCookies.jsp">생성된 쿠키 확인</a>
</body>
</html>