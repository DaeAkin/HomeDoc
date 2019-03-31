<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
 <head>


  <title>게시판</title>
  
 </head>
 <body>
<div class="container">
 <table class="table table-st" id="hover_">
  <thead>
  <tr style="border-bottom: 5px solid #AEE8E6;">
    <th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>날짜</th>
	<th>조회수</th>
  </tr>
  </thead>
  <tbody>
  
  <c:forEach var="boardDtos" items="${boardDtos}" varStatus="status">
  <tr>
    <td>${boardDtos.no }</td>
	<td>${boardDtos.title }</td>
	<td>${boardDtos.writer }</td>
	<td>${boardDtos.datetime }</td>
	<td>${boardDtos.hit }</td>
  </tr>
  </c:forEach>
  </tbody>
  
</table>
<hr/>
 <a href="#"> <button type="button" class="btn btn-outline-info btn" style="border: solid; width: 60pt; height: 35pt;">글쓰기</button></a>
</div>


<div class="text-center">
<!-- pagination start -->
	<nav aria-label="...">
	  <ul class="pagination pagination  justify-content-center">
	    <li class="page-item disabled">
	      <a class="page-link" href="#" tabindex="1">이전</a>
	    </li>
	    
	     <fmt:parseNumber var = "startPage" type = "number" value = "${paginationDto.startPage}" />
	     <fmt:parseNumber var = "endPage" type = "number" value = "${paginationDto.endPage}" />
	      
	    <c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
	    <li class="page-item">
		    <a class="page-link" 
		    	href="<%=request.getContextPath()%>/board/selectAll?category=${category}&currentPage=${i}">
		    ${i}
	    </a>
	    </li>

	    </c:forEach>
	    <li class="page-item">
	      <a class="page-link" href="#">다음</a>
	    </li>
	  </ul>
	</nav>
	<!-- pagination end -->
</div>

 </body>
</html>
