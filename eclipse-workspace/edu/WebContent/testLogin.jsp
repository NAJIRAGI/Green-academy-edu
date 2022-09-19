<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String id = "kkamagui";
	   String pw = "1234";
	   String name = "Lee";
	   
	   request.setCharacterEncoding("UTF-8");
	   if (id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pwd"))) {
		   response.sendRedirect("main2.jsp?name=" + URLEncoder.encode(name,"UTF-8"));
	   }else {		   
		   response.sendRedirect("loginForm.jsp");
	   }
	%>
</body>
</html>