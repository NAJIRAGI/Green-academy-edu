<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test = "${empty loginUser}">
	<jsp:forward page='login.do'/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAIN PAGE</title>
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
   		top: 30%;
    	left: 50%;
   		transform: translate(-50%, -50%);
	}
</style>
</head>
<body class="d-flex h-100 text-center text-bg-dark">
	<div class="cover-container-sm d-flex w-100 h-100 p-3 mx-auto flex-column">
		<main class="px-3 center">
			<h1>Welcome to The "Free~!"</h1>
			<h2>Membership-Only Page</h2>
			<br><br>
		
		<form action="/oracle/logout.do">
			<table class="win">
				<tr>
					<td>HELLO, ${loginUser.name}(${loginUser.userid})</td>				
				</tr>				
				<tr>
					<td colspan = "2" align = "center">
						<br>
						<br>	
						<input type="button" value = "BOARD" class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark" onclick="location.href='list.jsp'">&nbsp;&nbsp;&nbsp;
						<input type="button" value = "MYPAGE" class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark" onclick="location.href='/oracle/memberUpdate.do?userid=${loginUser.userid}'">&nbsp;&nbsp;&nbsp;
						<input type="submit" value = "LOGOUT" class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark">
						<br>
						<br>
						<c:if test = "${loginUser.admin == 1}">
							<input type="button" value="MEMBERS" class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark" onclick="location.href='/oracle/memberlist.jsp'">
						</c:if>
					</td>
				</tr>
			</table>
		</form>
		</main>
	</div>
</body>
</html>