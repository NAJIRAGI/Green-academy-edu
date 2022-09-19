<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.oracle.dto.MemberVO, com.oracle.dao.MemberDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id = "dao" class="com.oracle.dao.MemberDAO"/>

<%
	String userid = request.getParameter("userid");
	MemberVO mVo = dao.selectOne(userid);
	pageContext.setAttribute("mVo", mVo);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 정보</h2>
	<p>NAME : ${mVo.name}</p>
	<p>ID : ${mVo.userid}</p>
	<p>PASSWORD : ${mVo.pwd}</p>
	<p>E-MAIL : ${mVo.email}</p>
	<p>PHONE : ${mVo.phone}</p>
	<p>ADMIN : ${mVo.admin}</p>
	<a href="<c:url value="/memberlist.jsp"/>"><button>뒤로가기</button></a>
	<a href="<c:url value="/membereditForm.jsp?userid=${mVo.userid}"/>"><button>수정</button></a>
	<a href="<c:url value="/memberdeleteForm.jsp?num=${mVo.userid}"/>"><button>삭제</button></a>
</body>
</html>