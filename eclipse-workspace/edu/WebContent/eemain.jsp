<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String name = request.getParameter("name");
String userno = request.getParameter("userno1");
String userno2 = request.getParameter("userno2");
String id = request.getParameter("userid");
String pwd1 = request.getParameter("pwd1");		
String email1 = request.getParameter("email1");
String email2 = request.getParameter("email2");
String addno = request.getParameter("addno");
String address1 = request.getParameter("address1");
String address2 = request.getParameter("address2");
String tel = request.getParameter("tel");
String job = request.getParameter("job");		
String items[] = request.getParameterValues("item");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


이름 : <%= name %><br>
주민번호<%= userno + "-" + userno2 %><br>
아이디 : <%= id %><br>
비밀번호 : <%= pwd1 %><br>
이메일 : <%= email1 + "@" + email2 %><br>
우편번호 : <%= addno %><br>
주소 : <%= address1 + address2 %><br>
핸드폰 번호 : <%= tel %><br>
직업 : <%= job %><br>

관심 분야 : 
<% 
for (String item : items) {
	out.print(item + " ");
}
%>

</body>
</html>