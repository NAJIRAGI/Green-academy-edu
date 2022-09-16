let index = {
	init: function() {
		$("#btn-joinsave").on("click", () => {
			this.save();
		});

		$("#btn-userupdate").on("click", () => {
			this.update();
		});

		$("#btn-findId").on("click", () => {
			this.find();
		});

		$("#btn-findpwd").on("click", () => {
			this.findpwd();
		});

		$("#btn-userdelete").on("click", () => {
			this.delete();
		});
		$("#btn-addelete").on("click", () => {
			this.delete();
		});


		/*
		$("#btn-login").on("click",()=>{
			this.login();
		});
	*/
	},

	delete: function() {
		var id = $("#id").val();
		var userid = $("#userid").val();

		$.ajax({
			type: "DELETE",
			url: "/user/updateForm/" + id,
			dataType: "json"
		}).done(function(resp) {
			alert("탈퇴 완료");

			location.href = "/logout";



		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},
	delete: function() {
		var id = $("#id").val();		

		$.ajax({
			type: "DELETE",
			url: "/user/updateForm/" + id,
			dataType: "json"
		}).done(function(resp) {
			alert("탈퇴 완료");

			location.href = "/admin/userList";



		}).fail(function(error) {
			alert(JSON.stringify(error));
		});
	},
	findpwd: function() {
		var pwd = $("#pwd").val();
		var pwdc = $("#pwd_check").val();
		if (pwd != "") {
			if (pwd == pwdc) {
				let data = {
					username: $("#username").val(),
					name: $("#name").val(),
					email: $("#email").val(),
					tel: $("#tel").val(),
					password: pwd
				};

				$.ajax({
					type: "POST",
					url: "/auth/findpwd",
					data: JSON.stringify(data),
					contentType: "application/json; charset=utf-8",
					dataType: "json"
				}).done(function(resp) {
					alert(resp.data);
					if (resp.status != 500) {
						location.href = "/auth/loginForm";
					}
				}).fail(function(error) {
					alert(error.data);

				});
			} else {
				alert("비밀번호가 다릅니다.");
			}
		} else {
			alert("비밀번호 입력해주세요");
		}
	},


	find: function() {
		let data = {
			email: $("#email").val()

		};
		$.ajax({
			type: "POST",
			url: "/auth/findId",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8",
			dataType: "json"
		}).done(function(resp) {
			if (resp.status != 500) {
				alert("사용자의 아이디는 " + resp.data + "입니다. ");
				location.href = "/";
			} else {
				alert("사용자의 이메일을 잘못입력하셨습니다.")
			}
		}).fail(function(error) {
			alert("존재하지 않은 회원입니다.");
		});
	},

	save: function() {
		var address1 = $("#sample6_address").val();
		var address2 = $("#sample6_extraAddress").val();
		var address3 = $("#sample6_detailAddress").val();
		var username = $("#username").val();
		var password = $("#password").val();
		var email = $("#email").val();
		var name = $("#name").val();
		var tel = $("#tel").val();
		if (username != "") {
			if (password != "") {
				if (email != "") {
					if (name != "") {
						if (tel != "") {
							if (address1 || address2 || address3 != "") {
								let data = {
									username: username,
									password: password,
									email: email,
									address: address1 + address2 + address3,
									name: name,
									tel: tel
								};
								$.ajax({
									type: "POST",
									url: "/auth/joinProc",
									data: JSON.stringify(data),
									contentType: "application/json; charset=utf-8",
									dataType: "json"
								}).done(function(resp) {
									alert("회원가입이 완료되었습니다.");
									location.href = "/";
								}).fail(function(error) {
									alert("회원가입에 실패하였습니다.(중복된 아이디 또는 이메일입니다.)");
								});
							} else {
								alert("주소를 입력해주세요")
							}
						} else {
							alert("전화번호를 입력해주세요")
						}
					} else {
						alert("이름을 입력해주세요")
					}
				} else {
					alert("이메일을 입력해주세요")
				}
			} else {

				alert("비밀번호를 입력해주세요")
			}
		} else {

			alert("아이디를 입력해주세요")
		}

	},

	update: function() {
		var address1 = $("#sample6_address").val();
		var address2 = $("#sample6_extraAddress").val();
		var address3 = $("#sample6_detailAddress").val();
		var password = $("#password").val();
		if (password != "") {
			let data = {
				id: $("#id").val(),
				password: password,
				email: $("#email").val(),
				tel: $("#tel").val(),
				address: address1 + address2 + address3
			};
			$.ajax({
				type: "PUT",
				url: "/user",
				data: JSON.stringify(data),
				contentType: "application/json; charset=utf-8",
				dataType: "json"
			}).done(function(resp) {
				alert("회원수정이 완료되었습니다.");
				location.href = "/";
			}).fail(function(error) {
				alert("올바르지 않은 형식입니다.");
			});
		} else {
			alert("비밀번호를 입력해주세요")
		}
	}
	/*
	login: function(){
		let data={
			username: $("#username").val(),
			password: $("#password").val()
		};
		
		$.ajax({
			
			type:"POST",
			url:"/api/user/login",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("로그인이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
	});
}*/
}
index.init();

var currentTab = 0;
document.addEventListener("DOMContentLoaded", function(event) {
	showTab(currentTab);

});

function showTab(n) {
	var x = document.getElementsByClassName("tab");
	x[n].style.display = "block";
	if (n == 0) {
		document.getElementById("prevBtn").style.display = "none";
	} else {
		document.getElementById("prevBtn").style.display = "inline";
	}
	if (n == (x.length - 1)) {
		document.getElementById("nextBtn").innerHTML = '<i class="fa fa-angle-double-right"></i>';
	} else {
		document.getElementById("nextBtn").innerHTML = '<i class="fa fa-angle-double-right"></i>';
	}
	fixStepIndicator(n)
}

function nextPrev(n) {
	var x = document.getElementsByClassName("tab");
	if (n == 1 && !validateForm()) return false;
	x[currentTab].style.display = "none";
	currentTab = currentTab + n;
	if (currentTab >= x.length) {

		document.getElementById("nextprevious").style.display = "none";
		document.getElementById("all-steps").style.display = "none";
		document.getElementById("register").style.display = "none";
		document.getElementById("text-message").style.display = "block";




	}
	showTab(currentTab);
}

function validateForm() {
	var x, y, i, valid = true;
	x = document.getElementsByClassName("tab");
	y = x[currentTab].getElementsByTagName("input");
	for (i = 0; i < y.length; i++) {
		if (y[i].value == "") {
			y[i].className += " invalid";
			valid = false;
		}


	}
	if (valid) {
		document.getElementsByClassName("step")[currentTab].className += " finish";
	}
	return valid;
}

function fixStepIndicator(n) {
	var i, x = document.getElementsByClassName("step");
	for (i = 0; i < x.length; i++) {
		x[i].className = x[i].className.replace(" active", "");
	}
	x[n].className += " active";
}

function sample6_execDaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {
			var addr = '';
			var extraAddr = '';

			if (data.userSelectedType === 'R') {
				addr = data.roadAddress;
			} else {
				addr = data.jibunAddress;
			}

			if (data.userSelectedType === 'R') {
				if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
					extraAddr += data.bname;
				}
				if (data.buildingName !== '' && data.apartment === 'Y') {
					extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
				}
				if (extraAddr !== '') {
					extraAddr = ' (' + extraAddr + ')';
				}
				document.getElementById("sample6_extraAddress").value = extraAddr;

			} else {
				document.getElementById("sample6_extraAddress").value = ' ';
			}
			document.getElementById('sample6_postcode').value = data.zonecode;
			document.getElementById("sample6_address").value = addr;
			document.getElementById("sample6_detailAddress").focus();
		}
	}).open()
}