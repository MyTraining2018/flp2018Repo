<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Pilot Information</h1>
<hr>
<fieldset style="margin-left: 200px;">

<form:form action="savePilot" method="post" modelAttribute="pilot">

	<table align="left">
		<tr>
			<th colspan="2">Pilot details</th>
		</tr>
		<tr>
			<td>Pilot Id:</td>
			<td><form:input type="text" path="pilotId" size="20"/>
			</td>
		</tr>
		<tr>
			<td>FirstName:</td>
			<td><form:input type="text" path="firstName" size="20"/>
			<form:errors path="firstName" cssStyle="color:red;"></form:errors>
			</td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><form:input type="text" path="lastName" size="20"/>
			</td>
		</tr>
		
		<tr>
			<td>Date of Birth:</td>
			<td>
			<form:input path="dateOfBirth"/>
			</td>
		</tr>
		<tr>
			<td>Date of Joining:</td>
			<td><form:input path="dateOfJoin"  /></td>
		</tr>
		<tr>
			<td>Is Certified:</td>
			<td>
			<form:radiobutton path="isCertified" value="true"  />Yes
			<form:radiobutton path="isCertified" value="false" />No
			</td>
		</tr>
		<tr>
			<td>Salary:</td>
			<td><form:input type="text" path="salary" size="20"/></td>
		</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" value="Save">
		</td>
	</tr>	
	
	</table>
</form:form>
</fieldset>
</body>
</html>