<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instructor Detail</title>
</head>
<body>

<div align="center">

<fieldset>
<legend>Register Instructor_Detial Information</legend>

<form:form method="POST"  action="/register" modelAttribute="instrDtlModel">
<br><br>
<pre>
<b>youtubeChannel:</b> <form:input path="youtubeChannel"/><br><br>
         <b>hobby:</b> <form:input path="hobby"/><br><br>
</pre>
<input type="submit" value="Next">

</form:form>


</fieldset>


</div>



</body>
</html>