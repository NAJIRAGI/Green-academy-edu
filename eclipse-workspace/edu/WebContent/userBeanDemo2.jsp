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

이름 : <jsp:getProperty name="member" property="name" /> <br>
아이디 : <jsp:getProperty property="userid" name="member"/><br>
<hr>
<jsp:setProperty property="name" name="member" value="Lee" /><br>
<jsp:setProperty property="userid" name="member" value="kkamagui" /><br>
이름 : <jsp:getProperty name="member" property="name" /> <br>
아이디 : <jsp:getProperty property="userid" name="member"/><br>

</body>
</html>