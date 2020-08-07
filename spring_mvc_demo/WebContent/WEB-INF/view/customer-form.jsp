<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Spring MVC Form Customer Registration Form</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <style>
    .error {color : red }
    .error1 {color : red }
    </style>
</head>
<body>
<i>Fill out blanks</i>
		<form:form action="processForm" modelAttribute="customer">
		
		First name : <form:input path="firstName"/>
		
		<br><br>
		Last name (*): <form:input path="lastName"/>
	
		<form:errors path="lastName" cssClass="error"/>
		
		<br><br>
		
		Code (*): <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error1"/>
		
		<br><br>	
		<input type="submit" value="Submit"/>
		
		</form:form>
</body>
</html>