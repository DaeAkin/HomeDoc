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
    <title>Hello, world!</title>
            <style>

.index_tag{
	display: grid;
	grid-template-columns: 250px 250px 250px 250px;
    grid-template-rows: 310px;
}


/* 알림 css */
#notice .p1[data-count]:after{
  position:absolute;
  right:25%;
  top:-20%;
  content: attr(data-count);
  font-size:60%;
  padding:.5em;
  border-radius:50%;
  line-height:1em;
  color: white;
  background:rgba(255,0,0,.85);
  text-align:center;
  min-width: 1em;
  //font-weight:bold;
}

/*----------------검색창 스타일--------------*/
.green_window {

	width: 600px; height: 38px;
	background: white;
	margin:0px 0px 0px 10px;
}

.input_text {
	width: 1000px; height: 21px;
	margin: 6px 0 0 9px;
	border: 0;
	line-height: 21px;
	font-weight: bold;
	font-size: 16px;
	outline: none;
}

/* 사이드 메뉴 바 */
.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 999;
    top: 0;
    right: 0;
    background-color: #ffffff;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
	/*border-left: 3px solid #ADD8E6; */
}

.sidenav a {
    padding: 8px 8px 8px 28px;
    text-decoration: none;
    font-size: 25px;
    color: #ADD8E6;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #ADD8E6;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 200px;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
.side{
  display: grid;
  grid-template-columns: 110px 110px;
  grid-template-rows: 125px 125px;
  padding:5px 10px 5px 10px;
  margin:5px 10px 5px 10px;
}


/* 떠다니는 메뉴 (Floating Menu) */
 #floatdiv { 
    position:fixed; _position:absolute; _z-index:-1;
    width:170px;
    overflow:hidden;
    right:0px; //화면 왼쪽에 위치한다. right로 변경가능
    top:50px; //화면 위쪽과의 간격
    background-color: transparent;
    margin:0;
    padding:0;
}

#floatdiv ul  { list-style: none; }
#floatdiv li  { margin-bottom: 2px; text-align: center; }
#floatdiv a   { color: #5D5D5D; border: 0; text-decoration: none; display: block; }
#floatdiv a:hover, #floatdiv .menu  { background-color: #5D5D5D; color: #fff; }
#floatdiv .menu, #floatdiv .last    { margin-bottom: 0px; }


       #jb-container {
		height: auto;
		width: 1100px;
        padding: 20px;
		margin: auto;
		margin-top: 60px;
        border: 5px solid  #ADD8E6;
		border-bottom: 6px #ADD8E6;
		content: " ";
		
      }
     #jb-header {
	  	height: 300px;
        padding: 10px 10px 10px 10px;
        margin-bottom: 80px;
		border:1px solid #ADD8E6;
        /*border-bottom: 8px solid  #ADD8E6;*/
		/*border-right: 8px solid  #ADD8E6;*/
		/*border-left: 10px solid #ADD8E6;*/
      }
	  #jb-content {
        width: 1050px;
        padding: 20px;
        margin-bottom: 20px;
        float: left;
        border:1px solid #ADD8E6;
      }
      #jb-sidebar {
        width: 300px;
        padding: 20px;
        margin-bottom: 20px;
		margin:0px 12px 0px 0px;
        float: right;
        border:2px solid #ADD8E6;
      }
	  #jb-img {
        width: 400px;
        padding: 20px;
        margin-bottom: 20px;
        float: left;
        border: 1px solid #ADD8E6;
      }
      #jb-text {
        width: 550px;
		height: 275px;

		padding:5px 5px 5px 5px;	
		margin:3px 3px 3px 3px;
        margin-bottom: 20px;
        float: left;
        /*border: 1px solid #ADD8E6;*/
      }
	   #jb-map {
        width: 300px;
		height: 290px;
        padding: 20px 20px 20px 20px;
		margin:0px 12px 0px 0px;
        margin-bottom: 20px;
        float: right;
        border: 2px solid #ADD8E6;
		/*border-left: 8px solid  #ADD8E6;*/
		background-color:#ffffff;
      }
      #jb-footer {
        clear: both;
        padding: 20px;
        border: 1px solid #ADD8E6;
      }
      @media ( max-width: 480px ) {
        #jb-container {
          width: auto;
        }
		 #jb-header {
          width: auto;
        }
        #jb-content {
          float: none;
          width: auto;
        }
        #jb-sidebar {
          float: none;
          width: auto;
        }
		#jb-img {
          float: none;
          width: auto;
        }
        #jb-text {
          float: none;
          width: auto;
        }
		#jb-map {
		  float: none;
          width: auto;
		}
      }

a:link     {color:#000000;text-decoration:none} 
a:visited  {color:#007cd0;text-decoration:none} 
a:active   {color:#007cd0;text-decoration:none} 
a:hover    {color:#0099ff;text-decoration:none} 

.cf:before,
.cf:after {
    content: " "; /* 1 */
    display: table; /* 2 */
}
 
.cf:after {
    clear: both;
}

</style>
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

	</head>

<body>      
  <!-- 전체를 감싸는 div -->
  <div class="d-flex" id="wrapper" style="overflow: auto;">      

	<!-- Sidebar -->
	<div class="bg-light border-right" id="sidebar-wrapper" style="">
      <div class="sidebar-heading" style=""><font color="white">HomeDocssssssssssssss</font></div>
      <div class="list-group list-group-flush" style="position: fixed;">
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px">수리견적</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;">업체검색</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;">하우징 서비스</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;">고객센터</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;">Contact</a>
      </div>
    </div>
	
    <!-- Page Content -->
    <div id="page-content-wrapper">

      <!-- 네비게이션 바 -->
	  <nav class="navbar navbar-expand-lg fixed-top navbar-light bg-light " style="margin-bottom: 80px; background: white; height: 37pt;">

	  <!-- 로고 -->
		<!-- 메뉴 모양 -->
		<div style="margin: 0px 10px 0px 10px;">   
		  <span style="color: gray; cursor:pointer;" ><i class="fas fa-bars fa-lg"  id="menu-toggle"></i></span>
        </div>
    
	  <!-- 홈 모양 / 로고 -->
		<div class="container" style="width:100px;">
	      <span style="color:limegreen"><i class="fas fa-house-damage fa-lg"></i></span>
		  <div style="margin: 8px 0px 0px 10px;">
			<a class="navbar-brand" href="#"><h6>HomeDoc</h6></a>
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
				data-content="<a href='xyz.com'>~게시물의 새 댓글이 달렸습니다!</a>
				<hr>
				<a href='xyz.com'>~게시물의 새 댓글이 달렸습니다!</a>
				"
				data-html="true" data-placement="bottom"
				style="border:0px; background-color:#F8F9FA"><i class="fas fa-bell fa-lg" style="cursor:pointer"></i></button></span>
			
			
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
	  
	  <tiles:insertAttribute name="content"/>
	
	  <!-- @@@@@@@@@@@@@@@@내용은 여기까지@@@@@@@@@@@@@@@@@ -->

	<!-- Page Content 끝 -->
	</div>
  <!-- 전체를 감싸는 div 끝 -->
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

<script>
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