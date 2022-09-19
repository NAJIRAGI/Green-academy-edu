<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	@SuppressWarnings("unchecked")
	ArrayList<String> list = (ArrayList<String>)session.getAttribute("productlist");
	String productname = request.getParameter("product");	

	if(list == null) {
		list = new ArrayList<String>();
		session.setAttribute("productlist",list);
	}
	list.add(productname);
%>
	<script>
		alert("<%=productname %>가(이) 추가되었습니다.");
		history.go(-1);
	</script>
</head>
<body>	
</body>
</html>