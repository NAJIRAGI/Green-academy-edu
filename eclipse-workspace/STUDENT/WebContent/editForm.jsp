<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.student.Dao.*,com.student.VO.*, java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="com.student.Dao.StudentDao"/>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	StudentVo vo = dao.selectOne(num);
	pageContext.setAttribute("vo", vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생 정보 수정</h2>
	<form action="edit.jsp" method="post">
		<input type="hidden" name="stuno" value="${vo.stuno}">
		<input type="text" name="name" value="${vo.name}" required disabled><br>
		<input type="text" name="cname" value="${vo.cname}" required disabled><br>
		<input type="number" name="kor" value="${vo.kor}" required><br>
		<input type="number" name="eng" value="${vo.eng}" required><br>
		<input type="number" name="mat" value="${vo.mat}" required><br>
		<input type="number" name="his" value="${vo.his}" required><br>
		<input type="submit" value="수정">
	</form>
</body>
</html>