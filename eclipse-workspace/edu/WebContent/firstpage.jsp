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
	pageContext.setAttribute("name","Page Man");
	request.setAttribute("name", "Request Man");
	session.setAttribute("name", "Session Man");
	application.setAttribute("name","Application Man");
	System.out.println("firstpage.jsp : ");
	System.out.println("페이지 : " + pageContext.getAttribute("name"));
	System.out.println("요청 : " + request.getAttribute("name"));
	System.out.println("세션 : " + session.getAttribute("name"));
	System.out.println("앱 : " + application.getAttribute("name"));
	request.getRequestDispatcher("secondpage.jsp").forward(request, response);
%>
</body>
</html>