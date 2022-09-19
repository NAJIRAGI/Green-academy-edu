<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
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
	<%
		
		@SuppressWarnings("unchecked")
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("productlist");
	if(list == null) {
		list = new ArrayList<String>();
		session.setAttribute("productlist",list);
	}
		

		for (int i = 0; i < list.size(); i++) {

			out.println(list.get(i) + "<br>");

		}
	%>
	<button type = "button" onClick="location.href='setProduct.jsp'">뒤로가기</button>
	<button type = "button" onClick="location.href='Logout.jsp'">로그아웃</button>
</body>
</html>