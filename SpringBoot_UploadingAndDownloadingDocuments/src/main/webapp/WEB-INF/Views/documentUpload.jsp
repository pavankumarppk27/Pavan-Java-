<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="upload" method="post" enctype="multipart/form-data">

		<div align="center">

			<fieldset>

				<br> <br> upload file: <input type="file" name="document">
				<br> <br> <input type="submit" value="submit">

			</fieldset>
		</div>

	</form>
	<br> <br> <br> <br> 
<div align="center">

	<c:choose>

		<c:when test="${!empty allDocs}">

			<table border="1">
				<tr>
					<th>DocId</th>
					<th>DocName</th>
					<th>file</th>
				</tr>
				<c:forEach var="docs" items="${allDocs}">
					<tr>
						<td>${docs.id}</td>
						<td>${docs.name}</td>
						<td><a href="/download?id=${docs.id}">download</a></td>

					</tr>
				</c:forEach>
			</table>
		</c:when>

		<c:otherwise>
			<h1>No data found</h1>
		</c:otherwise>

	</c:choose>
</div>
</body>




</html>