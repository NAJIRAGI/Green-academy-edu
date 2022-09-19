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
	String sql = "insert into emp values(?,?,?)";
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
		String address = request.getParameter("address");
		String ssn = request.getParameter("ssn");	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pass);
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, name);
		psmt.setString(2, address);
		psmt.setString(3, ssn);		
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
	<h3>직원 등록 완료</h3>
	<a href="EMPCHK.jsp">목록 보기</a>
</body>
</html>