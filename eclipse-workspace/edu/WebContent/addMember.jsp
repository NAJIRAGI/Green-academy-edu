<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="member" class="com.edu.test.MemberBean"/>
<jsp:setProperty name="member" property="*" />

이름 : <jsp:getProperty name="member" property="name" /> <br>
아이디 : <jsp:getProperty name="member" property="userid" /> <br>
별명 : <jsp:getProperty name="member" property="nickname" /> <br>
비밀번호 : <jsp:getProperty name="member" property="pwd" /> <br>
이메일 : <jsp:getProperty name="member" property="email" /> <br>
전화번호 : <jsp:getProperty name="member" property="phone" /> <br>

</body>
</html>