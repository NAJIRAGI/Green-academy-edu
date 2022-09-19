<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import = "com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO" %>
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
<p>번호 : ${bVo.num}</p>
<p>제목 : ${bVo.title}</p>
<p>작성자 : ${bVo.nickname}</p>
<p>내용 : ${bVo.text}</p>
<p>등록일자 : ${bVo.hiredate}</p>
<p>조회수 : ${bVo.cnt}</p>

<a href="<c:url value="/list.jsp"/>"><button>뒤로가기</button></a>
<c:if test="${loginUser.userid == bVo.nickname}">
	<a href="<c:url value="/editForm.jsp?num=${bVo.num}"/>"><button>수정</button></a>
	<a href="<c:url value="/deleteForm.jsp?num=${bVo.num}"/>"><button>삭제</button></a>
</c:if>
</body>
</html>