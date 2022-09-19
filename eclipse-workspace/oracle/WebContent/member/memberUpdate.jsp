<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
   		top: 400px;
    	left: 50%;
   		transform: translate(-50%, -50%);
	}
</style>
</head>
<body class="d-flex h-100 text-center text-bg-dark join">
	<h2>MY INFO</h2>
	
	<form action="/oracle/memberUpdate.do" method="post" name="frm">
		<div class="px-3 center">
			<div class="int-area">
				<input type="text" name="name" id="name" autocomplete="off" value="${mVo.name}">
                <label for="name">USER NAME</label>  
			</div>
			<div class="int-area">
				<input type="text" name="userid" id="userid" autocomplete="off" value="${mVo.userid}">
                <label for="name">USER ID</label>  
			</div>			
			<div class="int-area">
                <input type="password" name="pwd" id="pwd" autocomplete="off" required>
                <label for="pwd">PASSWORD</label>                
            </div>
			<div class="int-area">
                <input type="password" name="pwd_check" id="pwd_check" autocomplete="off" required>
                <label for="pwd_check">PASSWORD CHECK</label>                
            </div>
            <div class="int-area">
                <input type="email" name="email" id="email" value="${mVo.email}" autocomplete="off">
                <label for="email">EMAIL</label>                
            </div>	
            <div class="int-area">
                <input type="text" name="phone" id="phone" value="${mVo.phone}" autocomplete="off" required>
                <label for="phone">PHONE</label>                
            </div>
            <div class="int-area">
                <label for="admin">ADMIN?</label><br>                                          
            </div>	     		
			<div class="rad-area">
				<c:choose>
					<c:when test="${mVo.admin == 0}">
						<input type="radio" class="btn-check" value="1" name="admin" id="admin" autocomplete="off">
						<label class="btn btn-secondary" for="admin">YES</label>&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio" class="btn-check" value="0" name="admin" id="admin2" autocomplete="off" checked>
						<label class="btn btn-secondary" for="admin2">NO</label>
					</c:when>
					<c:otherwise>
						<input type="radio" class="btn-check" value="1" name="admin" id="admin" autocomplete="off" checked>
						<label class="btn btn-secondary" for="admin">YES</label>&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio" class="btn-check" value="0" name="admin" id="admin2" autocomplete="off">
						<label class="btn btn-secondary" for="admin2">NO</label>
					</c:otherwise>
				</c:choose>	
			</div>
			<div class="btn-area">			
				<button type="submit" onclick="return joinCheck()">DONE</button>&nbsp;&nbsp;
				<button type="button" onclick="location.href='${pageContext.request.contextPath}/main.jsp'">BACK</button>
			</div>				
		</div>
	</form>
</body>
</html>