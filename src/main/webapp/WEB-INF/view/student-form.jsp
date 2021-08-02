<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student"> <!-- modelAttribute should has same name that we passes before showForm mapping this will always be present  -->
	
	First name: <form:input path="firstName" />
	first spring mvc will call student.getFirstName;
	spring mvc will call student.setFirstName
	<br><br>
	 
	Last name: <form:input path="lastName"/>
	<br><br>
	
	Country:
	<!-- for drop-down list -->
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	</form:select>
	<!--<form:select path="country">
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="France" label="France"/>
		<form:option value="Germany" label="Germany"/>
		<form:option value="India" label="India"/> 
	
	 </form:select>
	 -->
	
	<br><br>
	
	Programing Language:
	
	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
	C# <form:radiobutton path="favouriteLanguage" value="C#"/>
	PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
	Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
	
	<br><br>
	
	Operating Systems:
	
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac Os <form:checkbox path="operatingSystems" value="Mac OS"/>
	MS Windows <form:checkbox path="operatingSystems" value="Windows"/>
	
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>