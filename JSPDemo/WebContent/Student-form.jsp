<%@ page language="java" contentType="text/html "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

  <body>
     <form action="Studentk" method="GET">
       First name : <input type="text" name="firstName">
       <br/>
       Last name : <input type="text" name="lastName">
       <br/>
        
       <input type="submit" value="Submit"> 
     </form>
     
      
     Time on the server <%= new java.util.Date() %>
  </body>
<html> 