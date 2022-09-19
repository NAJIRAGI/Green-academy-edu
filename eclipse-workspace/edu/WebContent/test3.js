 function checkAll() {
	if(document.frm.name.value == ""){
		alert("이름을 입력하세요");
		document.frm.name.focus();
		return false;
	} else if(document.frm.userno1.value.length < 6) {
		alert("주민번호 앞 6자리를 입력해주세요.");
		document.frm.userno1.focus();
		return false;		
	} else if(document.frm.userno2.value.length < 7) {
		alert("주민번호 뒤 7자리를 입력해주세요.");
		document.frm.userno2.focus();
		return false;
	} else if(document.frm.userid.value == "") {
		alert("아이디를 입력하세요");
		document.frm.userid.focus();
		return false;
	} else if(document.frm.userpwd1.value == "") {
		alert("비밀번호를 입력하세요");
		return false;
	} else if(document.frm.userpwd1.value != document.frm.userpwd2.value) {
			alert("비밀번호 불일치");
			return false;
		}else {
		return true;
	}
}