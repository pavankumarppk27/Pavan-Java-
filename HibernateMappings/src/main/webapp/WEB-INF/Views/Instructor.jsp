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
<legend>Register Instructor Information</legend>

<form:form method="POST"  action="/instrRegister?id=${id}" modelAttribute="instrModel">
<br><br>
<pre>
     <b>firstName:</b> <form:input path="firstName"/><br><br>
      <b>lastName:</b> <form:input path="lastName"/><br><br>
         <b>email:</b> <form:input path="email"/><br><br>
         
</pre>
<input type="submit" value="Next">

</form:form>


</fieldset>


</div>



</body>
</html>