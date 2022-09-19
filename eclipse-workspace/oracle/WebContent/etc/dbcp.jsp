<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.InitialContext"
		 import="javax.sql.DataSource"
         import="javax.naming.Context" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Context initContext = new InitialContext();
	Context envContext = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
	out.println("DBCP 연동 완료");
	%>
</body>
</html>