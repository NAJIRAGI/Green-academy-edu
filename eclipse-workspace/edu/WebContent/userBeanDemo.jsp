<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.edu.test.MemberBean" %>
<% MemberBean member = new MemberBean(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
setter 전 값<br>
	이름 : <%=member.getName() %><br>
	아이디 : <%=member.getUserid() %><br>

===============================<br>
setter 지정 후 값<br>
<% member.setName("Lee"); 
   member.setUserid("kkamagui");%>
   
	이름 : <%=member.getName() %><br>
	아이디 : <%=member.getUserid() %><br>

</body>
</html>