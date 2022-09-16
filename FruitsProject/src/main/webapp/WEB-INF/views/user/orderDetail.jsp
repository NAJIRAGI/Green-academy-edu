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
					<h2>Order</h2>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Shop</a></li>
						<li class="breadcrumb-item active">Order</li>
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
										<th>Order Number</th>
										<th>Product Name</th>
										<th>Price</th>
										<th>Quantity</th>
										<th>Total</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="order" items="${orders}">
										<tr>
											<td class="id"><span>${order.id}</span></td>
											<td class="name-pr"><span>${order.pdNms}</span></td>
											<td class="price-pr"><fmt:formatNumber
													value="${order.price}" type="currency" /></td>
											<td class="quantity-box">${order.qty}</td>
											<td class="total-pr"><fmt:formatNumber
													value="${order.price * order.qty}" type="currency" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>

				<div class="row my-5">
					<div class="col-lg-6 col-sm-6"></div>				
				</div>

				<div class="row my-5">
					<div class="col-lg-8 col-sm-12"></div>
					<div class="col-lg-4 col-sm-12">
						<div class="order-box">
							<h3>Order summary</h3>

							<hr>
							<div class="d-flex gr-total">
								<h5>Grand Total</h5>
								<div class="ml-auto h5">
									<fmt:formatNumber value="${orders.get(0).totalprice}"
										type="currency" />
									원
								</div>
							</div>
							<hr>
						</div>
					</div>
					<div class="col-12 d-flex shopping-box">
						<button class="hvr-hover" onclick="history.back()">돌아가기</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	<!-- End Cart -->



<%@ include file="../layout/footer.jsp"%>
</html>