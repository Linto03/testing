<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name = Academicdetails action="/AcademicServlet" method="post" >
<!-- 	onsubmit="return loginValidation();" -->
		<fieldset>
			<legend> Mark details </legend>
			<table>
				<tr>
					<th>Subject</th>
					<th>Mark Acquired</th>
					<th>Maximum Mark</th>
				</tr>
				<tr>
					<td>English :</td>
					<td><input type="text" id=sub1 name=sub1></td>
					<td><input type="text" id=max1 name=max1></td>
				</tr>
				<tr>
					<td>Maths :</td>
					<td><input type="text" id=sub2 name=sub2></td>
					<td><input type="text" id=max2 name=max2></td>
				</tr>
				<tr>
					<td>Biology :</td>
					<td><input type="text" id=sub3 name=sub3></td>
					<td><input type="text" id=max3 name=max3></td>
				</tr>

				<tr>
					<td>Physics :</td>
					<td><input type="text" id=sub4 name=sub4></td>
					<td><input type="text" id=max4 name=max4></td>
				</tr>
				<tr>
					<td>Chemistry :</td>
					<td><input type="text" id=sub5 name=sub5></td>
					<td><input type="text" id=max5 name=max5></td>
				</tr>

				<tr>
					<td>GrandTotal :</td>
					<td><input type="text" id=markTotal name=markTotal></td>
					<td><input type="text" id=maxTotal name=maxTotal></td>
				</tr>

				<tr>
					<td>Grade :</td>
					<td><input type="text" id="grade" name="grade"></td>
				</tr>
				<tr>
				<td> <td><input type="Submit" value="Submit" ></td>
					<td><input type="button" value=Cancel /></td>
				</tr>	
			</table>
		</fieldset>
	</form>
</body>
</html>