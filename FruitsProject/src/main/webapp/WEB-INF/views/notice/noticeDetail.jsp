<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<div>
		<br /> <br />
		<div>
			Number : <span id="id"><i>${notice.id }</i></span> 
			<br>Writer : <span><i>${notice.users.username }</i></span>
			<br>Date : <span>${notice.createDate }</span>
		</div>
		<br>
		<br>
		<h3>Title : ${notice.title}</h3>
	</div>
	<hr />
	<div>
		Content : 
		<div>${notice.content}</div>
	</div>
	<hr />

	<button class="btn btn-secondary" onclick="history.back()">돌아가기</button>
	<c:if test="${principal.user.roles == 'ADMIN'}">
		<!-- bear를 admin 계정으로 설정 -->
		<button id="btn-Ndelete" class="btn btn-danger">삭제</button>
	</c:if>
	<a href="/notice/${notice.id}/noticeUpdateForm" class="btn btn-warning">수정</a>
</div>
<br>
<br>

<script type="text/javascript" src="/js/notice.js"></script>
<%@ include file="../layout/footer.jsp"%>