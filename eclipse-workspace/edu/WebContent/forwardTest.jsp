<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = "Lee";
	int age = Integer.parseInt(request.getParameter("age"));
	
	if(age <= 19){
		%>
		<script type="text/javascript">
		alert("성인만 입장 가능합니다");
		history.go(-1);
		</script>
	<%	
	}else {
		request.setAttribute("name", "Lee");
		RequestDispatcher dispatcher = request.getRequestDispatcher("forwardResult.jsp");
		dispatcher.forward(request, response);
	}

%>
</body>
</html>