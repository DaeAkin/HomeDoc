<%@page import="com.www.homedoc.dto.PaginationDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<!-- Custom styles for this template -->
	<link href="<%=request.getContextPath() %>/resources/css/simple-sidebar.css" rel="stylesheet">

	<!-- Basic css -->
	<link href="<%=request.getContextPath() %>/resources/css/basic_js.css" rel="stylesheet">
	<!--<link href="css/main.css" rel="stylesheet">-->

	<!-- icon css -->
	<link href="<%=request.getContextPath() %>/resources/css/font-awesome.min.css" rel="stylesheet">
	
	
	</head>

<body>

<!-- 전체 div -->
<div id="jb-container">

<!-- 그리드를 감싸는 div -->




<div class="conatainer-re">

<c:forEach var="boardDtos" items="${boardDtos}" varStatus="status">



	
	
	<div id="post_1">
	  <div class="card border-light" id="card_1" onclick="location.href='<%=request.getContextPath()%>/board/view?no=${boardDtos.no }';">
	    <img class="card-img-top" src="<%=request.getContextPath()%>/image/displayFile?fileName=${boardDtos.thumbnail }" id="index_r_image" alt="Card image cap">
		<div class="card-body">
		   <h3 class="card-title"><b>${boardDtos.title }</b></h3>   
            <small>${boardDtos.datetime }</small>
			<br><br>
		  </h6>
		</div>
	  </div>
	</div>
	
  
	
	
	</c:forEach>
  <!-- div.container-re end -->

  </div>
</div>

  

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
		    	href="<%=request.getContextPath()%>/board/selectAllWithCategory?category=${category}&currentPage=${i}">
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
        
	
	      <a class="page-link" href="<%=request.getContextPath()%>/board/selectAllWithCategory?category=${category}&currentPage=${paginationDto.nextPage}">다음</a>
	    </li>
	  </ul>
	</nav>
	<!-- pagination end -->

  <!-- div.container-re end -->
  </div>
</body>
</html>