<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Sample</title>
<link rel="stylesheet" href="https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="panel-heading">
		<h3 align="center">Form</h3>
	</div>

	<div class="panel-body">
		<form method="get" action="queryTest22" enctype="multipart/form-data" novalidate>
			<table class="table">
				<tr>
					<td>이름:</td>
					<td><input type="text" name="name" size="30" maxlength="10"></td>
				</tr>
				<tr>
					<td>아이디:</td>
					<td><input type="text" name="id" value="아이디 입력" size="50"></td>
				</tr>
				<tr>
					<td>패스워드:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>주소:</td>
					<td><input type="text" name="address" placeholder="서울시 "></td>
				</tr>
				<tr>
					<td>주문수량:</td>
					<td><input type="number" name="qty" min="0" max="10" step="2"></td>
				</tr>
				<tr>
					<td>E-Mail:</td>
					<td><input type="email" name="email" required></td>
				</tr>
				<tr>
					<td>URL:</td>
					<td><input type="url" name="url" size="50" required></td>
				</tr>
				<tr>
					<td>날짜:</td>
					<td><input type="date" name="date" required></td>
				</tr>
				<tr>
					<td>Comment:</td>
					<td><textarea cols="50" rows="10" name="comment"></textarea></td>
				</tr>

				<tr>
					<td>야구팀:</td>
					<td><input type="radio" name="baseball" value="두산" checked>두산
						<br> <input type="radio" name="baseball" value="NC">NC
						<br> <input type="radio" name="baseball" value="LG">LG
						<br> <input type="radio" name="baseball" value="SK">SK
						<br> <input type="radio" name="baseball" value="KIA">KIA
						<br> <input type="radio" name="baseball" value="Samsung">Samsung
						<br>
					</td>
				</tr>
				<tr>
					<td>4강팀:</td>
					<td><input type="checkbox" name="four" value="두산" checked>두산
						<br> <input type="checkbox" name="four" value="NC">NC
						<br> <input type="checkbox" name="four" value="LG">LG
						<br> <input type="checkbox" name="four" value="SK">SK
						<br> <input type="checkbox" name="four" value="KIA">KIA
						<br> <input type="checkbox" name="four" value="Samsung">Samsung
						<br>
					</td>
				</tr>

				<tr>
					<td>야구팀1:</td>
					<td>
						<select name="base">
							<option value="">선택해 주세요</option>
							<option value="두산">두산</option>
							<option value="NC">NC</option>
							<option value="Samsung" selected>Samsung</option>
							<option value="KIA">KIA</option>
							<option value="SK">SK</option>
							<option value="LG">LG</option>
						</select>
					</td>
				</tr>

				<tr>
					<td>5강 1:</td>
					<td>
						<select name="five" multiple size="7">
							<option value="">선택해 주세요</option>
							<option value="두산">두산</option>
							<option value="NC">NC</option>
							<option value="Samsung" selected>Samsung</option>
							<option value="KIA">KIA</option>
							<option value="SK">SK</option>
							<option value="LG">LG</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>File Upload</td>
					<td><input type="file" name="upload" class="form-control"></td>
				</tr>

				<tr>
					<td colspan="2">
						<input type="submit" value="전송"> 
						<input type="reset" value="리셋">
						<input type="button" value="아무짓 안함"></td>
				</tr>
			</table>

		</form>
	</div>


</body>
</html>