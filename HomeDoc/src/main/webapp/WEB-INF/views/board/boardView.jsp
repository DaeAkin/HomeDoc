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







<!-- 하단 업체별 수리 비용 비교 끝 -->
	  </div>
	  


<div class="modal fade" id="reple" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content"
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