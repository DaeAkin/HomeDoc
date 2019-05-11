<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../resources/se2/js/service/HuskyEZCreator.js" charset="utf-8"></script>
<div id="jb-container" style="height:1050px;">
  <div id="jb-header" style="margin:0px 0px 20px 0px;">
	<div id="jb-text" style="">
	  <h3><b>주의사항</b></h3><hr>
	  <font color="gray"><p>니집 내집 우리집을 위한 전문가가 모두 여기 모여있다 이거야...</p>무엇이든 물어봐라 모르는거 빼고 다 알려준다.<br>어느새 집안 곳곳의 인테리어를 펌리빙 제품과 함께하고 있는 모습을 발견하게 됩니다.</font>
	</div>
  </div>

<!-- div#jb-content -->
  <div id="jb-content">


	<h3><b>상세 내용</b></h3><hr>

	


	<form action="<%=request.getContextPath() %>/board/boardwrite" method="post" id="frm" name="frm" method="POST" >
		<input type="hidden" name="thumbnail" value=""/>
	  <table class="table table-bordered">
		<tr>
		  <th>제목</th>
          <td>  <input type="text" name="title" class="form-control" id="title" placeholder="제목을 입력하세요"></td>
		</tr>
		<tr>
		  <th>내용</th>
		  <td>
			<textarea name="content" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
		  </td>
		</tr>
			<!-- <input type="button" id="savebutton" value="서버전송" />-->
		<tr>
		  <!-- th>첨부파일: </th>
         
          <td><input type="file" id="ajaxUpload" placeholder="파일을 선택하세요. " name="filename" class="form-control"/></td> -->
	 	<th>첨부파일 : </th>
	 <td><input  type="file"  id="uploadFile" name="uploadFile" accept="image/*"/>
                  </td>
		</tr>
		<tr>
		  <th>태그: </th>
          <td>
		  <div class="form-group">
			<select>
	        <!-- Notice the HTML5 data attributes -->
			  <option value="0" selected="selected" data-skip="1">클릭해서 업체를 선택해주세요.</option>
			  <option value="1" data-icon="" data-html-text="전체">전체</option>
			  <option value="2" data-icon="img/brand1.jpg" data-html-text="펌 리빙">펌 리빙</option>
	          <option value="3" data-icon="img/brand2.jpg" data-html-text="현대리바트">현대리바트</option>
	          <option value="4" data-icon="img/brand3.jpg" data-html-text="집공">집공</option>
	          <option value="5" data-icon="img/brand4.jpg" data-html-text="떼시스">떼시스</option>
			</select>
		  </div>
		  </td>
		</tr>
		<tr>
		  <td colspan="2">
			<button type="button" class="btn btn-outline-dark" style="border: 1px solid #ADD8E6;" value="뒤로가기" onClick="history.back();" align="left"><font color="#ADD8E6">뒤로가기</button></font>
			&nbsp;&nbsp;&nbsp;
			<span style=" text-align: right; align:right"><a class="btn btn-primary" type="reset" style="color:white; background-color: lightblue; border: 1px solid #ADD8E6; text-align: center;" align="right"> reset </a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" class="btn btn-primary" value="등록" role="button" style="color:white; background-color: lightblue; border: 1px solid #ADD8E6;">등록 </input>
			<input type="button" id="savebutton" value="등록"/>
					</span>
              <!-- <a class="btn btn-default" onclick="sendData()"> 등록 </a>
              <a class="btn btn-default" type="reset"> reset </a>
              <a class="btn btn-default" onclick="javascript:location.href='list.jsp'">글 목록으로...</a> -->
          </td>
		</tr>
	  </table>
	</form>

	<!-- div#jb-content end -->
  </div>	   

<!-- 하단 버튼 -->
		&nbsp;&nbsp;&nbsp;&nbsp;

<!-- div#jb-container end -->
</div>

<script>
var filestart = 1;
$(document).ready(function() {
				var oEditors = [];
				var sLang = "ko_KR"; // 언어 (ko_KR/ en_US/ ja_JP/ zh_CN/ zh_TW), default = ko_KR
				// 추가 글꼴 목록
				//var aAdditionalFontSet = [["MS UI Gothic", "MS UI Gothic"], ["Comic Sans MS", "Comic Sans MS"],["TEST","TEST"]];
				//Editor Setting
				nhn.husky.EZCreator
						.createInIFrame({
							oAppRef : oEditors,
							elPlaceHolder : "smarteditor", // 에디터가 그려질 textarea ID 값 과 동일해야 함.
							sSkinURI : "../resources/se2/SmartEditor2Skin.html", //Editor HTML
							htParams : {
								bUseToolbar : true, // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
								bUseVerticalResizer : true, // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
								bUseModeChanger : true, // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
								//bSkipXssFilter : true,		// client-side xss filter 무시 여부 (true:사용하지 않음 / 그외:사용)
								//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
								fOnBeforeUnload : function() {
									//alert("완료!");
								},
								I18N_LOCALE : sLang
							}, //boolean
							fOnAppLoad : function() {
								//예제 코드
								//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
							},
							fCreator : "createSEditor2"
						});
				function pasteHTML() {
					var sHTML = "<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\/span>";
					oEditors.getById["smarteditor"].exec("PASTE_HTML",
							[ sHTML ]);
				}
				function showHTML() {
					var sHTML = oEditors.getById["smarteditor"].getIR();
					alert(sHTML);
				}
				function submitContents(elClickedObj) {
					oEditors.getById["smarteditor"].exec(
							"UPDATE_CONTENTS_FIELD", []); // 에디터의 내용이 textarea에 적용됩니다.
					// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.
					try {
						elClickedObj.form.submit();
					} catch (e) {
					}
				}
				function setDefaultFont() {
					var sDefaultFont = '궁서';
					var nFontSize = 24;
					oEditors.getById["smarteditor"].setDefaultFont(
							sDefaultFont, nFontSize);
				}
				
				//전송버튼 클릭 이벤트
				$("#savebutton").click(function() {
					//if(confirm("저장하시겠습니까?")) {
						//id가 smarteditor인 textarea에 에디터에서 대입
						oEditors.getById["smarteditor"].exec("UPDATE_CONTENTS_FIELD", []);
						
						//이 부분에 에디터 validation 검증
						
							$("#frm").submit();
						
					}
					
				)
				
				//텍스트 에리아 확인
				$("#refresh").click(function() {
					oEditors.getById["smarteditor"].exec("PASTE_HTML", ["hihihihihihi"]);
					
					})
				
				
				
				//파일 추가 버튼
				$("#uploadbutton").click(function() {
					
					filestart++;
					$('<div><input type="file" name="uploadFile'+filestart+'" accept="image/*" /></div>').insertBefore(this);
					
					
				
				})
                //파일업로드 ajax 
                $("#uploadFile").on("change",function(event) {
                    event.preventDefault();
                    
  					 var formData = new FormData();
                    formData.append("file",$("#uploadFile")[0].files[0]); 
                    
          /*  		var form = document.forms[0];
                var formData = new FormData(form); */ 
                    
                    
                    $.ajax({
                        
                        type            :       "post",
                        url             :       "<%=request.getContextPath()%>/upload/image",
                        data            :       formData,
               
                        enctype 		: 		'multipart/form-data',
                      processData     :       false,
                        contentType     :       false, 
                        success         :       function(data) {
                            
                        
                        alert("성공!");
                       alert("썸네일 :"+  data.makeThumbnail);
                   
                        var str = "";
                        var textstr = "";
                        
                        str = "<div><a href='<%=request.getContextPath()%>/image/displayFile?fileName="+data.originalFile+"'>";
                        str += "<img src='<%=request.getContextPath()%>/image/displayFile?fileName="+data.makeThumbnail+"'></a></div>";
                        textstr = "<div><a href='<%=request.getContextPath()%>/image/displayFile?fileName="+data.originalFile+"'>";
                        textstr += "<img style='max-width:100%; height:auto'src='<%=request.getContextPath()%>/image/displayFile?fileName="+data.boardInsertImage+"'/></a>";
                    
                        $("input[type=hidden][name=thumbnail]").val(data.makeThumbnail);
                        
                            
                        /* $(".uploadList").append(str); */
                        oEditors.getById["smarteditor"].exec("PASTE_HTML", [textstr]);
                        },
                        
                        error			:		function(request,status,error) {
                        	alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

                        	
                        
                        }
                        
                        
                    })
                    
                    
                });
				
		
			
				
			});
//필수값 Check
function validation() {
var contents = $.trim(oEditors[0].getContents());
if(contents === '<p>&bnsp;<p>' || contents === '') { //기본적으로 아무것도 입력하지 않아도 값이 입력되어 있음.
	alert("내용을 입력하세요.");
	oEditors.getById['smarteditor'].exec('FOCUS');
	return false;
	
}
return true;
}

//전송버튼 클릭 이벤트
$("#savebutton").click(function() {
	if(confirm("저장하시겠습니까?")) {
		//id가 smarteditor인 textarea에 에디터에서 대입
		oEditors.getById["smarteditor"].exec("UPDATE_CONTENTS_FIELD", []);
		
		//이 부분에 에디터 validation 검증
		
			$("#frm").submit();
	}
}
	
)
	
	
</script>
