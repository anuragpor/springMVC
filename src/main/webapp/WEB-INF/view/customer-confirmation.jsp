<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-confirmation</title>
</head>
<body>
	The customer is confirmed: ${customer.firstName} ${customer.lastName} 
	<br><br>
	
	Free Passes: ${customer.freePasses}
	
	<br><br>
	
	PostalCode: ${customer.postalCode}
</body>
</html>