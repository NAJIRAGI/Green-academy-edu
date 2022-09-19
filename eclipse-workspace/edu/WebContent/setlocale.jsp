<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>"/>
	<pre>
	기본값  : <%=response.getLocale() %>
	<fmt:setLocale value="ko_kr"/>
	한국어권 :  <%=response.getLocale() %>
	통화 : <fmt:formatNumber value="10000" type="currency"/>
	날짜 : <fmt:formatDate value="${now}"/>
	<fmt:setLocale value="ja_JP"/>
	일본어권 :  <%=response.getLocale() %>
	통화 : <fmt:formatNumber value="10000" type="currency"/>
	날짜 : <fmt:formatDate value="${now}"/>
	<fmt:setLocale value="en_US"/>
	영어권 :  <%=response.getLocale() %>
	통화 : <fmt:formatNumber value="10000" type="currency"/>
	날짜 : <fmt:formatDate value="${now}"/>
	</pre>
</body>
</html>