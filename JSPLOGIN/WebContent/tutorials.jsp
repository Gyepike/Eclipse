<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tutorials Video</title>
</head>
<body>

   <%
     response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
  	 response.setHeader("Pragma","no-cache");
   	 response.setHeader("Expires", "0");
     if(session.getAttribute("username")==null) {
    	 response.sendRedirect("login.jsp");
     }
 
  %>

  Videos Tutorial
 <iframe width="560" height="315" src="https://www.youtube.com/embed/6QLFuuh40Vg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>