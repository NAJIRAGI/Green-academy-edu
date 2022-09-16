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
					<h2>Order List</h2>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Shop</a></li>
						<li class="breadcrumb-item active">OrderList</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- End All Title Box -->

	<!-- Start Wishlist  -->
	<div class="wishlist-box-main">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="table-main table-responsive">
						<table class="table">
							<thead>
								<tr>
									<th>Number</th>
									<th>Product Name</th>
									<th>Order Price</th>
									<th>Order Q'ty</th>
									<th>Order Date</th>
									<th>Order Status</th>
									<th>Detail</th>
								</tr>
							</thead>
							<tbody>
							
								<c:forEach var="order" items="${orders.content}">
								<c:if test="${order.user.id == principal.user.id}">
									<tr>
										<td class="name-pr"><a href="#">${order.id}</a></td>
										<td class="name-pr"><a href="#">${order.orderTitle}</a></td>
										<td class="price-pr">
											<p>
												<fmt:formatNumber value="${order.totalprice}"
													type="currency" />
											</p>
										</td>
										<td class="quantity-box">${order.qty}</td>
										<td class="add-pr">
											<p>
												<fmt:parseDate value="${order.regTime}" pattern="yyyy-MM-dd"
													var="parsedDateTime" type="both" />
												<fmt:formatDate pattern="yyyy-MM-dd"
													value="${parsedDateTime}" />
											</p>
										</td>
										<td class="remove-pr">${order.status}</td>
										<td><a href="orderDetail/${order.id}">
												<button class="btn hvr-hover" type="button">상세보기</button>
										</a></td>
									</tr>
								</c:if>
								</c:forEach>
								
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
		<ul class="pagination justify-content-center">
			<c:choose>
				<c:when test="${orders.first}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${orders.number-1}">Previous</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${orders.number-1}">Previous</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${orders.last}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${orders.number+1}">Next</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${orders.number+1}">Next</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
	<!-- End Wishlist -->


<%@ include file="../layout/footer.jsp"%>

</html>