<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.oracle.dto.*, com.oracle.dao.*, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	MemberDAO dao = new MemberDAO();
	List<MemberVO> ls = dao.selectAll();
	pageContext.setAttribute("ls", ls);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 목록</h2>
<table border="1">

	<tr>
		<th>NAME</th>
		<th>ID</th>
		<th>PW</th>
		<th>EMAIL</th>
		<th>PHONE</th>
		<th>ADMIN</th>
	</tr>
	<c:forEach var="member" items="${ls}">
	<tr>
		<td>${member.name}</td>
		<td><a href="${pageContext.request.contextPath}/memberDetail.jsp?userid=${member.userid}">${member.userid}</a></td>
		<td>${member.pwd}</td>
		<td>${member.email}</td>
		<td>${member.phone}</td>
		<td>${member.admin}</td>
	</tr>
	</c:forEach>
</table>		
<a href="<c:url value="/main.jsp"/>"><button>MAIN</button></a>
</body>
</html>

