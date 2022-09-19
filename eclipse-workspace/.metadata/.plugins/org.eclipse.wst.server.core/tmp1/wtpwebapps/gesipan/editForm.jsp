<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="gesipan.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<form action="edit.jsp" method="post"> 
		<div>
			<input type="hidden" name="num" value="${vo.num}">
			<label>title</label>
			<input type="text" id="title" name="title" value="${vo.title}">
		</div>
		<div>
			<label>writer</label>
			<input type="text" id="writer" name="writer" value="${vo.writer}" disabled>
		</div>
		<div>
			<label>content</label>
			<textarea rows="5" cols="5" id="content" name="content" >${vo.content}</textarea>
		</div>
		<input type="submit" value="Update">
	</form>

</body>
</html>