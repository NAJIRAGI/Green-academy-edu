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
					<h2>Contact Us</h2>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="/">Home</a></li>
						<li class="breadcrumb-item active">Contact Us</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- End All Title Box -->

	<!-- Start Wishlist  -->
	<div class="contact-box-main">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-sm-12">
					<div class="contact-form-right">
						<h2>문의하기</h2>
						<p>고객님과의 소통을 위한 공간입니다. 무엇이든 질문하시면 저희가 빠르게 확인하여 답변드리도록 하겠습니다!</p>
						<form>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<input type="text" class="form-control" id="title" name="name"
											placeholder="Title" required
											data-error="Please enter your Subject">
										<div class="help-block with-errors"></div>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<textarea class="form-control" id="content"
											placeholder="Your Message" rows="4"
											data-error="Write your message" required></textarea>
										<div class="help-block with-errors"></div>
									</div>
									<div class="submit-button text-center">
                                        <button class="btn hvr-hover" id="btn-save">Send Message</button>
                                        <div id="msgSubmit" class="h3 text-center hidden"></div>
                                        <div class="clearfix"></div>
                                    </div>
								</div>
							</div>
						</form>									
					</div>
				</div>
				<div class="col-lg-4 col-sm-12">
					<div class="contact-info-left">
						<h2>CONTACT INFO</h2>
						<p>고객님과 소통을 위한 연락처입니다.</p>
						<ul>
							<li>
								<p>
									<i class="fas fa-map-marker-alt"></i>Address: <br>(도로명)
									경기도 수원시 팔달구 매산로 12-1 <br> (지번) 경기도 수원시 팔달구 매산로1가 55-3
								</p>
							</li>
							<li>
								<p>
									<i class="fas fa-phone-square"></i>Tel: <a
										href="tel:031-243-2111">031-243-2111</a>
								</p>
							</li>
							<li>
								<p>
									<i class="fas fa-envelope"></i>Email: <a
										href="mailto:contactinfo@gmail.com">contactinfo@gmail.com</a>
								</p>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Wishlist -->
<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>
</html>