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
String id = request.getParameter("id");
session.setAttribute("id", id);

String chkid = "이성재";

if (chkid.equals(id)) {	
	session.setAttribute("name", "이성재");
	%>
	<script>
		alert("로그인 성공");	
		location.href=("setProduct.jsp");
	</script>	
	<%	
	} else {%>
	<script>
		alert("로그인 실패");
		history.go(-1);
	</script>
<%}%>

</body>
</html>