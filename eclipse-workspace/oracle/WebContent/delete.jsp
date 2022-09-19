<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="bdo" class="com.oracle.dao.BoardDAO"/>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	
	bdo.delete(num);
%>
<c:redirect url="/list.jsp"></c:redirect>