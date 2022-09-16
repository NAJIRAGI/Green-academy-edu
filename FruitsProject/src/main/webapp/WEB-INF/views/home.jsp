<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>

<body onload="triggerBtnClick()">
	<!-- Start Slider -->
	<div id="slides-shop" class="cover-slides">
		<ul class="slides-container">
			<li class="text-center"><img src="images/banner-01.jpg" alt="">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<h1 class="m-b-20">
								<strong> Fruits Shop에 오신 걸!<br> 환영합니다!
								</strong>
							</h1>
							<p class="m-b-40">
								항상 신선한 제품만을 취급합니다. <br> 제철 상품부터 과일로 만든 과일청까지 자연의 향기를 느껴보세요!
							</p>
							<p>
								<a class="btn hvr-hover" href="/auth/all">Shop New</a>
							</p>
						</div>
					</div>
				</div></li>
			<li class="text-center"><img src="images/banner-02.jpg" alt="">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<h1 class="m-b-20">
								<strong> Fruits Shop에 오신 걸!<br> 환영합니다!
								</strong>
							</h1>
							<p class="m-b-40">
								항상 신선한 제품만을 취급합니다. <br> 제철 상품부터 과일로 만든 과일청까지 자연의 향기를 느껴보세요!
							</p>
							<p>
								<a class="btn hvr-hover" href="/auth/all">Shop New</a>
							</p>
						</div>
					</div>
				</div></li>
			<li class="text-center"><img src="images/banner-03.jpg" alt="">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<h1 class="m-b-20">
								<strong> Fruits Shop에 오신 걸!<br> 환영합니다!
								</strong>
							</h1>
							<p class="m-b-40">
								항상 신선한 제품만을 취급합니다. <br> 제철 상품부터 과일로 만든 과일청까지 자연의 향기를 느껴보세요!
							</p>
							<p>
								<a class="btn hvr-hover" href="/auth/all">Shop New</a>
							</p>
						</div>
					</div>
				</div></li>
		</ul>
		<div class="slides-navigation">
			<a href="#" class="next"><i class="fa fa-angle-right"
				aria-hidden="true"></i></a> <a href="#" class="prev"><i
				class="fa fa-angle-left" aria-hidden="true"></i></a>
		</div>
	</div>
	<!-- End Slider -->

	<!-- Start Categories  -->
	<div class="categories-shop">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
					<div class="shop-cat-box">
						<img class="img-fluid" src="images/categories_img_01.jpg" alt="" />
						<a class="btn hvr-hover" href="/auth/season">제철 과일 보러가기!</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
					<div class="shop-cat-box">
						<img class="img-fluid" src="images/categories_img_02.jpg" alt="" />
						<a class="btn hvr-hover" href="/auth/other">과일로 만든 제품 보러가기!</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
					<div class="shop-cat-box">
						<img class="img-fluid" src="images/categories_img_03.jpg" alt="" />
						<a class="btn hvr-hover" href="/notice">EVENT!</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Categories -->

	<div class="box-add-products">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-12">
					<div class="offer-box-products">
						<img class="img-fluid" src="images/add-img-01.jpg" alt="" />
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-12">
					<div class="offer-box-products">
						<img class="img-fluid" src="images/add-img-02.jpg" alt="" />
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Start Products  -->
	<div class="products-box">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="title-all text-center">
						<h1>Fruits의 싱싱한 상품들</h1>
						<p>제철 과일부터, 국,수입 상품까지 원하는 제품을 골라보세요!</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="special-menu text-center">
						<div class="button-group filter-button-group">
							<button id="sea" data-filter=".top-featured">제철 상품</button>
							<button data-filter=".best-seller">추천 상품</button>
						</div>
					</div>
				</div>
			</div>

			<div class="row special-list">
				<c:forEach var="prod" items="${products.content}">
					<c:if test="${prod.recommend == '홈'}">
						<div class="col-lg-3 col-md-6 special-grid best-seller">
							<div class="products-single fix">
								<div class="box-img-hover">
									<c:if test="${prod.bprice != 0 }">
										<div class="badge bg-dark text-white position-absolute"
											style="top: 0.5rem; right: 0.5rem">Sale</div>
									</c:if>
									<img src="${prod.prodImgPath}" class="img-fluid" alt="Image">

									<div class="mask-icon">
										<a class="cart" href="/cart/${prod.productId}/prodDetail">In
											Detail!</a>
									</div>
								</div>
								<div class="why-text">
									<h4>${prod.productName}</h4>
									<h5>
										<c:if test="${prod.bprice != 0 }">
											<span class="text-muted text-decoration-line-through">
												<fmt:formatNumber value="${prod.bprice}" type="currency" />
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

			<div class="row special-list">
				<c:forEach var="prod" items="${products.content}">
					<c:choose>
						<c:when test="${mon == '03'||'04'||'05'}">
							<c:if test="${prod.season == '봄'}">
								<div class="col-lg-3 col-md-6 special-grid top-featured">
									<div class="products-single fix">
										<div class="box-img-hover">
											<c:if test="${prod.bprice != 0 }">
												<div class="badge bg-dark text-white position-absolute"
													style="top: 0.5rem; right: 0.5rem">Sale</div>
											</c:if>
											<img src="${prod.prodImgPath}" class="img-fluid" alt="Image">

											<div class="mask-icon">
												<a class="cart" href="/cart/${prod.productId}/prodDetail">In
													Detail!</a>
											</div>
										</div>
										<div class="why-text">
											<h4>${prod.productName}</h4>
											<h5>
												<c:if test="${prod.bprice != 0 }">
													<span class="text-muted text-decoration-line-through">
														<fmt:formatNumber value="${prod.bprice}" type="currency" />
													</span>
												</c:if>

												<fmt:formatNumber value="${prod.price}" type="currency" />
											</h5>
										</div>
									</div>
								</div>
							</c:if>
						</c:when>
						<c:when test="${mon == '06'||'07'||'08'}">
							<c:if test="${prod.season == '여름'}">
								<div class="col-lg-3 col-md-6 special-grid top-featured">
									<div class="products-single fix">
										<div class="box-img-hover">
											<c:if test="${prod.bprice != 0 }">
												<div class="badge bg-dark text-white position-absolute"
													style="top: 0.5rem; right: 0.5rem">Sale</div>
											</c:if>
											<img src="${prod.prodImgPath}" class="img-fluid" alt="Image">

											<div class="mask-icon">
												<a class="cart" href="/cart/${prod.productId}/prodDetail">In
													Detail!</a>
											</div>
										</div>
										<div class="why-text">
											<h4>${prod.productName}</h4>
											<h5>
												<c:if test="${prod.bprice != 0 }">
													<span class="text-muted text-decoration-line-through">
														<fmt:formatNumber value="${prod.bprice}" type="currency" />
													</span>
												</c:if>

												<fmt:formatNumber value="${prod.price}" type="currency" />
											</h5>
										</div>
									</div>
								</div>
							</c:if>
						</c:when>
						<c:when test="${mon == '09'||'10'||'11'}">
							<c:if test="${prod.season == '가을'}">
								<div class="col-lg-3 col-md-6 special-grid top-featured">
									<div class="products-single fix">
										<div class="box-img-hover">
											<c:if test="${prod.bprice != 0 }">
												<div class="badge bg-dark text-white position-absolute"
													style="top: 0.5rem; right: 0.5rem">Sale</div>
											</c:if>
											<img src="${prod.prodImgPath}" class="img-fluid" alt="Image">
											<div class="mask-icon">
												<a class="cart" href="/cart/${prod.productId}/prodDetail">In
													Detail!</a>
											</div>
										</div>
										<div class="why-text">
											<h4>${prod.productName}</h4>
											<h5>
												<c:if test="${prod.bprice != 0 }">
													<span class="text-muted text-decoration-line-through">
														<fmt:formatNumber value="${prod.bprice}" type="currency" />
													</span>
												</c:if>

												<fmt:formatNumber value="${prod.price}" type="currency" />
											</h5>
										</div>
									</div>
								</div>
							</c:if>
						</c:when>
						<c:when test="${mon == '12'||'01'||'02'}">
							<c:if test="${prod.season == '겨울'}">
								<div class="col-lg-3 col-md-6 special-grid top-featured">
									<div class="products-single fix">
										<div class="box-img-hover">
											<c:if test="${prod.bprice != 0 }">
												<div class="badge bg-dark text-white position-absolute"
													style="top: 0.5rem; right: 0.5rem">Sale</div>
											</c:if>
											<img src="${prod.prodImgPath}" class="img-fluid" alt="Image">
											<div class="mask-icon">
												<a class="cart" href="/cart/${prod.productId}/prodDetail">In
													Detail!</a>
											</div>
										</div>
										<div class="why-text">
											<h4>${prod.productName}</h4>
											<h5>
												<c:if test="${prod.bprice != 0 }">
													<span class="text-muted text-decoration-line-through">
														<fmt:formatNumber value="${prod.bprice}" type="currency" />
													</span>
												</c:if>

												<fmt:formatNumber value="${prod.price}" type="currency" />
											</h5>
										</div>
									</div>
								</div>
							</c:if>
						</c:when>
					</c:choose>
				</c:forEach>
			</div>

		</div>
	</div>
	<!-- End Products  -->

	<!-- Start Blog  -->
	<div class="latest-blog">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="title-all text-center">
						<h1>과일 정보!</h1>
						<p>모르고 먹는 과일보다 알고 먹는 과일이 훨씬 맛있다!</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 col-lg-4 col-xl-4">
					<div class="blog-box">
						<div class="blog-img">
							<img class="img-fluid" src="fruits/국산/사과2.jpg" alt="" />
						</div>
						<div class="blog-content">
							<div class="title-blog">
								<h3>아침 사과의 효능</h3>
								<p>아침에 먹는 사과는 '금'이라고 할 만큼 건강에 유익하기로 소문난 사과. 알려진 것과는 다르게 사과는
									저녁에 먹어도 심신을 상쾌하게 하고 위액 분비를 촉진해 소화흡수를 돕고 배변기능에 도움을 준다. 단, 위장 기능이
									좋지 않은 사람은 사과로 인해 위액 분비가 촉진되어 속이 불편할 수 있는데, 이런 사람은 사과뿐 아니라 다른
									과일도 저녁에 먹는 것을 피해야 한다.</p>
							</div>
							<ul class="option-blog">
								<li><a href="#"><i class="far fa-heart"></i></a></li>
								<li><a href="#"><i class="fas fa-eye"></i></a></li>
								<li><a href="#"><i class="far fa-comments"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-4 col-xl-4">
					<div class="blog-box">
						<div class="blog-img">
							<img class="img-fluid" src="fruits/국산/수박.jpg" alt="" />
						</div>
						<div class="blog-content">
							<div class="title-blog">
								<h3>수박의 효능</h3>
								<p>수박에는 베타카로틴, 카로티노이드의 일종인 리코펜이 풍부하게 함유되어 있다. 두 가지 물질 모두
									대표적인 항산화 물질로 알려져 있는데 특히 리코펜은 베타카로틴보다 항산화 효과가 2배 정도 더 뛰어나다고 알려져
									있다. 노화를 일으키는 주요 원인 중 하나인 활성산소를 효과적으로 제거함으로써 노화 예방뿐만 아니라 다양한
									질병으로부터도 우리 몸을 건강하게 지킬 수 있다.</p>
							</div>
							<ul class="option-blog">
								<li><a href="#"><i class="far fa-heart"></i></a></li>
								<li><a href="#"><i class="fas fa-eye"></i></a></li>
								<li><a href="#"><i class="far fa-comments"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-4 col-xl-4">
					<div class="blog-box">
						<div class="blog-img">
							<img class="img-fluid" src="fruits/국산/토마토.jpg" alt="" />
						</div>
						<div class="blog-content">
							<div class="title-blog">
								<h3>토마토의 효능</h3>
								<p>생으로 먹는 것은 물론 주스, 케첩, 퓌레, 소스로 만들기도 하고 덜 익은 토마토는 피클을 만들어
									먹기도 한다. 서양 요리에서 이처럼 토마토가 많이 쓰이는 이유는 토마토가 알칼리성 식품이라 고기 요리와 잘
									어울리기 때문이다. 고기나 생선 등 기름기 있는 음식을 먹을 때 토마토를 곁들이면, 산성을 중화하고 소화를 촉진해
									위의 부담을 덜 수 있다. 맛도 일품이다!</p>
							</div>
							<ul class="option-blog">
								<li><a href="#"><i class="far fa-heart"></i></a></li>
								<li><a href="#"><i class="fas fa-eye"></i></a></li>
								<li><a href="#"><i class="far fa-comments"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Blog  -->
	<script>
		function triggerBtnClick() {
			document.getElementById("sea").click();
		}
	</script>
</body>

<%@ include file="layout/footer.jsp"%>

</html>