<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.student.Dao.*,com.student.VO.*, java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dao" class="com.student.Dao.StudentDao"/>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	dao.delete(num);
%>
<c:redirect url="/list.jsp"></c:redirect>