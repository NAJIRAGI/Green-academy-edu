<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
페이지 : <%= pageContext.getAttribute("name") %><br>
요청 : <%= request.getAttribute("name") %><br>
세션 : <%= session.getAttribute("name") %><br>
앱 : <%= application.getAttribute("name") %><br>
<a href="thirdpage.jsp"> 이동 </a>
</body>
</html>