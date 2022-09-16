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
<!-- Start All Title Box -->
<div class="all-title-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>User List</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">UserList</li>
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
							placeholder="Filter Developers"/>
					</div>
					<table class="table table-hover" id="dev-table">
						<thead>
							<tr>
								<th>#</th>
								<th>User ID</th>
								<th>User Name</th>
								<th>Address</th>
								<th>Roles</th>
								<th>Info</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="user" items="${users.content}">
								<tr>

									<td>${user.id}</td>
									<td>${user.username}</td>
									<td>${user.name}</td>
									<td>${user.address}</td>
									<td>${user.roles}</td>
									<td><a href="/admin/userUpdate/${user.id}"
										class="btn hvr-hover">수정</a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- class = row -->
		<ul class="pagination justify-content-center">
			<c:choose>
				<c:when test="${users.first}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${users.number-1}">Previous</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${users.number-1}">Previous</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${users.last}">
					<li class="page-item disabled"><a class="page-link"
						href="?page=${users.number+1}">Next</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="?page=${users.number+1}">Next</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>


</form>
<!-- End Cart -->
</body>
<script src="/js/userlist.js"></script>
<%@ include file="../layout/footer.jsp"%>

</html>