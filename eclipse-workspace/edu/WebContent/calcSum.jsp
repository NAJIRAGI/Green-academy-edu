<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	고전 방식<br>
	<% int a = Integer.parseInt(request.getParameter("one"));
	   int b = Integer.parseInt(request.getParameter("two"));
	   
	   int sum = a+b;
	   out.print(a + "+" + b + "=" + sum);
	%>
	<hr>
	EL 방식<br>
	${param.one } + ${param.two } = ${param.one + param.two }
	
</body>
</html>