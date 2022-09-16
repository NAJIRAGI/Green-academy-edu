
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ include file="../layout/header.jsp"%>
<style>
/* Importing fonts from Google */
/* Importing fonts from Google */
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: #ecf0f3;
}

.rapper {
	max-width: 500px;
	min-height: 500px;
	margin: 80px auto;
	padding: 40px 30px 30px 30px;
	background-color: #ecf0f3;
	border-radius: 15px;
	box-shadow: 13px 13px 20px #cbced1, -13px -13px 20px #fff;
}

.log {
	width: 80px;
	margin: auto;
}

.log img {
	width: 100%;
	height: 80px;
	object-fit: cover;
	border-radius: 50%;
	box-shadow: 0px 0px 3px #5f5f5f, 0px 0px 0px 5px #ecf0f3, 8px 8px 15px
		#a7aaa7, -8px -8px 15px #fff;
}

.rapper .name {
	font-weight: 600;
	font-size: 1.4rem;
	letter-spacing: 1.3px;
	padding-left: 10px;
	color: #555;
}

.rapper .form-field input {
	width: 100%;
	display: block;
	border: none;
	outline: none;
	background: none;
	font-size: 1.2rem;
	color: #666;
	padding: 10px 15px 10px 10px;
	/* border: 1px solid red; */
}

.rapper .form-field {
	padding-left: 10px;
	margin-bottom: 20px;
	border-radius: 20px;
	box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;
}

.rapper .form-field .fas {
	color: #555;
}

.rapper .btn {
	box-shadow: none;
	width: 100%;
	height: 40px;
	background-color: #9c6;
	color: #fff;
	border-radius: 25px;
	box-shadow: 3px 3px 3px #b1b1b1, -3px -3px 3px #fff;
	letter-spacing: 1.3px;
}

.rapper .btn:hover {
	background-color: #039BE5;
}

.rapper a {
	text-decoration: none;
	font-size: 0.8rem;
	color: #03A9F4;
}

.rapper a:hover {
	color: #039BE5;
}

@media ( max-width : 380px) {
	.wrapper {
		margin: 30px 20px;
		padding: 40px 15px 15px 15px;
	}
}
</style>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<div class="rapper">
	<div class="log">
		<img src="../images/gold.png" alt="greenapple">
	</div>
	<div class="text-center mt-4 name">JOIN</div>
	<form class="p-3 mt-3">
		<div class="form-field d-flex align-items-center">

			<input type="text" class="" placeholder="Enter id" id="username">
		</div>

		<div class="form-field d-flex align-items-center">

			<input type="password" class="" placeholder="Enter password"
				id="password">
		</div>

		<div class="form-field d-flex align-items-center">

			<input type="text" class="" placeholder="Enter name" id="name">
		</div>

		<div class="form-field d-flex align-items-center">

			<input type="tel" class="" placeholder="Enter phone number" id="tel">
		</div>

		<div class="form-field d-flex align-items-center">

			<input type="email" class="" placeholder="Enter email" id="email">
		</div>

		<!-- 	<div class="form-field d-flex align-items-center">

			<input type="text" class="" placeholder="Enter address" id="address">
		</div> -->


		<div class="input-group has-validation">
			<div class="form-field d-flex align-items-center">
				<input type="text" class="form-control" id="sample6_postcode"
					placeholder="ZIP CODE" required>&emsp;
			</div>
			<div class="special-menu text-center" style="margin-left: 25px; margin-top: 10px;">
				<button class="btn hvr-hover" type="submit"
					onclick="sample6_execDaumPostcode()">주소찾기</button>
			</div>
		</div>
		<div class="form-field d-flex align-items-center">
			<input type="text" class="form-control" id="sample6_address"
				placeholder="ADDRESS" required>
		</div>
		<div class="input-group has-validation">
		<div class="form-field d-flex align-items-center">
			<input type="text" class="form-control" id="sample6_extraAddress"
				placeholder="ADDRESS"> 			
				<input type="text"
				class="form-control" id="sample6_detailAddress"
				placeholder="DETAIL ADDRESS" required><br>
					</div>
		</div>

		<hr>

	</form>
	<button id="btn-joinsave" class="btn mt-3">Join</button>
	<button class="btn mt-3" onclick="history.go(-1)">Back</button>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>
