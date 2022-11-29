<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/getAliens" method="POST">
		<label for="fname">First Name:</label><br> <input type="text"
			id="fname" name="fname" ><br> <label
			for="lname">Second  Name:</label><br> <input type="text" id="lnumber"
			name="lname" ><br>
		<br> <input type="submit" value="Submit">
	</form>
	
	<br/>

    <form action="/updateAlien" method="POST">
         <label>Insert Add Alien Name </label> 
         <br/>
	    <label
			for="aname"> Name:</label><br> <input type="text" id="lnumber"
			name="aname" ><br>
		<br> <input type="submit" value="Submit">
	</form>
	
	<form action="/findAlien" method="POST">
         <label> Search Alien: </label> 
         <br/>
	    <label
			for="aid"> Aid:</label><br> <input type="number" id="lnumber"
			name="aid" ><br>
		<br> <input type="submit" value="Submit">
	</form>
	
	<form action="findByAname" method="POST">
         <label> Search Alien Name: </label> 
         <br/>
	    <label
			for="aname"> aname:</label><br> <input type="text" id="aname"
			name="aname" ><br>
		<br> <input type="submit" value="Submit">
	</form>
	
</body>
</html>