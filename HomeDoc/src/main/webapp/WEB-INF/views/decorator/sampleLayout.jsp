<%@page import="com.www.homedoc.dto.AlertDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 

<%
	String resourceUri = request.getContextPath() + "/resources/";
%>



<!doctype html>
<html lang="ko">
  <head>
    <title>HomeDoc</title>
	<script
	  src="https://code.jquery.com/jquery-3.4.0.slim.js"
	  integrity="sha256-milezx5lakrZu0OP9b2QWFy1ft/UEUK6NH1Jqz8hUhQ="
	  crossorigin="anonymous"></script>
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
	<style>

		.list-group-item:first-child {
  
    width: 250px;

	}
	</style>
	

	</head>

<body>      

  <!-- 전체를 감싸는 div -->
  <div class="d-flex" id="wrapper" style="">      

	<!-- Sidebar -->
	<div class="bg-light border-right" id="sidebar-wrapper" style="">
      <div class="sidebar-heading" style="background-color:white; height:50px; border: 1px solid #ffffff;"><font color="white">HomeDocssssssssssssss</font></div>
      <div class="list-group list-group-flush" style="position: fixed;">
		<a href="mypage.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-user">&nbsp&nbsp&nbsp</i>마이 페이지</a>
        <a href="quo_select.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-house-damage">&nbsp&nbsp</i>수리견적</a>
		<a href="quo_select_c.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-house-damage">&nbsp&nbsp</i>견적 확인(업체메뉴)</a>
        <a href="company_list.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-search">&nbsp&nbsp&nbsp</i>업체검색</a>
		<button class="list-group-item list-group-item-action bg-light" style="width:239px;  border-bottom:1px;" data-toggle="collapse" data-target="#side_m0" aria-expanded="false" aria-controls="collapseExample"><i class="fab fa-fort-awesome">&nbsp&nbsp</i>하우징 서비스</button>
<!--<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
data-target 버튼
</button> -->
		<div class="collapse" id="side_m0" style="width:240px;">
		  <div style="width:240px; padding:5px 10px 0px 10px; background-color:#EBF2F7;">
			<a href="housing_1.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp침실</a>
			<a href="housing_2.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp욕실</a>
			<a href="housing_3.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp거실</a>
		  </div>
		</div>

		<button class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;" data-toggle="collapse" data-target="#side_m1" aria-expanded="false" aria-controls="collapseExample"><i class="fas fa-bed">&nbsp&nbsp</i>실내 인테리어</button>
<!--<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
data-target 버튼
</button> -->
		<div class="collapse" id="side_m1" style="width:240px;">
		  <div style="width:240px; padding:5px 10px 0px 10px; background-color:#EBF2F7;">
			<a href="inter_1.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp도배 / 장판</a>
			<a href="inter_2.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp전기 / 조명</a>
			<a href="inter_3.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp유리교체 / 창호</a>
		  </div>
		</div>

		<button class="list-group-item list-group-item-action bg-light" style="width:239px;  border:none;" data-toggle="collapse" data-target="#side_m2" aria-expanded="false" aria-controls="collapseExample"><i class="fas fa-store-alt">&nbsp&nbsp</i>실외 인테리어</button>
<!--<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
data-target 버튼
</button> -->
		<div class="collapse" id="side_m2" style="width:240px;">
		  <div style="width:240px; padding:5px 10px 0px 10px; background-color:#EBF2F7;">
			<a href="out_1.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp외벽 / 지붕수리</a>
			<a href="out_2.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp타일 시공</a>
			<a href="out_3.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp페인트</a>
			</div>
		</div>
		<a href="review.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-search">&nbsp&nbsp</i>서비스 후기</a>
		<button class="list-group-item list-group-item-action bg-light" style="width:239px;" data-toggle="collapse" data-target="#side_ser" aria-expanded="false" aria-controls="collapseExample"><i class="fas fa-headphones-alt">&nbsp&nbsp</i>고객센터</button>
<!--<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
data-target 버튼
</button> -->
		<div class="collapse" id="side_ser" style="width:240px;">
		  <div style="width:240px; padding:5px 10px 0px 10px; background-color:#EBF2F7;">
			<a href="service.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp자주묻는 질문 / 답변</a>
			<a href="service_request.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp 1:1 문의하기</a>
			<a href="about_us.html" class="list-group-item list-group-item-action" style="width:229px; border:none;background-color:#EBF2F7; ">&nbsp도움말</a>
			</div>

		</div>
<!--    <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-phone">&nbsp&nbsp&nbsp&nbsp</i>Contact</a> -->
        <a href="../admin_door.html"
		class="list-group-item list-group-item-action bg-light"
		style="width:239px; border:none;">
		<i class="fas fa-user-cog">&nbsp</i>관리자모드(TEST)</a>
      </div>
    </div>
	
    <!-- Page Content -->
    <div id="page-content-wrapper">

      <!-- 네비게이션 바 -->
	  <nav class="navbar navbar-expand-lg fixed-top navbar-light" style="margin-bottom: 80px; height: 37pt; background-color:#ffffff">

	  <!-- 로고 -->
		<!-- 메뉴 모양 -->
		 
		<div style="margin: 0px 10px 0px 10px;">   
			<span style="color: gray; cursor:pointer;" ><i class="fas fa-bars fa-lg"  id="menu-toggle"></i></span>
        </div>
		
    
	  <!-- 홈 모양 / 로고 -->
	  <a href="index.html">
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
        <% if(session.getAttribute("id") != null ) { %>
					<div id="notice">

						<span class="p1 fa-stack fa-1x has-badge"
							data-count="${alertSize}" style="color: gray">
							<button type="button" data-toggle="popover"
								data-content="
                              
<div>                              
                              
 <div class='list-group'>
 <c:forEach var="alertDto" items="${alertDtos}" varStatus="status">
  <a href='<%=request.getContextPath() %>/reply/alertView?no=${alertDto.no}&reply_no=${alertDto.reply_no}' class='list-group-item list-group-item-action flex-column align-items-start'
    
    <c:if test="${alertDto.isalert}">
  style='background-color: RGB(248,249,250)';
  </c:if>
  >


   	
    <div>
    <i class='fas fa-paper-plane'></i>
    &nbsp
    <b>${alertDto.writer } 님의 댓글</b>
    <br> <small>${alertDto.content }</small>
    <br> <small>${alertDto.datetime } </small> 
    </div>
</a>
  </c:forEach>


                              
                              

  </div>
  
				"
								data-html="true" data-placement="bottom"
								style="border: 0px; background-color: #F8F9FA;">
								<i class="fas fa-bell fa-lg" style="cursor: pointer"></i>
							</button>
						</span>


					</div>
					
					<%} %>
					<!-- 검색 div 끝 -->  
		</div>

		<%if(session.getAttribute("id") == null) { %>
	    <!-- 로그인 버튼 -->     
			<form  class="nav_log" align="right">
          <font data-toggle="modal" data-target="#loginModal" style="cursor:pointer">
	        <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">로그인</button>
		  </font>
		  <%} else { %>
		  
		  	<form  class="nav_log" align="right">
          <font data-toggle="modal" data-target="#loginModal" style="cursor:pointer">
	        <a href="<%=request.getContextPath() %>/member/logout" type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">로그아웃</a>
		  </font>
		  <%} %>

		<!-- 로그인 버튼 form 끝 -->
		</form>

	  <!-- 네비게이션 바 끝 -->
	  </nav>

	  <!-- @@@@@@@@@@@@@@@@내용은 여기에@@@@@@@@@@@@@@@@@ -->
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

            <button type="submit" class="btn btn-dark" style="width: 470px; height: 50px;">로그인</button>
<br>
<br>

        <div class="modal-footer">
          
            <div class="form-register">
                <a href="find_id.html">아이디 찾기</a>
                ㅣ
                <a href="find_pw.html">비밀번호 찾기</a>
                ㅣ
                <a href="register.html">회원가입</a>
		</font></div>
            
        </div>
</form>
      </div>
      
    </div>
  </div>
</div>
    
    
    
            
    
    
	<!-- side menu bar -->
	<!-- Optional JavaScript -->
    <!-- 먼저 jQuery가 오고 그 다음 Popper.js 그 다음 Bootstrap JS -->
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

	<!-- /#wrapper -->

    <!-- Bootstrap core JavaScript -->
   <script src="<%=resourceUri %>vendor/jquery/jquery.min.js"></script>
    <script src="<%=resourceUri %>vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
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
    
    
    //    
//    //패스워드 체크 유효성 검사 2
//    $(function(){
//  $('#user_pass').keyup(function(){
//   $('font[name=check]').text('');
//  }); //#user_pass.keyup
//
//  $('#chpass').keyup(function(){
//   if($('#user_pass').val()!=$('#chpass').val()){
//    $('font[name=check]').text('');
//    $('font[name=check]').html("암호틀림");
//   }else{
//    $('font[name=check]').text('');
//    $('font[name=check]').html("암호맞음");
//   }
//  }); //#chpass.keyup
// });
</script>
      
  </body>
</html>