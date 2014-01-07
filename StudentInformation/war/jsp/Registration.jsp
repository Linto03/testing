<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript">
	function validateForm() {
		//Student id
		if ((document.getElementById("studentId").value).trim() == "") {
			document.getElementById("errorId").innerHTML = "*Mandatory Field";
			return false;
		} else
			document.getElementById("errorId").innerHTML = "";
		//UserName 
		if ((document.getElementById("userName").value).trim() == "") {
			document.getElementById("errorName").innerHTML = "*Mandatory Field";
			return false;
		} else {
			document.getElementById("errorName").innerHTML = "";
		}
		//pwd 
		if ((document.getElementById("pwd").value).trim() == "") {
			document.getElementById("errorPwd").innerHTML = "*Mandatory Field";
			return false;
		} else {
			document.getElementById("errorPwd").innerHTML = "";
		}
		//Surname 
		if ((document.getElementById("surName").value).trim() == "") {
			document.getElementById("errorSurName").innerHTML = "*Mandatory Field";
			return false;
		} else {
			document.getElementById("errorSurName").innerHTML = "";
		}
		//dob 
		if ((document.getElementById("dob").value).trim() == "") {
			document.getElementById("errordob").innerHTML = "*Mandatory Field";
			return false;
		} else {
			document.getElementById("errordob").innerHTML = "";
		}
		// Email Validation -
		if ((document.getElementById('email').value).trim() == "") {
			document.getElementById("errorEmail").innerHTML = "*Mandatory Field";
			return false;
		} else {
			var email = document.getElementById('email').value;
			if (email.indexOf("@", 0) < 0) {
				document.getElementById("errorEmail").innerHTML = "*Invalid Email ID";
				return false;
			} else if (email.indexOf(".", 0) < 0) {
				document.getElementById("errorEmail").innerHTML = "*Invalid Email ID";
				return false;
			} else {
				document.getElementById("errorEmail").innerHTML = "";
				document.form1.email.focus();
			}
		}
		//Address validation
		if ((document.getElementById('address').value).trim() == "") {
			document.getElementById("errorAddress").innerHTML = "*Mandatory Field";
			return false;
		} else {
			document.getElementById("errorAddress").innerHTML = "";
		}
	}
</script>

<title>Registration</title>
</head>
<body>
	<h1 align=center>M.G UNIVERSITY</h1>
	<h2 align=center>Kottayam</h2>
	<h2 align=center>Kerala</h2>
	<hr width=80%>
	<br />
	<table width=900 align=center bgcolor="pink">
		<tr>
			<td><h4 align=center>
					<u>STUDENT REGISTRATION FORM</u>
				</h4></td>
		</tr>
	</table>
	<br />
	<!-- 	 <form name="f1" action="/RegistrationServlet" method="get" onsubmit="return validate();"> -->

	<form name="form1" method="post" action="/RegistrationServlet" 
		onsubmit="return validateForm();">

		<table align="center">
			<tr>
				<td>Student ID:</td>
				<td><input type="Text" id="studentId" name="studentId" /><br /></td>
				<td><label id="errorId" style="color: #FF0000"></label></td>

			</tr>
			<tr>
				<td>StudentName :</td>
				<td><input type="Text" id="userName"  name="userName"/><br /></td>
				<td><label id="errorName" style="color: #FF0000"></label></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="Text" id="pwd" name="pwd" /><br /></td>
				<td><label id="errorPwd" style="color: #FF0000"></label></td>
			</tr>
			<tr>
				<td>Surname :</td>
				<td><input type="text" id="surName"  name="surName"/><br /></td>
				<td><label id="errorSurName" style="color: #FF0000"></label></td>
			</tr>
			<tr>
				<td>Date of Birth :</td>
				<td><input type="text" id="dob" name="dob"  /><br /></td>
				<td><label id="errordob" style="color: #FF0000"></label></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" id="email" name="email" /><br /></td>
				<td><label id="errorEmail" style="color: #FF0000"></label></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><input type="text" id="phone" name="phone" /><br /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" id="address" name="address"/><br /></td>
				<td><label id="errorAddress" style="color: #FF0000"></label></td>
			</tr>
			<tr align="center">
				<td><input type="Submit" value="Registration" /></td>
			</tr>
		</table>
		<br />
		<hr width=80%>
	</form>
</body>
</body>
</html>