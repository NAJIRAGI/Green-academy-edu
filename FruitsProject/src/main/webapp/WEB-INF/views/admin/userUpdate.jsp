<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<c:if test="${principal.user.roles == 'USER'}">
	<script>
		function back() {
			location.href = "/";
		}
	</script>
</c:if>
<body onload="back()">
	<!-- Start Cart  -->
	<div class="cart-box-main" style="margin-left: 600px;">
		<div class="container">
			<div class="row new-account-login">
				<div class="col-sm-6 col-lg-6 mb-3">
					<div class="title-left">
						<h3>User PAGE!</h3>
					</div>
					<h5>Update User Page!</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-lg-6 mb-3">
					<div class="checkout-address">
						<div class="title-left">
							<h3>${user.id}님에대한 정보 수정 후 확인 버튼을 눌러주세요!</h3>
						</div>
						<form class="needs-validation" novalidate>
							<input type="hidden" id="id" value="${user.id}" />
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="username">ID</label> <input type="text"
										class="form-control" id="username" placeholder=""
										value="${user.username}" readonly>
									<div class="invalid-feedback"></div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="password">Password</label> <input type="text"
										class="form-control" id="password" placeholder="" required>
									<div class="invalid-feedback">비밀번호를 입력해주세요.</div>
								</div>
							</div>
							<div class="mb-3">
								<label for="username">User name</label>
								<div class="input-group">
									<input type="text" class="form-control" id="name"
										placeholder="" value="${user.name}" required readOnly>
									<div class="invalid-feedback" style="width: 100%;"></div>
								</div>
							</div>
							<div class="mb-3">
								<label for="email">Email Address</label> <input type="email"
									class="form-control" id="email" value="${user.email}"
									placeholder="">
								<div class="invalid-feedback">E-Mail을 입력해주세요.</div>
							</div>
							<div class="mb-3">
								<div class="input-group has-validation">
									<input type="text" class="form-control" id="sample6_postcode"
										placeholder="ZIP CODE" required>&emsp;
									<button class="btn hvr-hover" type="submit"
										onclick="sample6_execDaumPostcode()">주소찾기</button>
								</div>
								<input type="text" class="form-control" id="sample6_address"
									placeholder="ADDRESS" required>
								<div class="input-group has-validation">
									<input type="text" class="form-control"
										id="sample6_extraAddress" placeholder="ADDRESS"> <input
										type="text" class="form-control" id="sample6_detailAddress"
										placeholder="DETAIL ADDRESS" required><br>
								</div>
							</div>
							<div class="mb-3">
								<label for="address">Phone Number</label> <input type="text"
									class="form-control" id="tel" value="${user.tel}"
									placeholder="" required>
								<div class="invalid-feedback">전화번호를 입력해주세요.</div>
							</div>

							<hr class="mb-4">
						</form>
						<div class="row">
							<div class="col-lg-12">
								<div class="special-menu text-center">
									<div class="button-group filter-button-group">
										<button id="btn-userupdate" class="btn">수정 완료</button>
										<button id="btn-addelete" class="btn">회원 삭제</button>
										<button class="btn" onclick="history.go(-1)">뒤로 가기</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Cart -->


</body>
<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>

</html>