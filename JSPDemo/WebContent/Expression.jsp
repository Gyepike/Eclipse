<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%! 
     int makeAdd (int a, int b) 
     {
	  
	  return a + b;
     }
   %> 
   Converting string to UpperCase! = <%= new String("hello world").toUpperCase() %>
   <br/>
   <br/>
   5 * 10 =  <%= 5 * 10 %>
   <br/>
   is 9 less then 10? <%= 9 < 10 %>
   <br/>
   <% out.println("Scriptlet ");
   out.println("<br/>");
      for (int i = 0 ; i < 10; i++ ) 
      { 
    	  
    	  out.println("Elem szama : " + i);
    	  out.println("<br/>");
      }
      
      out.println(makeAdd(2,6));
   %>
    <br/>
   Osszeadas <%=  makeAdd(2,8) %>
   <br/>
</body>
</html>