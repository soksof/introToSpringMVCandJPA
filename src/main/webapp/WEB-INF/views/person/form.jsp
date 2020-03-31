<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Add a new person</title>
	</head>
	<body>
		<h1>Please enter the person details</h1>
		<form:form method="POST" action="person" modelAttribute="person">
			<table>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><form:label path="surname">Surname</form:label></td>
					<td><form:input path="surname" /></td>
				</tr>
				<tr>
					<td><form:label path="email">E-mail</form:label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>