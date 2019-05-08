<%@page import="com.www.homedoc.dto.PaginationDto"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 전체 div -->
<div id="jb-container">
	<h3>간편견적 목록</h3><br>
 <table class="table" id="hover_">
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
	<td><a href="<%=request.getContextPath() %>/board/view?no=${boardDtos.no }">${boardDtos.title }</a></td>
	<td>${boardDtos.writer }</td>
	<td>${boardDtos.datetime }</td>
	<td>${boardDtos.hit }</td>
  </tr>
   </c:forEach>
  </tbody>
</table>
<hr/>


	<!-- pagination start -->
<nav aria-label="...">
	  <ul class="pagination pagination  justify-content-center">


			<c:choose>
				<c:when test="${paginationDto.prevPage == 0}">
     	   <li class="page-item disabled"> 
       			 </c:when>
				<c:otherwise>
        <li class="page-item ">
         </c:otherwise>
			</c:choose>

	      <a class="page-link" href="<%=request.getContextPath()%>/board/selectAllBoard?currentPage=${paginationDto.prevPage}">이전</a>
	      <%-- <a class="page-link" href="<%=request.getContextPath()%>/board/selectAllBoard?currentPage=${paginationDto.prevPage}" tabindex="1">이전</a> --%>
	    </li>
	    
	    
	     <fmt:parseNumber var = "startPage" type = "number" value = "${paginationDto.startPage}" />
	     <fmt:parseNumber var = "endPage" type = "number" value = "${paginationDto.endPage}" />
	     
	     	 <c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
	    <li class="page-item">
		    <a class="page-link" 
		    	href="<%=request.getContextPath()%>/board/selectAllBoard?currentPage=${i}">
		    ${i}
	    </a>
	    </li>

	    </c:forEach>
	 <%  PaginationDto paginationDto = (PaginationDto)request.getAttribute("paginationDto"); %>
		<% if(paginationDto.getNextPage() == paginationDto.getLastPage() + 1) { %>
	
     	   <li class="page-item disabled"> 
       			<%} else { %>
        <li class="page-item ">
        <%} %>
        
	
	      <a class="page-link" href="<%=request.getContextPath()%>/board/selectAllBoard?currentPage=${paginationDto.nextPage}">다음</a>
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