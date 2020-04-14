<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>

<title>CUSTOMER LOGIN PAGE</title>
</head>
<body>
<div align="center">
<h1>${msg}</h1>
</div>

<fieldset>

<div align="center">

<h1 style="color: blue;">Customer LogIn Form</h1>

<form:form method="POST" action="/saveCustomeDtls" modelAttribute="customerModel">

<pre>
        CUSTOMER-ID:<form:input path="customerId"/><br><br>
      CUSTOMER-NAME:<form:input path="customerName"/><br><br>
     CUSTOMER-EMAIL:<form:input path="customerEmail"/><br><br>
       CUSTOMER-SSN:<form:input path="customerSSN"/><br><br>
 CUSTOMER-MOBILE-NO:<form:input path="customerMobileNum"/><br><br>
CUSTOMER-ACCOUNT-NO:<form:input path="customerAccountNo"/><br><br>
   CUSTOMER-ADDRESS:<form:input path="customerAddress"/><br><br>
       CUSTOMER-PIN:<form:input path="customerPIN"/><br><br>

                    <input type="submit" value="Register">

</pre>
</form:form>

</div>


</fieldset>


</body>
</html>