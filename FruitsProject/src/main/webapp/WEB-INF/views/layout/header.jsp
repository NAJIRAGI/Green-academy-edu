<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->

<head>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal" />
</sec:authorize>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css"
	rel="stylesheet" />
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/703e936e7e.js"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- Mobile Metas -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Site Metas -->
<title>Freshshop - Ecommerce Bootstrap 4 HTML Template</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">

<!-- Site Icons -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="/css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="/css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet" href="/css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="/css/custom.css">


<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<c:set var="date" value="<%=new Date()%>" />
<c:set var="mon">
	<fmt:formatDate value="${date}" pattern="MM" />
</c:set>


</head>

<body>
	<!-- Start Main Top -->
	<div class="main-top">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
					<div class="right-phone-box">
						<p>
							Call US : <a href="#"> 031-243-2111</a>
						</p>
					</div>
					<c:if test="${!empty principal}">
						<div class="our-link">
							<ul>
								<li><a href="/user/updateForm"><i
										class="fa fa-user s_color"></i> My Account</a></li>
								<li><a href="#"><i class="fas fa-location-arrow"></i>
										Our location</a></li>
								<li><a href="#"><i class="fas fa-headset"></i> Contact
										Us</a></li>
								<c:if test="${principal.user.roles == 'ADMIN'}">
									<li class="dropdown"><a href="#"
										class="nav-link dropdown-toggle arrow" data-toggle="dropdown"><i
											class="fas fa-location-arrow"></i>ADMIN PAGE</a>
										<ul class="dropdown-menu"  style="background-color: black;">
											<li><a href="/insert">Product Insert!</a></li>
											<li><a href="/board">Inquiry!</a></li>
											<li><a href="/admin/product/list">Product List!</a></li>
											<li><a href="/admin/adorderlist">Order List!</a></li>
											<li><a href="/admin/userList">User List!</a></li>
																				
										</ul></li>
								</c:if>
							</ul>
						</div>
					</c:if>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
					<div class="login-box">
						<ul>
							<c:choose>
								<c:when test="${!empty principal}">
									<li><p>
											<a class="btn hvr-hover" href="/logout">LOG OUT</a>
										</p></li>
								</c:when>
								<c:otherwise>
									<li><p>
											<a class="btn hvr-hover" href="/auth/loginForm">LOGIN</a>
										</p></li>
								</c:otherwise>
							</c:choose>

						</ul>
					</div>
					<div class="text-slid-box">
						<div id="offer-box" class="carouselTicker">
							<ul class="offer-box">
								<li><i class="fa-solid fa-cart-shopping"></i> 꿀사과 20% 할인 진행
									중!</li>
								<li><i class="fa-solid fa-cart-shopping"></i> 나주 배! 50% 할인
									진행 중!</li>
								<li><i class="fa-solid fa-cart-shopping"></i> 포인트 20% 추가 적립
									진행 중!</li>
								<li><i class="fa-solid fa-cart-shopping"></i> 철 지난 상품 10%
									할인 진행 중!</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Main Top -->

	<!-- Start Main Top -->
	<header class="main-header">
		<!-- Start Navigation -->
		<nav
			class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
			<div class="container">
				<!-- Start Header Navigation -->
				<div class="navbar-header">
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbar-menu" aria-controls="navbars-rs-food"
						aria-expanded="false" aria-label="Toggle navigation">
						<i class="fa fa-bars"></i>
					</button>
					<a class="navbar-brand" href="/"><img src="/images/logo.png"
						class="logo" alt=""></a>
				</div>
				<!-- End Header Navigation -->

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="navbar-menu">
					<ul class="nav navbar-nav ml-auto" data-in="fadeInDown"
						data-out="fadeOutUp">
						<li class="nav-item active"><a class="nav-link" href="/">Home</a></li>
						<c:if test="${principal.user.roles == 'USER'}">						
						<li class="dropdown"><a href="#"
							class="nav-link dropdown-toggle arrow" data-toggle="dropdown">MY</a>
							<ul class="dropdown-menu">
								<li><a href="/user/updateForm">My Page</a></li>
								<li><a href="/user/orderlist">Order List</a></li>
								<li><a href="/board">Inquiry History</a></li>
							</ul></li>
						</c:if>
						<li class="dropdown"><a href="#"
							class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
							<ul class="dropdown-menu">
								<li><a href="/auth/all">All!</a></li>
								<li><a href="/auth/season">Season!</a></li>
								<li><a href="/auth/korean">Domestic!</a></li>
								<li><a href="/auth/imported">Imported!</a></li>
								<li><a href="/auth/good">Recommend!</a></li>
								<li><a href="/auth/other">Other!</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link"
							href="/auth/about">About Us</a></li>
						<li class="nav-item"><a class="nav-link"
							href="auth/notice">Notice</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->

				<!-- Start Atribute Navigation -->
				<div class="attr-nav">
					<ul>
						<li class="side-menu" style="width: 100px;"><a
							href="/cart/cartlist"> <i class="fa fa-shopping-bag"></i> <span
								class="badge"></span>
								<p>My Cart</p>
						</a></li>
					</ul>
				</div>
				<!-- End Atribute Navigation -->
			</div>
		</nav>
		<!-- End Navigation -->
	</header>
	
	<!-- End Main Top -->