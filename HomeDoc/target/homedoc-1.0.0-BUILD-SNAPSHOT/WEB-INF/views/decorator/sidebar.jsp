<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Side Bar -->
<html lang="ko">
  

<body>

  <!-- 전체를 감싸는 div -->
  <div class="d-flex" id="wrapper" style="">   
    <!-- Sidebar -->
	<div class="bg-light border-right" id="sidebar-wrapper" style="">
      <div class="sidebar-heading" style=""><font color="white">HomeDocssssssssssssss</font></div>
      <div class="list-group list-group-flush" style="position: fixed;">
		<a href="mypage1.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-user">&nbsp</i>마이 페이지</a>
        <a href="new_request.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-house-damage">&nbsp</i>수리견적</a>
        <a href="company_list.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-search">&nbsp&nbsp</i>업체검색</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fab fa-fort-awesome">&nbsp&nbsp</i>하우징 서비스</a>
        <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px;"><i class="fas fa-headphones-alt">&nbsp&nbsp</i>고객센터</a>
<!--    <a href="#" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fa fa-phone">&nbsp&nbsp&nbsp&nbsp</i>Contact</a> -->
        <a href="admin_door.html" class="list-group-item list-group-item-action bg-light" style="width:239px; border:none;"><i class="fas fa-user-cog">&nbsp</i>관리자모드(TEST)</a>
      </div>
    </div>

	<div id="page-content-wrapper">
	  <span style="color: gray; cursor:pointer;" ><i class="fas fa-bars fa-lg"  id="menu-toggle"></i></span>

	  <!-- 전체 div -->
	  <div id="jb-container">
		내용
	  </div>
	</div>
    <!-- /#page-content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>

</body>


</html>
