<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  String name = (String)session.getAttribute("name");
	String uid = (String) session.getAttribute("username");
	String upw = (String) session.getAttribute("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
      width: 600px;
      margin: 0 auto;
      padding: 20px;
      text-align: center;
    }
form {
      width: 600px;
      margin: 20px auto;
    }
h1 {
	width: 600px;
    padding: 10px;
    background-color: #eee;
}
    
p {
      width: 600px;
      padding: 10px;
      background-color: #fff;
      border: 1px solid #ccc;
      line-height: 2;
      color : #eee;
    }
        
form p:hover {
      color: black;
    }
input[type=submit]{
                background-color: #8aa1a1;
                border:none;
                color:white;
                border-radius: 5px;
                width:100%;
                height:35px;
                font-size: 14pt;
                margin-top:100px;
            }
</style>
</head>
<body>
	<%if (session.getAttribute("name")==null) {
		response.sendRedirect("loginform2.jsp");
	}
		%>
	
	<form action="Logout.jsp" method="get">
		<%=uid %>
		<%=upw %>
		<h1><%=name %>님의 로그인을 환영합니다.</h1>
		<p>신나는 저희 홈페이지에 방문하신 것을 진심으로 환영합니다.<br>
		   저희 홈페이지는 현재 즐기시고 계신 JAVA 수업의 결과물을 보여주고 있습니다.
		  아래 로그아웃 버튼을 누루면 Logout.jsp를 이용하여 로그아웃됩니다.
		</p>
		<input type = "submit" value="로그아웃">		
	</form>
	
</body>
</html>