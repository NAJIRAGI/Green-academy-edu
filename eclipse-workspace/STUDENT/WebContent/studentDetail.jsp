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
	<p>학번 : ${vo.stuno}</p>
	<p>이름: ${vo.name}</p>
	<p>반 : ${vo.cname}</p>
	<p>국어 점수 : ${vo.kor}</p>
	<p>영어 점수 : ${vo.eng}</p>
	<p>수학 점수 : ${vo.mat}</p>
	<p>한국사 점수 : ${vo.his}</p>
<a href="<c:url value="/list.jsp"/>"><button>뒤로가기</button></a>
<a href="<c:url value="/editForm.jsp?num=${vo.stuno}"/>"><button>수정</button></a>
<a href="<c:url value="/deleteForm.jsp?num=${vo.stuno}"/>"><button>삭제</button></a>
</body>
</html>