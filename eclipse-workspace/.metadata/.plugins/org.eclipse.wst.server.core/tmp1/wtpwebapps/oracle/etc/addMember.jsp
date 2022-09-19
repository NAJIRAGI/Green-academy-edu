<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%!
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "hr";
	String pass = "1234";
	String sql = "insert into member values(?,?,?,?,?,?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	try{
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pass);
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, name);
		psmt.setString(2, userid);
		psmt.setString(3, pwd);
		psmt.setString(4, email);
		psmt.setString(5, phone);
		psmt.setInt(6, Integer.parseInt(admin));
		psmt.executeUpdate();
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	%>
	<h3>회원 가입 성공</h3>
	<a href="test.jsp">회원 목록 보기</a>
</body>
</html>