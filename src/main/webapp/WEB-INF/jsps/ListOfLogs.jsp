<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of logs</h1>
	<div>
		<table border="1">
			<tr>
				<th>Log ID</th>
				<th>Log Action</th>
				<th>User ID</th>
				<th>Log Date</th>
			</tr>
			<c:forEach items="${listLog}" var="logs">
				<tr>
					<td>${logs.logID}</td>
					<td>${logs.logAction}</td>
					<td>${logs.userID}</td>
					<td>${logs.logDate}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>