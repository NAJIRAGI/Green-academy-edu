<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="com.oracle.dao.BoardDAO"/>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	BoardVO bVo = dao.selectOne(num);
	pageContext.setAttribute("bVo",bVo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 수정하기</h2>
<form action="edit.jsp" method="post">
	<input type="hidden" name="num" value="${bVo.num}">
	<input type="text" name="title" value="${bVo.title}" required><br>
	<input type="text" name="nickname" value="${bVo.nickname}" required disabled><br>
	<textarea rows="10" cols="25" name="text" placeholder="내용">${bVo.text}</textarea><br>
	<input type="submit" value="수정">
</form>

</body>
</html>