<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	The Student First Name ${param.firstName}
	<br /> The Student Last Name ${param.lastName}
	<br />
	<%=request.getParameter("lastName")%>
	<br /> The Student Country : ${param.country}
	<br /> The Student Programming : ${param.programming}
	<br /> The Student Anime : ${param.anime}
	<br />
	<ul>
		<%
			String[] animes = request.getParameterValues("anime");
			out.println("Listaz :");
			int i = 1;
			if (animes != null) {
				for (String anime : animes) {
					out.println();
					out.println("<li>" + " " + anime + " " + "</li>");
					i++;
				}
			}
		%>
	</ul>
</body>

</html>