<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<br>
			<br>
			<form action="/upload" method="post" enctype="multipart/form-data">

				choose file:<input type="file" name="file"> <br>
				<br> <input type="submit" value="upload">

			</form>
		</fieldset>
	</div>
</body>





</html>