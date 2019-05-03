<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="jb-container">
  <div id="jb-header">
	<img src="img/LED.jpg" alt="Sample Image" style="height:275px; float: left; margin:3px 3px 3px 3px;">
	<div id="jb-text" style="">
	  <h3><b>전등이 고장났어요!</b></h3><hr>
	  <p>오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p><br>
	  <h3><b>[최저가 가격 표시]</b></h3><hr>
	  <font color="gray">[판매자의 간단한 이유 입력란]<br>전구교체만 하면 해결될 문제로 보입니다.</font>
	</div>
	<div id="jb-map" style="maring-right:0px; padding-top:230px; border:none; text-align:right;">
          <img src="img/user.png" style="width:30px;"><b>  volde***</b></img><br>
          작성일자 : 2019/03/13
		</div>
  </div>

  <div id="jb-content-re">
	<h3><b>상세 내용</b></h3><hr>
	<img src="img/LED_detail_1.jpg" class="media-object" alt="Sample Image" height="300"><br>
	질문자가 올린 게시글 내용이 들어가면 됩니다.<br>니가죽나 내가죽나 해보자
	<div id="111">시발</div>
	<div class="111">개시발</div>
	<img src="img/LED_detail_2.jpg" class="media-object" alt="Sample Image" height="300"><br>
	질문자가 올린 게시글 내용이 들어가면 됩니다.<br>
	<img src="img/LED_detail_3.jpg" class="media-object" alt="Sample Image" height="300"><br>
	질문자가 올린 게시글 내용이 들어가면 됩니다.
	<Br><br><br><br>
  </div>

  <div id="jb-map" style="">
	<h2><b>고객 위치</b></h2>
	<img src="img/map.jpg" style="width:260px; height:200px;"></img>
  </div>

  <!-- 우측 관련 게시글 -->
  <div id="jb-sidebar">
	<h2><B>관련 게시글</b></h2>
    <ul>
      <li>
		<!----게시글 1----->
		<a href="#" class="pull-left">
		<div class="col-xs-12 col-md-7.5">전구가 이상해요   
		  <img src="img/LED_side1.jpg" class="media-object" alt="Sample Image" width="200" height="150">  
		  <div class="media-body">
			<h1 class="media-heading"></h1>
			<h4><b>[가격표시]₩60,000</b></h4>
		  </div>			
		</div>
		</a>
	  </li>
	  <hr>
	  <!----게시글1 끝---->
      <li>

		  <!----게시글 2----->
		  <a href="#" class="pull-left">
			<div class="col-xs-12 col-md-7.5">제 마음이 이상해요   
			  <img src="img/LED_side1.jpg" class="media-object" alt="Sample Image" width="200" height="150">  
		      <div class="media-body">
				<h1 class="media-heading"></h1>
				<h4><b>[가격표시]₩60,000</b></h4>
	          </div>			
			</div>
		  </a>
		  </li>
		  <hr>
		  <!----게시글2 끝---->
          <li>

		  <!----게시글 3----->
		  <a href="#" class="pull-left">
			<div class="col-xs-12 col-md-7.5">이상해씨    
			  <img src="img/LED_side1.jpg" class="media-object" alt="Sample Image" width="200" height="150">  
		      <div class="media-body">
				<h1 class="media-heading"></h1>
				<h4><b>[가격표시]₩60,000</b></h4>
	          </div>			
			</div>
		  </a>
		  </li>
		  <!----게시글3 끝---->
		  </li>
        </ul>
      </div>

<!-- 하단 업체별 수리 비용 비교 -->
	  <div id="jb-content-re" style="height:750px;  position: relative;">
	  <h3><b>업체별 수리 비용 비교</b></h3><hr>

<!-- 비교 1 -->
	  <div>	
		<a href="company_detail.html" class="pull-left" style="text-decoration:none;">
			<div id="compare">
				<div class="media">
					<img src="img/brand1.jpg" class="media-object" alt="Sample Image" width="200"  height="150">
					&nbsp;&nbsp;&nbsp;
			        <div class="media-body">
						<h1 class="media-heading"></h1>
			            <h3><b>[가격표시]₩50,000</b></h3>
			            <p>[자세한 견적 입력 / 누르면 해당 업체의 소개 페이지로 이동]출장ㄱㄱ 바로 갑니다~</p>
						[이거 이미지 업로드 할 때 크기제한을 둬서 올려야 통일이 될 듯]
					</div>
				</div>
			</div>
		</a>
		<div style="position: absolute; top: 100px; right: 90px;">
		  <button type="button" class="btn btn-primary"   style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;" data-toggle="modal" data-target="#reple_edit">수정</button>
		</div>
		<div style="position: absolute; top: 150px; right: 90px;">
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">삭제</font></button>
		</div>
	  </div>

<!-- 비교 2 -->
	  <div>
		<a href="#" class="pull-left" style="text-decoration:none;">
			<div id="compare">
				<div class="media">
					<img src="img/brand2.jpg" class="media-object" alt="Sample Image" width="200"  height="150">
					&nbsp;&nbsp;&nbsp;
			        <div class="media-body">
						<h1 class="media-heading"></h1>
			            <h3><b>₩50,000</b></h3>
			            <p>출장ㄱㄱ 바로 갑니다~</p>
					</div>
				</div>
			</div>
		</a>
		<div style="position: absolute; top: 290px; right: 90px;">
		  <button type="button" class="btn btn-primary"   style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;" data-toggle="modal" data-target="#reple_edit">수정</button>
		</div>
		<div style="position: absolute; top: 340px; right: 90px;">
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">삭제</font></button>
		</div>
	  </div>

<!-- 비교 3 -->
	  <div>
		<a href="#" class="pull-left" style="text-decoration:none;">
			<div id="compare">
				<div class="media">
					<img src="img/brand3.jpg" class="media-object" alt="Sample Image" width="200"  height="150">
					&nbsp;&nbsp;&nbsp;
			        <div class="media-body">
						<h1 class="media-heading"></h1>
			            <h3><b>₩50,000</b></h3>
			            <p>출장ㄱㄱ 바로 갑니다~</p>
					</div>
				</div>
			</div>
		</a>
		<div style="position: absolute; top: 480px; right: 90px;">
		  <button type="button" class="btn btn-primary"   style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;" data-toggle="modal" data-target="#reple_edit">수정</button>
		</div>
		<div style="position: absolute; top: 530px; right: 90px;">
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">삭제</font></button>
		</div>
	  </div>
<!-- pagination start -->
<div style="position: absolute; bottom: 50px; left: 400px;">
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
</div>
<!-- pagination end -->
		<div class="button_grid" style="display: grid;	grid-template-columns: 93px 6px 93px 6px 93px 6px 93px 18px 93px 6px 93px 6px 93px 6px 93px 6px 93px 6px 93px 6px;    grid-template-rows: 37px;
		position: absolute;
		bottom: 20px;
		left: 20px;">
		  <button type="button" class="btn btn-primary"   style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;" data-toggle="modal" data-target="#reple">견적 작성</button>
		  &nbsp

		  
		  <a href="/comso/jiseong/request_edit.html" style="">
		  <button type="button" class="btn btn-outline-dark"  style="width:93px; color:white; background-color: lightblue; border: 1px solid #ADD8E6;">수정</button></a>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">2 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">삭제 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">4 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">5 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">6 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">7 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">8 </button></font>
		  &nbsp
		  <button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();"><font color="#ADD8E6">뒤로가기</button></font>
		  &nbsp

		</div>



<!-- 하단 업체별 수리 비용 비교 끝 -->
	  </div>
	  


<div class="modal fade" id="reple" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">견적 댓글 달기</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <label for="recipient-name" class="form-control-label">가격</label>
            <input type="text" class="form-control" id="recipient-name">
          </div>
          <div class="form-group">
            <label for="message-text" class="form-control-label">간단 견적 내용</label>
            <textarea class="form-control" id="message-text"></textarea>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Send message</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="reple_edit" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">댓글 수정</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <label for="recipient-name" class="form-control-label">가격</label>
            <input type="text" class="form-control" id="recipient-name">
          </div>
          <div class="form-group">
            <label for="message-text" class="form-control-label">간단 견적 내용</label>
            <textarea class="form-control" id="message-text"></textarea>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Send message</button>
      </div>
    </div>
  </div>
</div>



</body>
</html>