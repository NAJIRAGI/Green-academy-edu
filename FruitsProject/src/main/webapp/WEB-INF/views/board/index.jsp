<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<!-- Start Products  -->
<div class="container">
	<c:forEach var="board" items="${boards.content}">
		<c:if
			test="${board.users.id==principal.user.id || principal.user.roles == 'ADMIN'}">
			<div class="card m-2">
				<div class="card-body">
					<h4 class="card-title">
						<strong> Title : <a href="/board/${board.id}">
								${board.title} (Click!)</a></strong>
					</h4>
					<h6>Writer : ${board.users.username }</h6>
					<h6>
						Date :
						<fmt:formatDate pattern="yyyy-MM-dd" value="${board.createDate}" />
					</h6>
					<c:if test="${!empty board.replys }">
						<br>
						<div class="alert alert-success" role="alert">답변 완료</div>
					</c:if>
					<c:if test="${empty board.replys }">
						<br>
						<div class="alert alert-danger" role="alert">답변 준비중입니다.</div>
					</c:if>
				</div>
			</div>
		</c:if>
	</c:forEach>
	<div class="submit-button text-center">
		<a href="/board/saveForm"><button class="btn hvr-hover">문의하기</button></a>
		<div id="msgSubmit" class="h3 text-center hidden"></div>
		<div class="clearfix"></div>
	</div>
</div>
<br />
<!-- End Products  -->

<%@ include file="../layout/footer.jsp"%>