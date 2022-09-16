<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<!-- Start All Title Box -->
<div class="all-title-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h2>Notice</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Shop</a></li>
					<li class="breadcrumb-item active">Notice</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->
<!-- Start Gallery  -->
<div class="products-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="title-all text-center">
					<h1>Notice</h1>
					<p>다양한 EVENT와 새로운 소식을 놓치지 마세요!</p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="special-menu text-center">
					<div class="button-group filter-button-group">
						<button class="active" data-filter="*">All</button>
						<button data-filter=".event">EVENT</button>
						<button data-filter=".notice">NOTICE</button>
					</div>
				</div>
			</div>
		</div>

		<div class="row special-list">
			<c:forEach var="notice" items="${notice.content}">
				<c:choose>
					<c:when test="${notice.event == '이벤트'}">
						<div class="col-lg-3 col-md-6 special-grid event">
							<div class="products-single fix">
								<div class="box-img-hover">
									<img src="../images/gallery-img-03.jpg" class="img-fluid"
										alt="Image">
									<div class="mask-icon">
										<a class="cart" href="/notice/${notice.id}">GO!</a>
									</div>
								</div>
							</div>
						</div>
					</c:when>
					<c:otherwise>
						<div class="col-lg-3 col-md-6 special-grid notice">
							<div class="products-single fix">
								<div class="box-img-hover">
									<img src="../images/gallery-img-02.jpg" class="img-fluid"
										alt="Image">
									<div class="mask-icon">
										<a class="cart" href="/notice/${notice.id}">GO!</a>
									</div>
								</div>
							</div>
						</div>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
	</div>
</div>
<!-- End Gallery  -->
<div class="pagination justify-content-center" style="margin-bottom: 100px;">
	<c:if test="${principal.user.roles == 'ADMIN'}">
	<a href="/notice/noticeSaveForm" class="btn hvr-hover">공지사항 작성</a>
</c:if>
</div>
<ul class="pagination justify-content-center">
	<c:choose>
		<c:when test="${notice.first}">
			<li class="page-item disabled"><a class="page-link"
				href="?page=${notice.number-1}">PREVIOUS</a></li>
		</c:when>
		<c:otherwise>
			<li class="page-item"><a class="page-link"
				href="?page=${notice.number-1}">Previous</a></li>
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${notice.last}">
			<li class="page-item disabled"><a class="page-link"
				href="?page=${notice.number+1}">NEXT</a></li>
		</c:when>
		<c:otherwise>
			<li class="page-item"><a class="page-link"
				href="?page=${notice.number+1}">NEXT</a></li>
		</c:otherwise>
	</c:choose>
</ul>
<br />


<%@ include file="../layout/footer.jsp"%>