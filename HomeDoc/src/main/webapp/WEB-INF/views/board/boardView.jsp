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
	<img src="<%=request.getContextPath()%>/image/displayFile?fileName=${boardDto.thumbnail}" alt="Sample Image" style="height:275px; float: left; margin:3px 3px 3px 3px;">
	<div id="jb-text" style="">
	  <h3><b>${boardDto.title }</b></h3><hr>
	  <!-- <p>오늘 아침에 일어났는데 전등이 나갔습니다. 전등을 고치려면 얼마정도 드나요</p><br> -->
	 
	  
	</div>
	<div id="jb-map" style="maring-right:0px; padding-top:230px; border:none; text-align:right;">
          <img src="img/user.png" style="width:30px;"><b>${boardDto.writer }</b></img><br>
          작성일자 : ${boardDto.datetime }
		</div>
  </div>

  <div id="jb-content-re">
	${boardDto.content}
  </div>
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
<!-- 하단 업체별 수리 비용 비교 끝 -->
	  </div>
	  

<div id="jb-content-re" style="height:750px;  position: relative;">
	  <div>	
		<div  class="pull-left" style="text-decoration:none;">
			<div id="compare">
				<div class="media">
					<img src="img/brand1.jpg" class="media-object" alt="Sample Image" width="200"  height="150">
					&nbsp;&nbsp;&nbsp;
			        <div class="media-body">
						<h1 class="media-heading"></h1>
			            <h3>가격 :<input type="text" /></h3>
			            <textarea  id="content" rows="20" cols="120"></textarea>
			
					</div>
				</div>
			</div>
		</div>
		<div style="position: absolute; top: 100px; right: 90px;">
		  <button type="button" class="btn btn-primary" id="replysubmit"   style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;" data-toggle="modal" data-target="#reple_edit">댓글달기</button>
		</div>

	  </div>
</div>

<input type="hidden" id="no" value="${boardDto.no }"/>
<input type="hidden" id="writer" value="${boardDto.writer }"/>

<script>
$(document).ready(function() {
	
	 $("#replysubmit").on("click",function(event) {
         event.preventDefault();
         var data =  {
        		board_no	:	$("#no").val(),
        		board_writer	:	$("#writer").val(),
        	 	content : 	$("#content").val()
        	 	
        	 
         };
         
         $.ajax({
             
             type            :       "POST",
             url             :       "<%=request.getContextPath()%>/reply/replyInsert",
             dataType		: "json",	
             data            :       JSON.stringify(data),
         	  processData     :       false,
             contentType     :       'application/json',
             success         :       function(data) {
                 
             
             alert("성공!");
  
            
             },
             
             error			:		function(request,status,error) {
            	alert("에러 발생!")
             	alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

             }
             
             
         })
         
         
     });
});

</script>
</body>
</html>