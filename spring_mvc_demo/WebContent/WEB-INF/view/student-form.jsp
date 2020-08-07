<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Spring MVC Form</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>
		<form:form action="processForm" modelAttribute="student">
		
		First name : <form:input path="firstName"/>
		
		<br><br>
		Last name : <form:input path="lastName"/>
		
		<br><br>
		Country:
		<form:select path="country">
		
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="Turkey" label="Turkey"></form:option>
			<form:option value="Canada" label="Canada"></form:option>
			<form:option value="Australia" label="Australia"></form:option>
			
		</form:select>
		
		<br><br>
		
		<input type="submit" value="Submit"/>
		
		</form:form>
</body>
</html>