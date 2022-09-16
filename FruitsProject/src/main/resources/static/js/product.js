let index = {
	init: function() {
		$("#btn-prodinsert").on("click", () => {
			this.insert();
		});
		$("#btn-prodmodify").on("click", () => {
			this.modify();
		});
		$("#btn-proddelete").on("click", () => {
			this.deleteById();
		});
	},

	insert: function() {
		let data = {
			productId: $("#productId").val(),
			productName: $("#productName").val(),
			bprice: $("#bprice").val(),
			price: $("#price").val(),
			origin: $("input[name='origin']:checked").val(),
			season: $("input[name='season']:checked").val(),
			recommend: $("input:checkbox[name='recommend']:checked").val(),
			productDetail: $("#productDetail").val(),
			prodImgPath: $("#imgup").val()

		};

		$.ajax({
			type: "POST",
			url: "/api/insert",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(resp) {
			alert("상품 등록 완료");
			location.href = "/admin/product/list";
		}).fail(function(error) {
			if (data.productName == "") {
				alert('상품명을 입력하세요');
				$("#productName").focus();
				return false;
			} else if (data.price == "") {
				alert('가격을 입력하세요');
				$("#price").focus();
				return false;
			} else if (data.prodImgPath == "") {
				alert('상품 이미지를 넣어주세요');
				$("#imgup").focus();
				return false;
			} else if (data.productDetail == "") {
				alert('상품 정보를 입력해주세요');
				$("#productDetail").focus();
				return false;
			}
			return true;
		});
	},


	modify: function() {

		let productId = $("#productId").val();


		let data = {
			productId: $("#productId").val(),
			productName: $("#productName").val(),
			stock: $("input[name='stock']:checked").val(),
			price: $("#price").val(),
			bprice: $("#bprice").val(),
			origin: $("input[name='origin']:checked").val(),
			prodStatus: $("input[name='prodStatus']:checked").val(),
			season: $("input[name='season']:checked").val(),
			recommend: $("input:checkbox[name='recommend']:checked").val(),
			productDetail: $("#productDetail").val(),
			prodImgPath: $("#imgup").val()

		};


		$.ajax({
			type: "PUT",
			url: "/api/admin/product/read/" + productId,
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(resp) {
			alert("수정 완료");
			location.href = "/admin/product/list";
		}).fail(function(error) {
			console.log(data.origin)
			if (data.productName == "") {
				alert('상품명을 입력하세요');
				$("#productName").focus();
				return false;
			} else if (data.price == "") {
				alert('가격을 입력하세요');
				$("#price").focus();
				return false;
			} else if (data.prodImgPath == "") {
				alert('상품 이미지를 넣어주세요');
				$("#imgup").focus();
				return false;
			} else if (data.productDetail == "") {
				alert('상품 정보를 입력해주세요');
				$("#productDetail").focus();
				return false;
			} else if ($("input:radio[name='prodStatus']").is(":checked") == false) {
				alert("판매 상태를 입력해주세요");
				return false;
			} else if ($("input:radio[name='origin']").is(":checked") == false) {
				alert("상품 구분을 입력해주세요");
				return false;
			} else if ($("input:radio[name='season']").is(":checked") == false) {
				alert("제철 날짜를 입력해주세요");
				return false;
			}
			return true;
		});
	},

	deleteById: function() {
		let productId = $("#productId").val();
		console.log(productId);
		$.ajax({
			type: "DELETE",
			url: "/api/admin/product/read/" + productId,
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(resp) {
			alert("삭제 완료");
			location.href = "/admin/product/list";
		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},


}
index.init();

