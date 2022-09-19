<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>배열로 세션 값 받아오기</h3>
	<%
	Enumeration<String> names = session.getAttributeNames();
	while(names.hasMoreElements()) {
		String name = names.nextElement().toString();
		String value = session.getAttribute(name).toString();
		out.print(name + " : " + value + "<br>");
	}
	%>
	
</body>
</html>