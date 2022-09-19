<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="gesipan.*,java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	gesipanDao gdao = new gesipanDao();
	List<gesipanVo> ls = gdao.selectAll();
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
	<table border=1>
		<tr>
			<th>no</th>
			<th>title</th>
			<th>writer</th>
			<th>regdate</th>
			<th>view</th>
		</tr>
		<c:forEach var="gesipan" items="${ls}">
			<tr>
				<td>${gesipan.num}</td>
				<td><a href="${pageContext.request.contextPath}/gesipanDetail.jsp?num=${gesipan.num}">${gesipan.title}</a></td>
				<td>${gesipan.writer}</td>
				<td><fmt:formatDate value="${gesipan.regdate}" pattern="yyyy년MM월dd일 hh시mm분" /></td>
				<td>${gesipan.cnt}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="registForm.jsp"><button>글 등록하기</button></a>
	<a href="index.jsp"><button>홈으로</button></a>
	

</body>
</html>