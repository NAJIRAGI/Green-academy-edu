<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<!-- Start All Title Box -->
<div class="all-title-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>Cart</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">Cart</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->

<!-- Start Cart  -->
<form name="orderform" id="orderform" method="post" class="orderform"
	action="/Page" onsubmit="return false;">
	<input type="hidden" name="cmd" value="order">
	<div class="cart-box-main">
		<div class="container">
			<div class="row basketdiv" id="basket">
				<div class="col-lg-12">
					<div class="table-main table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th>Check</th>
									<th>Images</th>
									<th>Product Name</th>
									<th>Price</th>
									<th>Quantity</th>
									<th>Total</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="cart" items="${cartItems}">
									<tr>

										<td><div class="check">
												<input type="checkbox" name="buy" value="${cart.cartItemId}"
													onclick="javascript:basket.checkItem();">&nbsp;
											</div></td>

										<td class="thumbnail-img"><div class="img">
												<a href="#"> <img class="img-fluid"
													src="../${cart.product.prodImgPath}" alt="" />
												</a>
											</div></td>
										<td class="name-pr"><div class="pname">
												<a href="#"> <span>${cart.product.productName}</span>
												</a>
											</div></td>
										<td class="price-pr"><div class="basketprice">
												<p>
													<input type="hidden" name="p_price"
														id="p_price${cart.cartItemId}" class="p_price"
														value="${cart.product.price}">${cart.product.price}</p>
											</div></td>
										<td class="quantity-box">
											<div class="num">
												<div class="updown">
													<input type="number" size="4" min="1" step="1"
														class="c-input-text qty text p_num"
														name="p_num${cart.cartItemId}"
														id="p_num${cart.cartItemId}" value="${cart.count}"
														onchange="javascript:basket.changePNum(${cart.cartItemId});"
														 onKeyup="this.value=this.value.replace(/[^1-9]/g,'1');">
												</div>
											</div>
										</td>
										<td class="total-pr">
											<div class="sum">
												<p>${cart.product.price * cart.count}</p>
											</div>
										</td>

									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<div class="row my-5">
				<div class="col-lg-6 col-sm-6"></div>
				<div class="col-lg-6 col-sm-6 basketrowcmd">
					<div class="update-box">
						<input value="장바구니 비우기" type="submit" id="btn-delcartAll">
					</div>
				</div>
			</div>

			<div class="row my-5">
				<div class="col-lg-8 col-sm-12"></div>
				<div class="col-lg-4 col-sm-12">
					<div class="order-box">
						<h3>Order summary</h3>

						<hr>
						<div class="d-flex gr-total">
							<h5>Grand Total</h5>
							<div class="ml-auto h5" id="sum_p_price">-원</div>
						</div>
						<hr>
					</div>
				</div>
				<div class="col-12 d-flex shopping-box">
					<button id="btn-order" class="ml-auto btn hvr-hover">구매하기</button>
				</div>
			</div>

		</div>
	</div>
</form>
<!-- End Cart -->

<script src="/js/cart.js"></script>
<script src="/js/order.js"></script>
<%@ include file="../layout/footer.jsp"%>

</html>