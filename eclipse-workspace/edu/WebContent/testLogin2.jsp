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
String id = request.getParameter("username");
String pwd = request.getParameter("password");
String name = "Lee";
session.setAttribute("username", id);
session.setAttribute("password", pwd);
String uid = (String) session.getAttribute("username");
String upw = (String) session.getAttribute("password");

String chkid = "kkamagui";
String chkpw = "1234";


if (chkid.equals(uid) && chkpw.equals(upw)) {	
	session.setAttribute("name", "Lee");
	%>
	<script>
		alert("로그인 성공");	
		location.href=("loginmain.jsp");
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