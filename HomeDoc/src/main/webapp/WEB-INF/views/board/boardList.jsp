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




  <div id="container-re">

<c:forEach var="boardDtos" items="${boardDtos}" varStatus="status">
  
	<div class="index_review">

	
	
	  <div class="card border-light" style="width: 28rem; height:29rem; cursor: pointer;" 
	  onclick="location.href='<%=request.getContextPath()%>/board/view?no=${boardDtos.no }';">
	    <img class="card-img-top" src="<%=request.getContextPath()%>/image/displayFile?fileName=${boardDtos.thumbnail}" id="index_r_image" >
		<div class="card-body">
		   <h3 class="card-title"><b>${boardDtos.title }</b></h3>   
            <small>${boardDtos.datetime }</small>
			<br><br>
		  </h6>
	 	  <%-- <p class="card-text">${boardDtos.content}</p>  --%>       
		</div>
	  </div>
                 

	<!-- div.index_tag end-->
	
	</div>
	
	
	</c:forEach>
  <!-- div.container-re end -->

  </div>

  

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
		    	href="<%=request.getContextPath()%>/board/selectAllWithCategory?category=${category}&currentPage=${i}">
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


<!-- div#jb-container end -->
</div>
</body>
</html>