<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body>

<div align="center">

<fieldset>
<legend>Register Course Information</legend>

<form:form method="POST"  action="/courseRegister?id=${id}" modelAttribute="courseModel">
<br><br>

     course title: <form:input path="title"/><br><br>
      

<input type="submit" value="Next">

</form:form>


</fieldset>


</div>



</body>
</html>