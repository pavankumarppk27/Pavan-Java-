<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>CUSTOMERS-DATA</title>
</head>
<body>

<c:if test="${!empty msg}">
<h1>${msg}</h1>
</c:if>
<div align="center">

	<c:if test="${!empty customerDtls}">
		<h1>Customer Data </h1>
	</c:if>

	<c:choose>

		<c:when test="${!empty customerDtls}">

			<table border="1">

				<tr>
					<th>CustomerId</th>
					<th>CustomerName</th>
					<th>CustomerEmail</th>
					<th>CustomerSSN</th>
					<th>CustomerMobileNum</th>
					<th>CustomerAccountNo</th>
					<th>CustomerAddress</th>
					<th>CustomerPIN</th>
					<th>EDIT</th>
					<th>DELETE</th>
					
					
				</tr>

				<c:forEach var="data" items="${customerDtls}">

					<tr>
                         <td>${data.getCustomerId()}</td>
                         <td>${data.getCustomerName()}</td>
                         <td>${data.getCustomerEmail()}</td>
                         <td>${data.getCustomerSSN()}</td>
                         <td>${data.getCustomerMobileNum()}</td>
                         <td>${data.getCustomerAccountNo()}</td>
                         <td>${data.getCustomerAddress()}</td>
                         <td>${data.getCustomerPIN()}</td>
                         <td><a href="/editCustomerData?id=${data.getCustomerId()}">EDIT</a></td>
                         <td><a href="/deleteCustomerData?id=${data.getCustomerId()}">DELETE</a></td>
					</tr>

				</c:forEach>

			</table>


		</c:when>

		<c:otherwise>
			<h1>Customers Data is not found..!</h1>
		</c:otherwise>

	</c:choose>

</div>

</body>
</html>