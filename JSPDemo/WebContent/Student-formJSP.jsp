<%@ page language="java" contentType="text/html "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

  <body>
  
    <jsp:include page="my-header.html"></jsp:include>
     <form action="student-response.jsp" method="GET">
       First name : <input type="text" name="firstName">
       <br/>
       Last name : <input type="text" name="lastName">
       <br/>
        
       <input type="submit" value="Nyomd Meg"> 
     </form>
     
      
     <jsp:include page="my-footer.jsp"></jsp:include>
  </body>
<html> 