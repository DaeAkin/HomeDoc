<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%
	String resourceUri = request.getContextPath() + "/resources/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 슬라이드 포토 -->
<div id="carouselExampleControls" class="carousel slide" data-ride="carousel" style="margin-top:50px;">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="<%=resourceUri %>img/banner_1.jpg" alt="첫번째 슬라이드" id="index_slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/banner_2.jpg" alt="두번째 슬라이드" id="index_slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/banner_3.jpg" alt="세번째 슬라이드" id="index_slide">
    </div>
	<div class="carousel-item">
      <img class="d-block w-100" src="<%=resourceUri %>img/banner_4.jpg" alt="세번째 슬라이드"  id="index_slide">
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

<!-- 슬라이드 밑 배너 -->
<div class="banner">
</div>
<!-- 전체 div -->
<div id="jb-container">
<!-- 그리드를 감싸는 div -->
  <div id="container-re">
	<br>
	<h3>실내 인테리어</h3><br>
  <!-- 그리드 div -->
	<div class="index_tag">
	<c:forEach var="boardDto1" items="${boardDto1}" varStatus="status">
	  <div class="card" style="width: 13rem;  cursor: pointer;" onclick="location.href='/comso/jiseong/request.html';">
	    <img class="card-img-top" src="<%=request.getContextPath()%>/image/displayFile?fileName=${boardDto1.thumbnail }" id="index_image" alt="Card image cap">
		<div class="card-body">
		  <h6 class="card-title"><b>${boardDto1.title}</b>
            <br>
            <small>${boardDto1.datetime}</small>
		  </h6>
	 	          
		</div>
	  </div>
	</c:forEach>
           
	<!-- div.index_tag end-->
	</div>
	<br>

	<!-- pagination start
	<nav aria-label="...">
	  <ul class="pagination pagination  justify-content-center">
	    <li class="page-item disabled">
	      <a class="page-link" href="#" tabindex="1">이전</a>
	    </li>
	    <li class="page-item"><a class="page-link" href="#">1</a></li>
	    <li class="page-item"><a class="page-link" href="#">2</a></li>
	    <li class="page-item"><a class="page-link" href="#">3</a></li>
	    <li class="page-item">
	      <a class="page-link" href="#">다음</a>
	    </li>
	  </ul>
	</nav>
	pagination end -->

<!-- div.container-re end -->
  </div>
         
  <!-- 가전제품 / 가구 -->
  <div id="container-re">
	<br>
	<h3>가전제품 / 가구</h3><br>
  <!-- 그리드 div -->
	<div class="index_tag">
	
	  <div class="card" style="width: 13rem;  cursor: pointer;" onclick="location.href='/comso/jiseong/request.html';">
	    <img class="card-img-top" src="img/map.jpg" id="index_image" alt="Card image cap">
		<div class="card-body">
		  <h6 class="card-title"><b>전등이 고장났어요!</b>
            <br>
            <small>2019-03-21</small>
		  </h6>
	 	  <p class="card-text">오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p>        
		</div>
	  </div>
       
	<!-- div.index_tag end-->
	</div>
	<br>

	<!-- pagination start   
	<nav aria-label="...">
	  <ul class="pagination pagination  justify-content-center">
	    <li class="page-item disabled">
	      <a class="page-link" href="#" tabindex="1">이전</a>
	    </li>
	    <li class="page-item"><a class="page-link" href="#">1</a></li>
	    <li class="page-item"><a class="page-link" href="#">2</a></li>
	    <li class="page-item"><a class="page-link" href="#">3</a></li>
	    <li class="page-item">
	      <a class="page-link" href="#">다음</a>
	    </li>
	  </ul>
	</nav>
	<!-- pagination end -->

  <!-- div.container-re end -->
  </div>

  <!-- 서비스 후기-->
  <div id="container-re">
	<br>
	<h3>서비스 후기</h3><br>
  <!-- 그리드 div -->
	<div class="index_review">
	  <div class="card" style="width: 28rem; height:29rem; cursor: pointer;" onclick="location.href='/comso/jiseong/request.html';">
	    <img class="card-img-top" src="img/map.jpg" id="index_r_image" alt="Card image cap">
		<div class="card-body">
		  <h6 class="card-title"><b>전등이 고장났어요!</b>
            <br>
            <small>2019-03-21</small>
		  </h6>
	 	  <p class="card-text">오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p>        
		</div>
	  </div>
                  
	  <div class="card" style="width: 28rem; height:29rem; cursor: pointer;" onclick="location.href='/comso/jiseong/request.html';">
	    <img class="card-img-top" src="img/index_image_1.jpg" id="index_r_image" alt="Card image cap">
		<div class="card-body">
		  <h6 class="card-title"><b>전등이 고장났어요!</b>
            <br>
            <small>2019-03-21</small>
		  </h6>
	 	  <p class="card-text">오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p>        
		</div>
	  </div>
                
                
	  <div class="card" style="width: 28rem; height:29rem; cursor: pointer;" onclick="location.href='/comso/jiseong/request.html';">
	    <img class="card-img-top" src="<%=resourceUri %>img/index_image_1.jpg" id="index_r_image" alt="Card image cap">
		<div class="card-body">
		  <h6 class="card-title"><b>전등이 고장났어요!</b>
            <br>
            <small>2019-03-21</small>
		  </h6>
	 	  <p class="card-text">오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p>        
		</div>
	  </div>
                            
	<!-- div.index_tag end-->
	</div>
	<br>

  <!-- div.container-re end -->
  </div>

  <!-- 인기있는 검색어 -->
  <div id="container-ser">
	<br>
	<h3>인기있는 검색어</h3><br>
  <!-- 그리드 div -->
	<div class="inner flex flex-3">
					<div class="flex-item left">
						<div><a href="">
							<h3>하우징 서비스</h3>
							<p>누르면 해당 단어를 넣은채로<br />검색이 된 결과창을 띄웁니다.</p>
						</a></div>
						<br><br><br><br><br><br><br><br><br><br>
						<div><a href="">
							<h3>오래된 가구</h3>
							<p>누르면 해당 단어를 넣은채로<br /> 검색이 된 결과창을 띄웁니다.</p>
						</a></div>
					</div>
					<div class="flex-item image fit round">
						<img src="<%=resourceUri %>img/pic01.jpg" alt="" />
					</div>
					<div class="flex-item right">
						<div><a href="">
							<h3>인테리어</h3>
							<p>누르면 해당 단어를 넣은채로<br /> 검색이 된 결과창을 띄웁니다.</p>
						</a></div>
						<br><br><br><br><br><br><br><br><br><br>
						<div><a href="">
							<h3>홈닥터</h3>
							<p>누르면 해당 단어를 넣은채로<br /> 검색이 된 결과창을 띄웁니다.</p>
						</a></div>
					</div>
				</div>
	<br>

  <!-- div.container-re end -->
  </div>

<!-- 인기있는 홈닥터 -->
  <div id="container-tag">
	<br>
	<h3>인기있는 홈닥터</h3><br>
  <!-- 그리드 div -->
	<div class="index_review">
	  <div class="flex flex-2">
		<div class="col col1">
		  <div class="image round fit">
			<a href="generic.html" class="link"><img src="<%=resourceUri %>img/pic01.jpg" alt="" /></a>
		  </div>
		</div>
		<div class="col col2">
		  <h3>HomeDoctor</h3>
		  <p>위치, </p>
		  해당하는 업체의 자기소개를 곁들입니다. 더도말고 덜도말고 세줄~네줄 분량이면 충분합니다.	</p>
		  <a href="#"> <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">자세히</button></a>
		</div>
	  </div>    


	  <div class="flex flex-2">
		<div class="col col1">
		  <div class="image round fit">
			<a href="generic.html" class="link"><img src="<%=resourceUri %>img/pic01.jpg" alt="" /></a>
		  </div>
		</div>
		<div class="col col2">
		  <h3>HomeDoctor</h3>
		  <p>위치, </p>
		  해당하는 업체의 자기소개를 곁들입니다. 더도말고 덜도말고 세줄~네줄 분량이면 충분합니다.	</p>
		  <a href="#"> <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">자세히</button></a>
		</div>
	  </div>    


	  <div class="flex flex-2">
		<div class="col col1">
		  <div class="image round fit">
			<a href="generic.html" class="link"><img src="<%=resourceUri %>img/pic01.jpg" alt="" /></a>
		  </div>
		</div>
		<div class="col col2">
		  <h3>HomeDoctor</h3>
		  <p>위치, </p>
		  해당하는 업체의 자기소개를 곁들입니다. 더도말고 덜도말고 세줄~네줄 분량이면 충분합니다.	</p>
		  <a href="#"> <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">자세히</button></a>
		</div>
	  </div>    
	<!-- div.index_tag end-->
	</div>
	<br>

	<!-- pagination start   
	<nav aria-label="...">
	  <ul class="pagination pagination  justify-content-center">
	    <li class="page-item disabled">
	      <a class="page-link" href="#" tabindex="1">이전</a>
	    </li>
	    <li class="page-item"><a class="page-link" href="#">1</a></li>
	    <li class="page-item"><a class="page-link" href="#">2</a></li>
	    <li class="page-item"><a class="page-link" href="#">3</a></li>
	    <li class="page-item">
	      <a class="page-link" href="#">다음</a>
	    </li>
	  </ul>
	</nav>
	<!-- pagination end -->

  <!-- div.container-re end -->
  </div>


<!-- div#jb-container end -->
</div>



 

</body>
</html>