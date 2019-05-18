<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
  <head>
    <title>비밀번호 찾기 : HomeDoc</title>
    <!-- meta tags 필요 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  </head>
  <body>
      <div class="container" style="width: 511px;">
    <form action="/comso/jiseong" onsubmit="return validate();"  data-ajax="false" method="post">
        <div style="margin: 20px 0px 0px 0px;">
            <div style="text-align: center;">
        <a href="/comso/jiseong" style="font-size: 55px; color: black; text-decoration:none;"><b>HomeDoc</b></a>
            </div>
        <br>
  <div class="form-group">
      <p><input type="text" class="form-control" id="id" aria-describedby="id" placeholder="아이디">
          <small id="idHelp" class="form-text text-muted">HomeDoc에 등록했던 아이디를 입력하세요.</small></p>
      
      
    <p><input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="이메일">
    <small id="emailHelp" class="form-text text-muted">비밀번호를 잊으셨습니까? 이메일을 통해 비밀번호를 찾으십시오.</small></p>
  </div>
  <button type="submit" class="btn btn-info" style="width: 482px;">메일 보내기</button>
        </div>
</form>
      </div>
      
      
      

    <!-- Optional JavaScript -->
    <!-- 먼저 jQuery가 오고 그 다음 Popper.js 그 다음 Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
      
      
      <script>
          function validate() {
              
        var id = document.getElementById("id");
            
        if(id.value=="") {
           alert("아이디를 입력해 주세요.");
           id.focus();
           return false;
       }
              
              
      var email = document.getElementById("email");
         
         
       if(email.value=="") {
           alert("이메일을 입력해 주세요.");
           email.focus();
           return false;
       }

              
              alert("메일을 성공적으로 보냈습니다.");
          }
      
      </script>
      
      
  </body>
</html>