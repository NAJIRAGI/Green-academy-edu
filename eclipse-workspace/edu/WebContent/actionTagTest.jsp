<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userid = request.getParameter("id");
		String userpwd = request.getParameter("pwd");
		String userchk = request.getParameter("chk_user");
		
		if(userchk.equals("manager")) {
			%> <jsp:forward page = "managerMain.jsp">
			   <jsp:param value ='<%=URLEncoder.encode("이성재", "UTF-8")%>' name="userName"/>
			   </jsp:forward>
		<% } else{%>	
				<jsp:forward page = "userMain.jsp">
				<jsp:param value ='<%=URLEncoder.encode("이성재","UTF-8")%>' name = "userName"/>
				</jsp:forward>
				<%}%>
				
</body>
</html>