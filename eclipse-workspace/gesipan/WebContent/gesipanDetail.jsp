<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="gesipan.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="dao" class="gesipan.gesipanDao"/>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	gesipanVo gvo = dao.selectOne(num);
	pageContext.setAttribute("gvo", gvo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상세 내용</h3>
	<p>no : ${gvo.num}</p>
	<p>title : ${gvo.title}</p>
	<p>writer : ${gvo.writer}</p>
	<p>content : ${gvo.content}</p>
	<p>regdate : <fmt:formatDate value="${gvo.regdate}" pattern="yyyy년MM월dd일 hh시mm분" /></p>
	<p>view : ${gvo.cnt}</p>
	<a href="editForm.jsp"><button>수정하기</button></a>
	<a href="deleteForm.jsp?num=${gvo.num}"><button>삭제하기</button></a>
	<a href="index.jsp"><button>홈으로</button></a>
</body>
</html>