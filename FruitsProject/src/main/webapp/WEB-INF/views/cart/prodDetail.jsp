<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<%!int cnt = 0;%>
<%
cnt = 0;
%>
<c:forEach items="${cartItems}" var="cartItem">
	<c:if test="${cartItem.product.productId == product.productId}">
		<%
		cnt += 1;
		%>
	</c:if>
</c:forEach>
<!-- Start All Title Box -->
<div class="all-title-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>Shop Detail</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">Shop Detail</li>
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
						<img class="d-block w-100" src="../../${product.prodImgPath}"
							alt="First slide">
					</div>

				</div>
			</div>
			<div class="col-xl-7 col-lg-7 col-md-6">
				<div class="single-product-details">
					<h2>${product.productName}</h2>
					<h5>
						<c:if test="${product.bprice != 0 }">
							<span class="text-muted text-decoration-line-through"> <fmt:formatNumber
									value="${product.bprice}" type="currency" />
							</span>
						</c:if>

						<fmt:formatNumber value="${product.price}" type="currency" />
					</h5>
					<h4>원산지 : ${product.origin}</h4>
					<h4>Product Detail:</h4>
					<p>${product.productDetail}</p>
					<ul>
						<li>
							<div class="form-group quantity-box">
								<label class="control-label">Quantity</label> <input
									class="form-control" value="1" min="1" type="number"
									id="count" onKeyup="this.value=this.value.replace(/[^1-9]/g,'1');">
							</div>
						</li>
					</ul>

					<div class="price-box-bar">
						<div class="cart-and-bay-btn">
							<c:choose>
								<c:when test="<%=cnt == 0%>">
									<button type="button" class="btn hvr-hover" name="submit"
										id="btn-cart">Add to Cart</button>
								</c:when>
								<c:otherwise>
									<button type="button" class="btn hvr-hover">Contained</button>
								</c:otherwise>
							</c:choose>
							<button type="button" class="btn hvr-hover"
								onclick="history.back()">Back</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Cart -->



<script src="/js/cart.js"></script>
<script src="/js/order.js"></script>
<%@ include file="../layout/footer.jsp"%>

</html>