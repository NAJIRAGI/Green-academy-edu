<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border='1'>
		<tr>
			<th>이름</th>
			<th>지역</th>
			<th>주민번호</th>			
		</tr>

	<%try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from emp");
			
			while(rs.next()) {
				out.print("<tr>");
				out.print("<td>" + rs.getString("name")+"</td>");
				out.print("<td>" + rs.getString("address")+"</td>");
				out.print("<td>" + rs.getString("ssn")+"</td>");			
				out.print("</tr>");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	%>
</table>
</body>
</html>