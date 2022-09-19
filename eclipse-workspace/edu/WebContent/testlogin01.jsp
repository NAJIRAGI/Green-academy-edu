<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Your Profile (기존 방식)<br>
ID : <%=request.getParameter("id") %> <br>
PW : <%=request.getParameter("pwd") %> <br>
<hr>
Your Profile (EL 방식)<br>
ID : ${param.id} <br>
PW : ${param["pwd"]} <br>

</body>
</html>