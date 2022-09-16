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
				<h2>Season</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Home</a></li>
					<li class="breadcrumb-item active">Shop</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->

<!-- Start Products  -->
<div class="products-box">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="title-all text-center">
					<h1>Fruits의 국내산 상품</h1>
					<p>싱싱한 국내산 과일들을 만나보세요!</p>
				</div>
			</div>
		</div>

		<div class="shop-box-inner">
			<div class="container">
				<div class="row">
					<div
						class="col-xl-9 col-lg-9 col-sm-12 col-xs-12 shop-content-right">
						<div class="right-product-box">
							<div class="product-item-filter row">
								<div class="col-12 col-sm-8 text-center text-sm-left"></div>
								<div class="col-12 col-sm-4 text-center text-sm-right">
									<ul class="nav nav-tabs ml-auto">
										<li><a class="nav-link active" href="#grid-view"
											data-toggle="tab"> <i class="fa fa-th"></i>
										</a></li>
										<li><a class="nav-link" href="#list-view"
											data-toggle="tab"> <i class="fa fa-list-ul"></i>
										</a></li>
									</ul>
								</div>
							</div>

							<div class="product-categorie-box">
								<div class="tab-content">
									<div role="tabpanel" class="tab-pane fade show active"
										id="grid-view">
										<div class="row">
											<c:forEach var="prod" items="${products.content}">
												<c:if test="${prod.origin == '국산'}">
													<div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
														<div class="products-single fix">
															<div class="box-img-hover">
																<c:if test="${prod.bprice != 0 }">
																	<div class="badge bg-dark text-white position-absolute"
																		style="top: 0.5rem; right: 0.5rem">Sale</div>
																</c:if>
																<img src="../${prod.prodImgPath}" class="img-fluid"
																	alt="Image">
																<div class="mask-icon">
																	<a class="cart"
																		href="/cart/${prod.productId}/prodDetail">In Detail!</a>
																</div>
															</div>
															<div class="why-text">
																<h4>${prod.productName}</h4>
																<h5>
																	<c:if test="${prod.bprice != 0 }">
																		<span class="text-muted text-decoration-line-through">
																			<fmt:formatNumber value="${prod.bprice}"
																				type="currency" />
																		</span>
																	</c:if>

																	<fmt:formatNumber value="${prod.price}" type="currency" />
																</h5>
															</div>
														</div>
													</div>
												</c:if>
											</c:forEach>
										</div>
									</div>

									<div role="tabpanel" class="tab-pane fade" id="list-view">
										<c:forEach var="prod" items="${products.content}">
											<c:if test="${prod.origin == '국산'}">
												<div class="list-view-box">
													<div class="row">
														<div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
															<div class="products-single fix">
																<div class="box-img-hover">
																	<c:if test="${prod.bprice != 0 }">
																		<div
																			class="badge bg-dark text-white position-absolute"
																			style="top: 0.5rem; right: 0.5rem">Sale</div>
																	</c:if>
																	<img src="../${prod.prodImgPath}" class="img-fluid"
																		alt="Image">
																</div>
															</div>
														</div>
														<div class="col-sm-6 col-md-6 col-lg-8 col-xl-8">
															<div class="why-text full-width">
																<h4>${prod.productName}</h4>
																<h5>
																	<c:if test="${prod.bprice != 0 }">
																		<span class="text-muted text-decoration-line-through">
																			<fmt:formatNumber value="${prod.bprice}"
																				type="currency" />
																		</span>
																	</c:if>

																	<fmt:formatNumber value="${prod.price}" type="currency" />
																</h5>
																<p>상품 설명 : ${prod.productDetail}</p>
																<a class="btn hvr-hover"
																	href="/cart/${prod.productId}/prodDetail">In Detail!</a>
															</div>
														</div>
													</div>
												</div>
											</c:if>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-xl-3 col-lg-3 col-sm-12 col-xs-12 sidebar-shop-left">
						<div class="product-categori">
							<div class="search-product">
								<form action="#">
									<input class="form-control" placeholder="Search here..."
										type="text">
									<button type="submit">
										<i class="fa fa-search"></i>
									</button>
								</form>
							</div>
							<div class="filter-sidebar-left">
								<div class="title-left">
									<h3>Categories</h3>
								</div>
								<div
									class="list-group list-group-collapse list-group-sm list-group-tree"
									id="list-group-men" data-children=".sub-men">
									<div class="list-group-collapse sub-men">
										<a class="list-group-item list-group-item-action"
											href="#sub-men1" data-toggle="collapse" aria-expanded="true"
											aria-controls="sub-men1">Fruits<small class="text-muted">(100)</small>
										</a>
										<div class="collapse show" id="sub-men1"
											data-parent="#list-group-men">
											<div class="list-group">
												<a href="#"
													class="list-group-item list-group-item-action active">Fruits
													1 <small class="text-muted">(50)</small>
												</a> <a href="#" class="list-group-item list-group-item-action">Fruits
													2 <small class="text-muted">(10)</small>
												</a> <a href="#" class="list-group-item list-group-item-action">Fruits
													3 <small class="text-muted">(10)</small>
												</a> <a href="#" class="list-group-item list-group-item-action">Fruits
													4 <small class="text-muted">(10)</small>
												</a> <a href="#" class="list-group-item list-group-item-action">Fruits
													5 <small class="text-muted">(20)</small>
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Products  -->


<%@ include file="../layout/footer.jsp"%>

</html>