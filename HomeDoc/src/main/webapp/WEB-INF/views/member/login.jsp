<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>HomeDoc : 로그인</title>
</head>
<body>
	<div class="container" style="width: 511px;">
		<div style="text-align: center; margin: 80px 0px 30px 0px;">
			<a href="/comso/jiseong"
				style="font-size: 70px; color: black; text-decoration: none;"><b>HomeDoc</b></a>
		</div>
		<form:form id="fmField" name="fmField" action="login" method="post"
			modelAttribute="memberDto" onsubmit="return checkForm();">
			<div class="form-group">
				<input type="text" name="id" id="userId" class="form-control"
					placeholder="아이디">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" name="pw"
					id="userPw" placeholder="비밀번호">
			</div>
			<div class="form-check"></div>

			<button type="submit" class="btn btn-dark"
				style="width: 470px; height: 50px;">로그인</button>
			<br> <br>

			<div class="modal-footer">

				<div class="form-register">
					<a href="/find_id.html">아이디 찾기</a> ㅣ <a href="/find_pw.html">비밀번호
						찾기</a> ㅣ <a href="/register.html"> 회원가입 </a>
				</div>

			</div>
		</form:form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>


	<script>
    //  로그인에서 아이디 체크, 비밀번호 체크 검사
    
      function checkForm() {
    var userId = document.fmField.userId;
    // 아이디 입력 유무 체크
    if(userId.value == '' || !(userId.value.length >= 1 && userId.value.length <= 12)) {
        window.alert("아이디를 입력하시오");
        document.fmField.userId.focus();
        document.getElementById('userId').select();
        return false; // 아이디 입력이 안되어 있다면 submint 이벤트를 중지
    }
    var userPw = document.getElementById('userPw');
    // 암호 입력 유무 체크
    if(document.fmField.userPw.value == ''){
        alert('비밀번호를 입력하세요.');
        userPw.focus();
        return false;
    }
}
      </script>
</body>
</html>