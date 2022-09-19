<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.student.Dao.*,com.student.VO.*, java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dao" class="com.student.Dao.StudentDao"/>
<jsp:useBean id="vo" class="com.student.VO.StudentVo"/>
<jsp:setProperty name="vo" property="*"/>
<%
	dao.update(vo);
	pageContext.setAttribute("vo", vo);
%>
<c:redirect url="/studentDetail.jsp?num=${vo.stuno}"></c:redirect>
