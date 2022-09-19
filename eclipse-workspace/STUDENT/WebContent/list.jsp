<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.student.Dao.*,com.student.VO.*, java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	StudentDao dao = new StudentDao();
	List<StudentVo> ls = dao.selectAll();
	pageContext.setAttribute("ls", ls);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생 목록</h2>
		<table border="1">
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>반</th>
				<th>국어점수</th>
				<th>영어점수</th>
				<th>수학점수</th>
				<th>한국사점수</th>
			</tr>
				<c:forEach var = "student" items="${ls}">		
			<tr>
				<td>${student.stuno}</td>
				<td><a href="${pageContext.request.contextPath}/studentDetail.jsp?num=${student.stuno}">${student.name}</a></td>
				<td>${student.cname}</td>
				<td>${student.kor}</td>
				<td>${student.eng}</td>
				<td>${student.mat}</td>
				<td>${student.his}</td>			
			</tr>			
				</c:forEach>	
		</table>
		<a href="<c:url value="/addStudentForm.jsp"/>"><button>학생 등록</button></a>		
</body>
</html>