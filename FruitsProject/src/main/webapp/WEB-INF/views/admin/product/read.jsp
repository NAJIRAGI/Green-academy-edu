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
<!-- Start All Title Box -->
<div class="all-title-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>Product Detail</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">Product Detail</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->

<!-- Start Shop Detail  -->
<div class="shop-detail-box-main">
	<input type="hidden" id="productId" value="${product.productId}">
	<div class="container">
		<div class="row">
			<div class="col-xl-5 col-lg-5 col-md-6">
				<div id="carousel-example-1"
					class="single-product-slider carousel slide" data-ride="carousel">
					<div class="carousel-item active">
						<c:if test="${prod.bprice != 0 }">
							<div class="badge bg-dark text-white position-absolute"
								style="top: 0.5rem; right: 0.5rem">Sale</div>
						</c:if>
						<img class="d-block w-100" src="../../../${product.prodImgPath}"
							alt="First slide">
					</div>

				</div>
			</div>
			<div class="col-xl-7 col-lg-7 col-md-6">
				<div class="single-product-details">
					<h2>${product.productName}</h2>
					<h4>Product ID : ${product.productId}</h4>
					<p>Product Status : ${product.prodStatus}</p>			
					<h5>
						<c:if test="${product.bprice != 0 }">
							<span class="text-muted text-decoration-line-through"> <fmt:formatNumber
									value="${product.bprice}" type="currency" />
							</span>
						</c:if>

						<fmt:formatNumber value="${product.price}" type="currency" />
					</h5>
					<p>Origin : ${product.origin}</p>
					<h4>Product Detail:</h4>
					<p>${product.productDetail}</p>

					<div class="price-box-bar">
						<div class="cart-and-bay-btn">
							<button type="button" class="btn btn-warning"
								onclick='location.href="/admin/product/${productId}/update"'>수정</button>
							<button type="button" class="btn btn-danger" id="btn-proddelete">삭제</button>
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