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
				<h2>Notice</h2>
				<ul class="breadcrumb">
					<li class="breadcrumb-item"><a href="/">Home</a></li>
					<li class="breadcrumb-item active">Notice</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- End All Title Box -->
<div class="cart-box-main" style="margin-left:300px;">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-sm-12">
				<div class="contact-form-right">
					<h2>공지사항 수정</h2>
					<p>공지사항의 내용을 수정하시고 확인 버튼을 눌러주세요!</p>
					<form>						
					<input type="hidden" id="id" value="${notice.id}"/>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<input type="text" class="form-control" id="title" name="name"
										placeholder="Title" value="${notice.title}" required data-error="Please enter your Subject">
									<div class="help-block with-errors"></div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<textarea class="form-control" id="content"
										placeholder="Your Message" rows="4"
										data-error="Write your message" required>${notice.content}</textarea>
									<div class="help-block with-errors"></div>
								</div>
							</div>						
							
							
							<div class="mb-3">
								<label for="origin">Notice or Event</label><br> 공지사항 <input
									type="radio" id="event" value="공지" name="event"> EVENT<input
									type="radio" id="event" value="이벤트" name="event">								
							</div>
						</div>
					</form>
					<button class="btn hvr-hover" id="btn-Nsave">Notice Update</button>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
<script type="text/javascript" src="/js/notice.js"></script>
<%@ include file="../layout/footer.jsp"%>
