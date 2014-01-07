<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="/css/Home.css" />
<!-- <script src="/jquery.min.js">

</script>
 -->


<!-- <link rel="stylesheet" href="css/Home.css"> -->

<title>Home</title>
</head>
<body>
	<form>
		<div id="Name">
			<a href="/jsp/Home.jsp">Home</a> 
			<a href="/jsp/Registration.jsp">Personal Details</a>
			<a href="/jsp/Registration.jsp">Academic Details</a>
			<a href="/jsp/Academic.jsp"> View Record</a>
			<a href="/jsp/Academic.jsp"> News</a>
			<a href="/jsp/View.jsp">Logout</a>
		<h3>Welcome ${newStudent}</h3>
		</div>
		
		
		<div id="News">
			<h2>
				<u>College News</u>
			</h2>
			<marquee direction=up>
				College New Year celebration Starts <br /> <br>College
				Magazine
			</marquee>
		</div>
		<div id="details">
			<h2>
				<u>College Details</u>
			</h2>
		</div>
	</form>
</body>