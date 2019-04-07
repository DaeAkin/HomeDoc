<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
  <head>
    <title>HomeDoc</title>
    
    <%
	String resourceUri = request.getContextPath() + "/resources/";
%>

<body>      
  <!-- 전체를 감싸는 div -->
  <div class="d-flex" id="wrapper" style="">      

	
	
    <!-- Page Content -->
    <div id="page-content-wrapper">

      <!-- 네비게이션 바 -->
	  <nav class="navbar navbar-expand-lg fixed-top navbar-light bg-light " style="margin-bottom: 80px; height: 37pt;">

	  <!-- 로고 -->
		<!-- 메뉴 모양 -->
		 <a href="index.html">
		<div style="margin: 0px 10px 0px 10px;">   
			<span style="color: gray; cursor:pointer;" ><i class="fas fa-bars fa-lg"  id="menu-toggle"></i></span>
        </div>
		
    
	  <!-- 홈 모양 / 로고 -->
		<div class="container" style="width:100px;">
	      <span style="color:limegreen"><i class="fas fa-house-damage fa-lg"></i></span>
		  <div style="margin: 8px 0px 0px 10px;">
			<a class="navbar-brand" href="index.html"><h6>HomeDoc</h6></a>
		  </div>
		</div>
		</a>
	  <!-- 검색 -->
		<div class="container">     
		  <div class="col-lg-8">
			<div class="input-group" style="margin: 0px 0px 0px 100px;">
			  <input type="text" class="form-control" placeholder="검색" style="height: auto; width: 100px;">
			  <span class="input-group-btn">
  				<button class="btn btn-secondary" type="button"><span style="color:white"><i class="fas fa-search"></i></span></button>
			  </span>
			</div>
		  </div>

        <!-- 알림 아이콘 -->
		  <div id="notice">
			
			<span class="p1 fa-stack fa-1x has-badge" data-count="9+" style="color:gray">
				<button type="button"
				data-toggle="popover"
				data-content="
                              
<div>                              
                              
 <div class='list-group'>
  <a href='#' class='list-group-item list-group-item-action flex-column align-items-start' style='width: 240px;'>
    <div>
    <i class='fas fa-paper-plane'></i>
    &nbsp
    <b>홍길동 님의 댓글.</b>
    <br> <small>아주 좋네요!</small>
    <br> <small>1분 전</small>
    </div>
  </a>

    <a href='#' class='list-group-item list-group-item-action flex-column align-items-start' style='width: 240px;'>
        <div>
        <i class='fas fa-paper-plane'></i>
        &nbsp
        <b>김나라 님의 댓글.</b>
        <br> <small>Great</small>
        <br> <small>1시간 전</small>
        </div>
      </a>
                              
                              
    <a href='#' class='list-group-item list-group-item-action flex-column align-items-start' style='width: 240px;'>
        <div>
        <i class='fas fa-paper-plane'></i>
        &nbsp
        <b>강과산 님의 댓글.</b>
        <br> <small>직원이 불친절 하시네요..;</small>
        <br> <small>1일 전</small>
        </div>
      </a>
  </div>
				"
				data-html="true" data-placement="bottom"
				style="border:0px; background-color:#F8F9FA;"><i class="fas fa-bell fa-lg" style="cursor:pointer"></i></button></span>
			
			
          </div>
      <!-- 검색 div 끝 -->  
		</div>

	    <!-- 로그인 버튼 -->     
		<form  class="nav_log" align="right">
          <font data-toggle="modal" data-target="#loginModal" style="cursor:pointer">
	        <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">로그인</button>
		  </font>

		<!-- 로그인 버튼 form 끝 -->
		</form>

	  <!-- 네비게이션 바 끝 -->
	  </nav>

	  <!-- @@@@@@@@@@@@@@@@내용은 여기에@@@@@@@@@@@@@@@@@ -->

	  <!-- 전체 div -->
	  <div id="jb-container">

	  <!-- div#jb-container end -->
	  </div>	

	  <!-- @@@@@@@@@@@@@@@@내용은 여기까지@@@@@@@@@@@@@@@@@ -->

	<!-- Page Content 끝 -->
	</div>
  <!-- 전체를 감싸는 div 끝 -->
  </div>

    
<!-- Login Modal -->
<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">HomeDoc</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="fmField" name="fmField" action="" method="post" onsubmit="return checkForm();">
		  <div class="form-group">
			<input type="text" name="userId" id="userId" class="form-control" aria-describedby="emailHelp" placeholder="아이디">
		  </div>
		  <div class="form-group">
			<input type="password" class="form-control" name="userPw" id="userPw" placeholder="비밀번호">
		  </div>
		  <div class="form-check">
		  </div>
		  <button type="submit" class="btn btn-dark" style="width: 470px; height: 50px;">로그인</button>
			<br>
			<br>

        <div class="modal-footer">
          
            <div class="form-register">
                <a href="#">아이디 찾기</a>
                ㅣ
                <a href="#">비밀번호 찾기</a>
                ㅣ
                <font data-toggle="modal" data-target="#registerModal" style="cursor:pointer">
        회원가입
		</font></div>
            
        </div>
</form>
      </div>
      
    </div>
  </div>
</div>
    
    
    
            <!-- register Modal -->
<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">HomeDoc</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form action="#" onsubmit="return tocheckall();" data-ajax="false" method="post">

    <div class="form-group col-md-14">
      <label for="inputEmail4" class="col-form-label">아이디</label>
      <input type="text" class="form-control" id="userId" name="userId" placeholder="">
    </div>

    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호</label>
      <input type="password" class="form-control" id="Pw" name="pw" placeholder="">
    </div>
            
<!--
    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호</label>
      <input type="password" class="form-control" id="user_pass" name="user_pass" placeholder="">
    </div>
-->
            
    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호 재확인</label>
      <input type="password" class="form-control" id="PwCheck" placeholder="">
    </div>
            <p id="pwsame" style="color:red;"></p>
            
<!--
    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호 재확인</label>
      <input type="password" class="form-control" id="chpass" name="chpass">
    </div>
            <font name="check" size="2" color="red"></font> 
-->

    
  
  <div class="form-group">
    <label for="inputAddress" class="col-form-label">주소</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="서울특별시 노원구">
  </div>
  
            <label for="inputAddress" class="col-form-label">본인 확인 이메일</label>
<div class="form-row align-items-center">
    <div class="col-md-5">
      <label class="sr-only" for="inlineFormInput">Name</label>
      <input type="text" class="form-control mb-2 mb-sm-0" id="inlineFormInput" placeholder="아이디">
    </div>
    <div class="col">
      <label class="sr-only" for="inlineFormInputGroup">Username</label>
      <div class="input-group mb-2 mb-sm-0">
        <div class="input-group-addon">@</div>
        <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="">
          &nbsp;
          <button type="button" class="btn btn-info">인증</button>
      </div>
    </div>
    
            </div>
            
            <br>
  <div class="form-row align-items-center">
    <div class="form-group col-md-4">
        
      <label for="inputCity" class="col-form-label">인증번호</label>
      <input type="text" class="form-control" id="inputCity">

        
    </div>
      
      <div class="form-group col-md-3">
            <br>
            <button type="button" class="btn btn-success btn-sm">인증확인</button>
            </div>
    </div>
            
            
        <div class="modal-footer">
            <button type="submit" class="btn btn-dark" style="width: 500px; height:50px;">회원가입</button>
          
        </div>
        </form>
      </div>
      
        
    </div>
  </div>
</div>
    
    
    
    
	


<!-- 로그인 Ajax -->	
	<script type="text/javascript">
    $(document).ready(function() {
    	
       //아이디 중복확인하기.
       $("#loginButton").click(function() {

     /*   if($("#id").val().trim() == "") {
    	   	alert("아이디를 입력해주세요");
    	   	return false;
       }  */
       	
       	
       	var objParams = {
       			id			:	$("#userId").val(),
       			pw			:	$("#userPw").val()
       	};
       	
       	//ajax 호출
       	$.ajax ({
       		url				:	"<%=request.getContextPath()%>/member/login",
       		dataType		:	"json",
       		contentType		:	"application/x-www-form-urlencoded; charset=UTF-8",
       		type			:	"post",
       		async			:	true, //동기식으로 처리하는 방법 동기식 false, 비동기식 true
       		data			:	objParams,
       		success			:	function(reVal) {
       			
       			if(reVal.code != "OK") {
       				alert("아이디나 비밀번호를 확인해주세요.");
       				
       				console.log("사용 불가능한 아이디.");
       			} else {
       				
       				// ajax가 성공하면 할일
       				String url = <% request.getRequestURL().substring(0, request.getRequestURL().indexOf(request.getContextPath())); %>
       				window.location.replace(url);
       				
       		} 
       			},
       		error		:	function(request, status, error) {
       			console.log("AJAX_ERROR");
       		}
       		
       			
       		
       		
       		
       	});
     
       	
       })
       
       
       // 로그인 끝
        
           $("#memberSubmit").click(function() {
            
            $("#membercheck").submit();
            
        })
        
        
        /* 닉네임 중복확인 */
        
        
    });
        
    
</script>
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
    
    

// 회원가입 유효성 검사 나머지
    
    function tocheckall() {
        var userId = document.fmField.userId;
        
        if(userId.value == '' || !(userId.value.length >= 1 && userId.value.length <= 12)) {
        window.alert("아이디를 입력하시오");
        document.fmField.userId.focus();
        document.getElementById('userId').select();
        return false; // 아이디 입력이 안되어 있다면 submint 이벤트를 중지
    }
        
        var pw = document.getElementById("Pw").value;
        var pwck = document.getElementById("PwCheck").value;        
        
        if (pw != pwck) {
                document.getElementById('pwsame').innerHTML = '비밀번호가 틀렸습니다. 다시 입력해 주세요';
                return false;
            }
    }
    
    
    
    
	function openNav() {
		document.getElementById("mySidenav").style.width = "250px";
	}

	function closeNav() {
	    document.getElementById("mySidenav").style.width = "0px";
	}
/*  Menu Toggle Script */
	 $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });

	$(function () {
  $('[data-toggle="popover"]').popover()
})
    
    
</script>
      
  </body>
</html>