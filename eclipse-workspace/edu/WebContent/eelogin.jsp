<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
label {
width : 160px;
display: inline-block;
}
</style>
<script type = "text/javascript" src = "test3.js"></script>
</head>
<body>
	<form method="get" action="eelogintest.jsp" name = "frm" onsubmit = "return checkAll()">
			<label for = "username"> 이름 : </label> <input type = "text" name = "name" id = "name"><br>
			<label for = "userno"> 주민등록번호 : </label> <input type="text" name="userno1" id = "userno1">-<input type="text" name="userno2" id = "userno2"><br>
			<label for = "userid"> 아이디 : </label> <input type = "text" name = "userid" id = "userid"><br>
			<label for = "password1"> 비밀번호 : </label> <input type = "password" name = "pwd1" id = "userpwd1"><br>
			<label for = "password2"> 비밀번호 확인 : </label> <input type = "password" name = "pwd2" id = "userpwd2"><br>
			<label for = "mail"> 이메일 : </label> <input type="text" name="email1"> @ <input type="text" name="email2">
			<select id = "domain" name="domain" size="1">
							<option value="네이버"> naver.com </option>
							<option value="다음" selected="selected"> daum.net </option>
							<option value="네이트"> nate.com </option>
							<option value="구글"> gmail.com </option>							
			</select><br>
			<label for = "addno"> 우편번호 : </label> <input type = "text" name = "addno" id = "addno"><br>
			<label for = "address"> 주소 : </label> <input type="text" name="address1"> <input type="text" name="address2"><br>
			<label for = "phone"> 휴대폰 번호 : </label> <input type = "tel" name = "tel" id = "tel"><br>
			<label for = "job"> 직업 : </label> 
			<select id = "job" name="job" size="3">
							<option value="학생"> 학생 </option>
							<option value="컴퓨터/인터넷"> 컴퓨터/인터넷 </option>
							<option value="언론"> 언론 </option>
							<option value="공무원"> 공무원 </option>
							<option value="군인"> 군인 </option>
							<option value="서비스업"> 서비스업 </option>
							<option value="교육"> 교육 </option>
			</select>
			<br>
			<label for="chk_mail">메일 수신 여부 : </label>
			<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> 수신
			<input type="radio" id="chk_mail" name="chk_mail" value="no"> 거부
			<br>
			<label for="interest">관심분야 : </label>
			<input type="checkbox" name="item" value="생두"> 생두
			<input type="checkbox" name="item" value="원두"> 가방
			<input type="checkbox" name="item" value="로스팅"> 로스팅
			<input type="checkbox" name="item" value="핸드드립"> 핸드드립
			<input type="checkbox" name="item" value="에스프레소"> 에스프레소
			<input type="checkbox" name="item" value="창업"> 창업
			<input type="submit" value="전송"> 
			<input type="reset" value="리셋">				
		</form>
</body>
</html>