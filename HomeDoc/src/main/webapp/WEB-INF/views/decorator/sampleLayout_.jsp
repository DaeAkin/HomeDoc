<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%
	String resourceUri = request.getContextPath() + "/resources/";
%>

<!doctype html>
<html lang="ko">
  <head>
    <title>HomeDoc</title>

    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

	<meta name="description" content="">
	<meta name="author" content="">

	<!-- Bootstrap core CSS -->
	<link href="<%=resourceUri %>vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="<%=resourceUri %>css/simple-sidebar.css" rel="stylesheet">

	<!-- Basic css -->
	<link href="<%=resourceUri %>css/basic_js.css" rel="stylesheet">

	<!-- icon css -->
	<link href="<%=resourceUri %>css/font-awesome.min.css" rel="stylesheet">
	
		<!-- Bootstrap core CSS -->
	

	<!-- Custom styles for this template -->
	

	


	
	</head>

<body>      
  <!-- 전체를 감싸는 div -->
  <div class="d-flex" id="wrapper" style="overflow: auto;">      

	<!-- Sidebar -->
	<div class="bg-light border-right" id="sidebar-wrapper" style="">
      <div class="sidebar-heading" style=""><font color="white">HomeDocssssssssssssss</font></div>
      <div class="list-group list-group-flush" style="position: fixed;">
		<a href="mypage1.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-user">&nbsp</i>마이 페이지</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-house-damage">&nbsp</i>수리견적</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-search">&nbsp&nbsp</i>업체검색</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fab fa-fort-awesome">&nbsp&nbsp</i>하우징 서비스</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;"><i class="fas fa-headphones-alt">&nbsp&nbsp</i>고객센터</a>
<!--    <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-phone">&nbsp&nbsp&nbsp&nbsp</i>Contact</a> -->
        <a href="admin_door.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-user-cog">&nbsp</i>관리자모드(TEST)</a>
      </div>
    </div>
	
    <!-- Page Content -->
    <div id="page-content-wrapper">

      <!-- 네비게이션 바 -->
	  <nav class="navbar navbar-expand-lg fixed-top navbar-light bg-light " style="margin-bottom: 80px; height: 37pt;">

	  <!-- 로고 -->
		<!-- 메뉴 모양 -->
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

<div id="carouselExampleControls" class="carousel slide" data-ride="carousel" style="margin-top:50px;">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="<%=resourceUri %>img/index_slide_1.jpg" alt="첫번째 슬라이드">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/index_slide_2.jpg" alt="두번째 슬라이드">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/index_slide_3.jpg" alt="세번째 슬라이드">
    </div>
	<div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/index_slide_4.jpg" alt="세번째 슬라이드">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">이전</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">다음</span>
  </a>
</div>

	  <tiles:insertAttribute name="content"/>
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
<form id="fmField" name="fmField" action="<%=request.getContextPath() %>/member/login" method="post" onsubmit="return checkForm();">
  <div class="form-group">
    <input type="text" name="id" id="userId" class="form-control" aria-describedby="emailHelp" placeholder="아이디">
  </div>
  <div class="form-group">
    <input type="password" class="form-control" name="pw" id="userPw" placeholder="비밀번호">
  </div>
  <div class="form-check">
    
  </div>

            <button type="button" id="loginButton" class="btn btn-dark" style="width: 470px; height: 50px;">로그인11</button>
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
      <input type="text" class="form-control" id="userId" name="id" placeholder="">
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
    <input type="text" class="form-control" id="inputAddress" 
    name="address" placeholder="서울특별시 노원구">
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
    
    
    
    
	<!-- side menu bar -->
	<!-- Optional JavaScript -->
    <!-- 먼저 jQuery가 오고 그 다음 Popper.js 그 다음 Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

	<!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
    <script src="<%=resourceUri %>vendor/jquery/jquery.min.js"></script>
    <script src="<%=resourceUri %>vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

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
    
    
//    회원가입에서 비밀번호 체크 유효 검사
    
//    function tocheckpw() {
//            var pw = document.getElementById("Pw").value;
//            var pwck = document.getElementById("PwCheck").value;
//
//            if (pw != pwck) {
//                document.getElementById('pwsame').innerHTML = '비밀번호가 틀렸습니다. 다시 입력해 주세요';
//                return false;
//            }
//        }
    
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