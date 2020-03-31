<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<title>Person Profile Information</title>
	</head>
	<body>
		<h1>${message}</h1>
		<h2>Person Information</h2>
		<table>
			<tr>
				<td><b>ID :</b></td>
				<td>${person.getId()}</td>
			</tr>
			<tr>
				<td><b>Name :</b></td>
				<td>${person.getName()}</td>
			</tr>
			<tr>
				<td><b>Surname :</b></td>
				<td>${person.getSurname()}</td>
			</tr>
			<tr>
				<td><b>E-mail :</b></td>
				<td>${person.getEmail()}</td>
			</tr>
		</table>
	</body>
</html>