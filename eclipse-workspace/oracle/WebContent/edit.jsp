<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.oracle.dto.BoardVO, com.oracle.dao.BoardDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="bVo" class="com.oracle.dto.BoardVO"/>
<jsp:useBean id="bdo" class="com.oracle.dao.BoardDAO"/>
<jsp:setProperty name="bVo" property="*"/>
<%
	bdo.update(bVo);
	pageContext.setAttribute("bVo",bVo);
%>
<c:redirect url="/boardDetail.jsp?num=${bVo.num}"></c:redirect>