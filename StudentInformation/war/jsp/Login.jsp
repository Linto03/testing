<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<script type="text/javascript" src="/js/login.js"></script>

<!-- <script src="/js/login.js"></script> -->



</head>
<body>
	<div align="center">
		<h3>
			<u>WELCOME TO LOGIN PAGE</u>
		</h3>
		<br>
		
		<form name = loginform action="/LoginServlet" method="get">
			<table bgcolor="#E6E6FA" >
			<col width="100">
				<tr>
					<td>Student Name:</td>
					<td><input type="text" id="studentName" name="studentName" value=" "/></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" id=pwd name="pwd"  value=" " /></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td><input type="radio" name="userType" value="student">Student<br></td> -->
<!-- 					<td><input type = radio name=userType value =admin >Administrator</td> -->
<!-- 				</tr> -->
				<tr>
					<td><input type="Submit" value="LOGIN" onclick="return loginValidation();"></td>
					<td><input type="button" value=CANCEL /></td>
				</tr>
				<tr>
					<td><a href="/jsp/Registration.jsp">Click Me for
							Registration</a></td>
				</tr>
			</table>
		</form>
		
	</div>
</body>

</html>