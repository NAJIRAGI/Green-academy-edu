<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="gesipan.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% 
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="gvo" class="gesipan.gesipanVo"/>
<jsp:useBean id="dao" class="gesipan.gesipanDao"/>
<jsp:setProperty name="gvo" property="*"/>


<%
	dao.update(gvo);
	pageContext.setAttribute("gvo", gvo);
%>
<c:redirect url="/gesipanDetail.jsp?num=${gvo.num}"></c:redirect>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>