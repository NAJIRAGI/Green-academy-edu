<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	BoardDAO bdo = new BoardDAO();
	List<BoardVO> ls = bdo.selectAll();
	pageContext.setAttribute("ls", ls);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시글 목록</h2>
<table border="1">

	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>등록일</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="board" items="${ls}">
	<tr>
		<td>${board.num}</td>
		<td><a href="${pageContext.request.contextPath}/boardDetail.jsp?num=${board.num}">${board.title}</a></td>
		<td>${board.nickname}</td>
		<td>${board.hiredate}</td>
		<td>${board.cnt}</td>
	</tr>
	</c:forEach>
</table>		
<a href="<c:url value="/registForm.jsp"/>"><button>글 등록</button></a>
</body>
</html>

