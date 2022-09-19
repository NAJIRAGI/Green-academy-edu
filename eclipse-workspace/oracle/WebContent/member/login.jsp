<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>LOGIN</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style2.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/member.js"></script>
</head>
<body>
	<section class="login-form">
		<header>	
            <h1>Login</h1>
        </header>

        <form action="/oracle/login.do" method="post" name="frm">

            <div class="int-area">
                <input type="text" name="userid" id="userid" autocomplete="off" required>
                <label for="userid">USER ID</label>                
            </div>
             <div class="int-area">
                <input type="password" name="pwd" id="pwd" autocomplete="off" required>
                <label for="pwd">PASSWORD</label>                
            </div>
            <div class="btn-area">                     
           	 	<button type="submit" onclick="return loginCheck()">LOGIN</button>&nbsp;&nbsp;				
				<button type="button" onclick="location.href='/oracle/join.do'">JOIN</button>
            </div>
          </form>
          <div class="caption">
          	<a href="#">Forgot Password?</a>
          </div>
            <table class="win">
            	<tr>
            		<td colspan="2">${message}</td>
            	</tr>
            </table>      
	</section>
</body>
</html>

	 	