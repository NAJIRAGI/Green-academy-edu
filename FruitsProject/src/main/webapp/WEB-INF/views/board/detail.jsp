<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	
	<div>
		<br /> <br />
		<div>
			No. : <span id="id"><i>${board.id }</i></span><br> Writer : <span><i>${board.users.username }</i></span><br>
			Date : <span><fmt:formatDate pattern="yyyy-MM-dd"
					value="${board.createDate}" /></span><br>
		</div>
		<br>
		<h3>Title : <span>${board.title}</span></h3>
	</div>
	<hr />
	<div>
		<div>Content : <span>${board.content}</span></div>
	</div>
	<hr />


	<c:if
		test="${principal.user.roles == 'ADMIN'}">

		<div class="card">
			<form>
				<input type="hidden" id="boardId" value="${board.id}" />
				<div class="card-body">
					<p>Comment!</p>
					<textarea id="reply-content" class="form-control" rows="1"></textarea>
				</div>
				<div class="card-footer">
					<button type="button" id="btn-reply-save" class="btn hvr-hover">등록</button>
				</div>
			</form>
		</div>
	</c:if>

		<div class="card">
			<div class="card-header">Answer :</div>
			<ul id="reply--box" class="list-group">
				<c:forEach var="reply" items="${board.replys}">
					<li id="reply--1" class="list-group-item d-flex">

						<div class="font-italic">
							<div>${reply.content}</div>
							<br> Writer : ${reply.users.username }
							<br> Date :<fmt:formatDate pattern="yyyy-MM-dd"
					value="${reply.createDate}" />
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>	
	<br>
	<br>
	<br>
	<button class="btn btn-secondary" onclick="history.back()">돌아가기</button>
	<c:if test="${board.users.id==principal.user.id}">
		<a href="/board/${board.id}/updateForm" class="btn btn-warning">수정</a>
	</c:if>
</div>
<br />
<script type="text/javascript" src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>