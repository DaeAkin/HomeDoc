<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <script>
            $(document).ready(function() {
                //파일업로드 ajax 
                
                $("#uploadFile").on("change",function(event) {
                    event.preventDefault();
                    
                    var form = document.forms[0];
                    var formData = new FormData(form);


                  /*   var formData = new FormData();
                    formData.append("file",$("#uploadFile")[0].files[0]); */
                    
                    
                   
                    
                    $.ajax({
                        
                        type            :       "post",
                        url             :       "<%=request.getContextPath()%>/upload/image",
                        data            :       formData,
                        dataType        :       "json",
                        processData     :       false,
                        contentType     :       false,
                        success         :       function(data) {
                     
                    
                    /* hidden으로 원래 이미지 , 크롭한 이미지 이름 적어주고 
                       파일 올렸으면 그파일로 src 변경 */
                       alert("업로드 성공 !!")
                       alert(data.boardInsertImage)
                      <%--   $("#profileImageView").attr("src","<%=request.getContextPath()%>/resources/profileImage/" + data.IMAGEURL) 
                   		
                        $("#ORIGINALIMAGEURL").val(data.ORIGINALIMAGEURL)
                        $("#IMAGEURL").val(data.IMAGEURL) --%>
                        
                   		
                        }
                    })
                    
                    
                })
                                 
            })
  
  
  
      

  </script>
</head>

    
<body>
  
  <form action="" method="post" enctype="multipart/form-data">
	

	파일 : <input type="file" name="file" id="uploadFile" multiple><br />

	<input type="hidden" name="hidden1" value="adfsdfdsfdsf">

	<input type="submit" value="File Upload">

</form>
    
</body>

</html>