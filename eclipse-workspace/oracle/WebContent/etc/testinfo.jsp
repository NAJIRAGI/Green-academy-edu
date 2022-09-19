<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%!
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "hr";
	String pass = "1234";
	String sql = "SELECT * FROM GAME WHERE NAME = ?";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>