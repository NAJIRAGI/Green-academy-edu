<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Join! Us!</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="shortcut icon" href="#">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style2.css">
<script type="text/javascript" src="js/member.js"></script>
<style>
	.center {	
		position: absolute;
   		top: 700px;
    	left: 50%;
   		transform: translate(-50%, -50%);
	}
	.header {
		position: absolute;
   		top: 150px;
    	left: 50%;
   		transform: translate(-50%, -50%);
   		font-family: 'Jua', sans-serif;
	}
</style>
</head>
<body class="d-flex h-100 text-center text-bg-dark join">
<header class="header">
	<h2>Join Us!</h2>
	'*' 표시 항목은 필수 입력 사항입니다.
</header>
	
	<form action="/oracle/join.do" method="post" name="frm">
		<div class="px-3 center">
			<div class="int-area">
				<input type="text" name="name" id="name" autocomplete="off" required>
                <label for="name">USER NAME(*)</label>  
			</div>
			<div class="int-area">
				<input type="text" name="userid" id="userid" autocomplete="off" required>
				<input type="hidden" name="reud"><br>				
                <label for="userid">USER ID(*)</label>
                <button type="button" class="chkbtn" onclick="idCheck()">ID CHECK</button>            
			</div>			
			<div class="int-area">
                <input type="password" name="pwd" id="pwd" autocomplete="off" required>
                <label for="pwd">PASSWORD(*)</label>                
            </div>
			<div class="int-area">
                <input type="password" name="pwd_check" id="pwd_check" autocomplete="off" required>
                <label for="pwd_check">PASSWORD CHECK(*)</label>                
            </div>
            <div class="int-area">
                <input type="email" name="email" id="email" autocomplete="off" required>
                <label for="email">EMAIL(*)</label>                
            </div>	
            <div class="int-area">
                <input type="text" name="phone" id="phone" autocomplete="off" required>
                <label for="phone">PHONE(*)</label>                
            </div>
            <div class="int-area">
                <label for="admin">ADMIN?</label><br>                                          
            </div>	           		
            <div class="rad-area">
            	<input type="radio" class="btn-check" value="1" name="admin" id="admin" autocomplete="off" checked>
				<label class="btn btn-secondary" for="admin">YES</label>&nbsp;&nbsp;&nbsp;&nbsp; 
				<input type="radio" class="btn-check" value="0" name="admin" id="admin2" autocomplete="off">
				<label class="btn btn-secondary" for="admin2">NO</label>     
            </div>
			<div class="btn-area">			
				<button type="submit" onclick="return joinCheck()">JOIN</button>&nbsp;&nbsp;
				<button type="button" onclick="location.href='/oracle/login.do'">BACK</button>
			</div>			
			<table class="win">
            	<tr>
            		<td colspan="2">${message}</td>
            	</tr>
            </table>   
		</div>
	</form>
</body>
</html>