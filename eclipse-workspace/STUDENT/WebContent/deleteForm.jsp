<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("num"));
	%>
	<form action="delete.jsp">
		<input type="hidden" value="<%=num%>" name="num"/>
		삭제하시겠습니까? <input type="submit" value="YES"/>
		<a href="<c:url value="/list.jsp"/>"><button>NO</button></a>
	</form>
</body>
</html>