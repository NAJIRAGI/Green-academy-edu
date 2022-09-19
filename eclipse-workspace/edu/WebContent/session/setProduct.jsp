<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%  String name = (String)session.getAttribute("name");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
		<%if (session.getAttribute("name")==null) {
		response.sendRedirect("login.jsp");
	}
		%>
	<form  method = "get" action = "add.jsp">
	<h3><%=name %>님 환영합니다.</h3>
	<select id = "product" name="product" size="1">
							<option value="사과"> 사과 </option>
							<option value="귤" selected="selected"> 귤 </option>
							<option value="배"> 배 </option>
							<option value="포도"> 포도 </option>	
							<option value="감"> 감 </option>		
							<option value="자몽"> 자몽 </option>					
			</select>
			<input type = "submit" value = "추가"><br>
			<a href="checkOut.jsp">장바구니</a>
	</form>
</body>
</html>