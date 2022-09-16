<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../layout/header.jsp"%>

<style type="text/css">
@charset "UTF-8";

body {
	background-color: #f9f9fa
}

.flex {
	-webkit-box-flex: 1;
	-ms-flex: 1 1 auto;
	flex: 1 1 auto
}

@media ( max-width :991.98px) {
	.padding {
		padding: 1.5rem
	}
}

@media ( max-width :767.98px) {
	.padding {
		padding: 1rem
	}
}

.row {
	margin: 0 auto;
}

.padding {
	padding: 5rem
}

.card {
	box-shadow: none;
	-webkit-box-shadow: none;
	-moz-box-shadow: none;
	-ms-box-shadow: none
}

.pl-3, .px-3 {
	padding-left: 1rem !important
}

.card {
	flex-direction: column;
	word-wrap: break-word;
	background-color: #fff;
	background-clip: border-box;
	border: 1px solid #d2d2dc;
	border-radius: 0;
}

.card .card-title {
	color: #000000;
	margin-bottom: 0.625rem;
	text-transform: capitalize;
	font-size: 0.875rem;
	font-weight: 500;
}

.card .card-description {
	margin-bottom: .875rem;
	font-weight: 400;
	color: #76838f;
}

p {
	font-size: 0.875rem;
	margin-bottom: .5rem;
	line-height: 1.5rem;
}

.table-responsive {
	display: block;
	width: 100%;
	overflow-x: auto;
	-webkit-overflow-scrolling: touch;
	-ms-overflow-style: -ms-autohiding-scrollbar;
}

.table, .jsgrid .jsgrid-table {
	width: 100%;
	max-width: 100%;
	margin-bottom: 1rem;
	background-color: transparent;
}

.table thead th, .jsgrid .jsgrid-table thead th {
	border-top: 0;
	border-bottom-width: 1px;
	font-weight: 500;
	font-size: .875rem;
	text-transform: uppercase;
}

.table td, .jsgrid .jsgrid-table td {
	font-size: 0.875rem;
	padding: .875rem 0.9375rem;
}

.badge {
	border-radius: 0;
	font-size: 12px;
	line-height: 1;
	padding: .375rem .5625rem;
	font-weight: normal;
}
</style>
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
				<h2>Product List</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">Product List</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->

<!-- Start Cart  -->
<div class="page-content page-container" id="page-content">
	<div class="padding">
		<div class="row container justify-content-center">
			<div class="col-lg-12 stretch-card center">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Fruit 판매상품</h4>
						<p class="card-description">Fruit의 상품들입니다.</p>
						<div class="table-responsive">
							<div class="table-main table-responsive">
								<div class="pull-right">
									<span class="clickable filter" data-toggle="tooltip"
										title="Toggle table filter" data-container="body"> <i
										class="glyphicon glyphicon-filter"></i>
									</span>
								</div>
							</div>
							<div class="panel-body">
								<input type="text" class="form-control" id="dev-table-filter"
									data-action="filter" data-filters="#dev-table"
									placeholder="Filter Developers" />
							</div>
							<table class="table table-hover" id="dev-table">
								<thead>
									<tr>
										<th>Status</th>
										<th>ID No.</th>
										<th>Name</th>
										<th>Price</th>									
										<th>Detail</th>
										<th>Registrant</th>
										<th>Registration Date</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="prod" items="${products.content}">
										<tr>
											<td><c:choose>
													<c:when test="${prod.prodStatus == '품절'}">
														<label class="badge badge-warning">품절</label>
													</c:when>
													<c:otherwise>
														<label class="badge badge-success">판매중</label>
													</c:otherwise>
												</c:choose></td>
											<td><b><a
													href="/admin/product/read/${prod.productId}">${prod.productId}</a></b></td>
											<td>${prod.productName}</td>
											<td><fmt:formatNumber value="${prod.price}"
													type="currency" /></td>										
											<td><span>${prod.productDetail}</span></td>
											<td>${prod.createdBy}</td>
											<td><fmt:parseDate value="${prod.regTime}"
													pattern="yyyy-MM-dd" var="parsedDateTime" type="both" /> <fmt:formatDate
													pattern="yyyy-MM-dd" value="${parsedDateTime}" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

		</div>
		<br>
		<!-- class = row -->
		<ul class="pagination justify-content-center">
			<c:choose>
				<c:when test="${products.first}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${products.number-1}">Previous</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${products.number-1}">Previous</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${products.last}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${products.number+1}">Next</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${products.number+1}">Next</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
		<!-- End Cart -->

	</div>

</div>
</body>
<script src="/js/userlist.js"></script>
<%@ include file="../../layout/footer.jsp"%>

</html>