<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div id="container">
		<center>
            <br>
			<br>
			<br>
			<br>
            <h3>	
			<img src="img/search_info_box.gif" alt="My Image"><br><br>
			<form method="post" action="<%=request.getContextPath() %>/member/myPage">
			비밀번호 확인 : <input type="password" name="pw" size="20">	
			<input type="submit" name="btn1" value="확인?">
			</form>

			</h3><hr>         
		
            <br>
            <br>
            </div>

</body>
</html>