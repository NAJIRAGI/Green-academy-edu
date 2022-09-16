<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layout/header.jsp"%>
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
					<h3>Update My Product!</h3>
				</div>
				<h5>Product Update Page!</h5>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-6 col-lg-6 mb-3">
				<div class="checkout-address">
					<div class="title-left">
						<h3>상품에 대한 내용을 수정 후 등록 버튼을 눌러주세요!</h3>
					</div>
					<form class="needs-validation" novalidate method="post"
						enctype="multipart/form-data">
						<input type="hidden" id="productId" value="${product.productId}" />

						<div class="mb-3">
							<label for="productStatus">Product Status</label> 
							판매중<input type="radio" id="prodStatus" value="판매중" name="prodStatus">
							품절<input type="radio" id="prodStatus" value="품절" name="prodStatus">
							<div class="invalid-feedback">상품 판매 상태를 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label for="productName">Product Name</label> <input type="text"
								class="form-control" id="productName" placeholder=""
								value="${product.productName}" required>
							<div class="invalid-feedback">상품 상품 이름을 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label>Product Price</label> <br> Sale Price<input
									type="text" class="form-control"
									placeholder="할인 적용 전 가격 입력 / 할인 없으면 미기입" id="bprice" value="${product.bprice}">Current
								Price<input type="text" class="form-control" id="price"
									placeholder="" value="${product.price}">
								<div class="invalid-feedback">가격을 입력해주세요.</div>
						</div>
						
						<div class="mb-3">
							<label for="origin">Product Origin</label><br> 국산 <input
									type="radio" id="origin" value="국산" name="origin"> 수입<input
									type="radio" id="origin" value="수입" name="origin"> 완제품<input
									type="radio" id="origin" value="완제품" name="origin">
								<div class="invalid-feedback">상품 구분을 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label for="season">Season Product Checked.</label> <br> 봄 <input
									type="radio" id="season" value="봄" name="season"> 여름<input
									type="radio" id="season" value="여름" name="season"> 가을<input
									type="radio" id="season" value="가을" name="season">겨을<input
									type="radio" id="season" value="겨울" name="season">
								<div class="invalid-feedback">제철날짜을 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label for="recommend">Home View Checked.</label> <input
									type="checkbox" id="recommend" value="홈" name="recommend">
								<div class="invalid-feedback">추천하시면 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label for="productImgPath">Product Images</label> <input
								type="Text" class="form-control" id="imgup" placeholder=""
								required value="${product.prodImgPath}">
							<div class="invalid-feedback">상품에 대한 이미지가 있는 경로를 입력해주세요.</div>
						</div>

						<div class="mb-3">
							<label for="productDetail">Product Detail</label>
							<div class="form-group">
								<textarea class="form-control" id="productDetail"
									placeholder="상품에 대한 설명" rows="4"
									data-error="Write Product Detail" required>${product.productDetail}</textarea>
								<div class="help-block with-errors"></div>
							</div>
							<div class="invalid-feedback">상품에 대한 정보를 입력해주세요.</div>
						</div>

						<hr class="mb-4">
					</form>
					<div class="row">
						<div class="col-lg-12">
							<div class="special-menu text-center">
								<div class="button-group filter-button-group">
									<button id="btn-prodmodify" class="btn">수정 완료</button>
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



<!-- Start Instagram Feed  -->
<br>
<br>
<div class="instagram-box">
	<div class="main-instagram owl-carousel owl-theme">
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-01.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-02.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-03.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-04.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-05.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-06.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-07.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-08.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-09.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
		<div class="item">
			<div class="ins-inner-box">
				<img src="../../images/instagram-img-05.jpg" alt="" />
				<div class="hov-in">
					<a href="#"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Instagram Feed  -->
</body>
<script src="/js/product.js"></script>
<%@ include file="../../layout/footer.jsp"%>


</html>