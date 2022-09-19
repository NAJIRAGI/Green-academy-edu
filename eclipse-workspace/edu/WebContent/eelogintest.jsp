<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	String id = "lsj";
	String pw = "1234";
	String name = request.getParameter("name");
	
	
	
	request.setCharacterEncoding("UTF-8");
	if(id.equals(request.getParameter("userid"))) {
		%>
		<script>
			alert("이미 있는 회원 정보입니다.");
			history.go(-1);
		</script>
<%			
	}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("eemain.jsp");
		dispatcher.forward(request, response);
	}
	%>

</body>
</html>