<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student confirmation page</title>
</head>
<body>
	
	The Student is confirmed: ${student.firstName} ${student.lastName} Country: ${student.country} 
	// calls student.getFirstName() and student.getLastName()
	
	<br><br>
	Country: ${student.country}
	
	<br><br>
	Programming Language: ${student.favouriteLanguage}
	<br><br>
	<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li>${temp}</li>
	</c:forEach>
	</ul>
</body>
</html>