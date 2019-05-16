<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
    <title>HomeDoc : 고객 등록</title>
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  </head>
  <body>
      
    <div class="container" style="width:450px;">
        <div style="margin: 20px 0px 0px 0px;">
            <div style="text-align: center;">
        <a href="/comso/jiseong" style="font-size: 55px; color: black; text-decoration:none;"><b>HomeDoc</b></a>
                <font color="gray"><b>고객등록</b></font>
                </div>
            <br>
    <form action="<%=request.getContextPath() %>/member/insert" onsubmit="return validate();" data-ajax="false" method="post" id="regfrm" name="regfrm">
        
        
<div class="form-row align-items-center">
    <div class="form-group col-md-9">
      <label for="inputId" class="col-form-label">아이디</label>
      <input id="id" class="form-control" name="id">
    </div>
    <div class="form-group col-md-3" style="margin: 0px 0px -20px 0px;">
        <button type="button" class="btn btn-info" style="width:96px; height: 38.5px;" id="idck">중복체크</button>
    </div>
        </div>

    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호</label>
      <input type="password" name="pw" class="form-control" id="pw">
    </div>
            

            
    <div class="form-group col-md-14">
      <label for="inputPassword" class="col-form-label">비밀번호 확인</label>
      <input type="password" class="form-control" id="checkpw">
    </div>
 <p id="pwsame" style="color:red;">

        
        
        <div class="form-group col-md-14">
      <label for="inputPhoneNum" class="col-form-label">전화번호</label>
      <input type="text" name="phone" class="form-control" id="phone" placeholder="-는 제외하고 입력해주세요.">
    </div>
<div class="form-row align-items-center">
        <div class="form-group col-md-5">
<label for="inputPhoneNum" class="col-form-label">집 주소</label>
 <input type="text" id="postcode" placeholder="우편번호" class="form-control" disabled>
        </div>
    <div class="form-group col-md-3" style="margin: 0px 0px -20px 0px;">
<input type="button" onclick="execDaumPostcode()" value="검색" class="btn btn-info" style="width:96px; height: 38.5px;">
    </div>
        </div>


<div class="form-group col-md-14">
<input type="text" id="address1" placeholder="주소" class="form-control" disabled>
        </div>
        
<div class="form-row align-items-center">
<div class="form-group col-md-8">
<input type="text" id="address2" placeholder="상세주소" class="form-control">
    </div>
<div class="form-group col-md-4">
<input type="text" id="address3" placeholder="참고항목" class="form-control" disabled>
    </div>
<input type="hidden" name="address" id="address" placeholder="참고항목" class="form-control" >
        </div>
     
  
<div class="form-row align-items-center">
    <div class="form-group col-md-9">
      <label for="inputEmail" class="col-form-label">이메일</label>
      <input id="email" class="form-control" name="email" aria-describedby="emailHelp">
    </div>
    <div class="form-group col-md-3" style="margin: 0px 0px -20px 0px;">

        
   
    
</div> 

            

            
            
        <div class="modal-footer"></div>
            <button type="submit" class="btn btn-dark" style="width: 420px; height:50px;">회원가입</button>
          
        
        </form>
        </div>
      </div>
      
    <!-- Optional JavaScript -->
    <!-- 먼저 jQuery가 오고 그 다음 Popper.js 그 다음 Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
      
      <script src="//code.jquery.com/jquery-3.3.1.js"></script>
      
      
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
      
<script>
    
    
    /* 회원가입 유효성체크 시작 */
     function validate() {
       var re = /^[a-zA-Z0-9]{4,12}$/ // 아이디와 패스워드가 적합한지 검사할 정규식
       var re2 = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
       // 이메일이 적합한지 검사할 정규식

        var id = document.getElementById("id");
        var pw1 = document.getElementById("pw");
        
         
         if(!check(re, id, "아이디는 4~12자의 영문 대소문자와 숫자로만 입력하세요.")) {
           return false;
       }

       if(!check(re, pw1, "비밀번호는 4~12자의 영문 대소문자와 숫자로만 입력하세요.")) {
           return false;
       }
        
        var pw = document.getElementById("pw").value;
        var pwck = document.getElementById("checkpw").value;

        if (pw != pwck) {
            
                document.getElementById('pwsame').innerHTML = '비밀번호가 틀렸습니다. 다시 입력해 주세요';
            
                return false;
            }
        
        
       
         
        var phonenum = $('#phone').val();

         var regPhone = /(01[0|1|6|9|7])(\d{3}|\d{4})(\d{4}$)/g;

         if(!regPhone.test(phonenum)){

          alert('잘못된 휴대폰 번호입니다.');

          $('#phone').focus();

          return false;    

         }
        
         $("#address").val(  $("#address1").val() +   $("#address2").val() );
     
         var address1 = document.getElementById("address1");
         var address2 = document.getElementById("address2");
         
         if(address1.value=="") {
             alert("주소를 입력해주세요");
             address1.focus();
             return false;
         }
         
         if(address2.value=="") {
             alert("상세주소를 입력해주세요");
             address2.focus();
             return false;
         }	
     
         var address = document.getElementById("address1") + document.getElementById("address2");
         
        
         
         
         var email = document.getElementById("email");
         
         
       if(email.value=="") {
           alert("이메일을 입력해 주세요");
           email.focus();
           return false;
       }

       if(!check(re2, email, "적합하지 않은 이메일 형식입니다.")) {
           return false;
       }
         
         

         var confirmnum = document.getElementById("confirmnum");
         
         if(confirmnum.value=="") {
             alert("인증을 완료해주세요");
             confirmnum.focus();
             return false;
         }
         
         
         
         
         
         
         
         
        
              if(confirm("회원가입을 하시겠습니까?")){
        if(idck==0){
            alert('아이디 중복체크를 해주세요');
            return false;
        }else{
        alert("회원가입을 축하합니다");
        $("#regfrm").submit();
        }
    }
   }
    
     function check(re, what, message) {
       if(re.test(what.value)) {
           return true;
       }
       alert(message);
       what.value = "";
       what.focus();
       //return false;
   }   
     /* 회원가입 유효성체크 끝 */
    
    
    
    
    /* 우편번호 API 시작 */
       function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ',' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = '(' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("address3").value = extraAddr;
                
                } else {
                    document.getElementById("address3").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("address1").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("address2").focus();
            }
        }).open();
    }
    /* 우편번호 API 끝 */
    
    
    /* 아이디 중복체크 시작 (ajax) */
    
    //아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
var idck = 0;
$(function() {
    //idck 버튼을 클릭했을 때 
    $("#idck").click(function() {
        
        //userid 를 param.
            	var objParams = {
         			id			:	$("#id").val()
         	};
     
        
        $.ajax({
            async: true,
            type : 'POST',
            data : objParams,
            url : "<%=request.getContextPath()%>/member/idCheck",
            dataType : "json",
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            success : function(data) {
                if (data.cnt > 0) {
                    
                    alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
                    //아이디가 존재할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-error")
                    $("#divInputId").removeClass("has-success")
                    $("#id").focus();
                    
                
                } else {
                    alert("사용가능한 아이디입니다.");
                    //아이디가 존재할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#pw").focus();
                    //아이디가 중복하지 않으면  idck = 1 
                    idck = 1;
                    
                }
                
                
            },
            error : function(error) {
                
                alert("error : " + error);
            }
        });
    });
    
    /* id text 값 바꼈을때 idck 1 시작 */
    
                $("#id").change(function(){

                    idck = 1;
                });
    
    /* id text 값 바꼈을때 idck 1 끝 */
});
    
    /* 아이디 중복체크 끝 */
    
    
    
    
    
    /* 이메일 인증번호 보내기 */
    
    var emailck = 0;
    $(function() {
    //emailck(인증) 버튼을 클릭했을 때 
    $("#emailck").click(function() {
        
    	var objParams = {
    		email :  $("#email").val()
     	};
        //email을 param.
        
        
        $.ajax({
        	async : true,
            type : "post",
            data : objParams,
            url : "<%=request.getContextPath()%>/authenMail",
          
            dataType : "text",
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            success : function() {
       			alert("성공");
            },
            error : function(request,status,error) {
                
                alert("code = "+ request.status + " message = " + request.responseText + " error = " + error);
            }
        });
    });
        /* email text 값 바꼈을때 emailck 1 시작 */
    
                $("#email").change(function(){

                    emailck = 1;
                });
    
    /* email text 값 바꼈을때 emailck 1 끝 */
});
    
    
    /* 이메일 인증번호 보내기 끝 */
    
    
    
    
      /* 이메일 인증번호 보내기 */
    
    var confirmnumck = 0;
    $(function() {
    $("#confirmnumck").click(function() {
        
    	var objParams = {
    			confirmnum : $("#confirmnum").val()
     	};
        
        
        $.ajax({
            async: true,
            type : 'POST',
            data : objParams,
			 url : "<%=request.getContextPath()%>/authenConfirm",
            dataType : "json",
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            success : function(data) {
           
                if (data.validation == false) {
                    alert("인증번호가 일치하지 않습니다.");
                    $("#divInputConfirmnumber").addClass("has-error")
                    $("#divInputConfirmnumber").removeClass("has-success")
                    $("#confirmnum").focus();
                    
                
                } else {
                	alert("인증번호가 확인되었습니다.")
                    $("#divInputConfirmnumber").addClass("has-success")
                    $("#divInputConfirmnumber").removeClass("has-error")
                    $("#confirmnum").focus();
                    confirmnumck = 1;
                    
                }
                
                
            },
            error : function(request,status,error) {
                
            	 alert("code = "+ request.status + " message = " + request.responseText + " error = " + error);
            }
        });
    });
    
     $("#confirmnum").change(function(){

        confirmnumck = 1;
                    
     });
});
    
    
    /*  인증번호 체크 끝 */
    
    
    
    
    
    /* 인증 눌렀을 때 disabled 사라지게하기 */
    
    function confirmnumEnabled()

        {

            $('#confirmnum').removeAttr("disabled");

        }
    
    /* 인증 눌렀을 때 disabled 사라지게하기 끝 */
    
    
    
</script>
  </body>
</html>