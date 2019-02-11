<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title></head>
<body>
<form:form action="register" method="post" commandName="userForm">
<h2>Spring MVC Form Demo -Registration</h2><br>
User Name:<form:input path="username" /><br>
Password:<form:password path="password" /><br>
E-mail:<form:input path="email" /><br>
Birthday (mm/dd/yyyy):<form:input path="birthdate" /><br>
Profession:<form:select path="profession" items="${professionList}" /><br>
<input type="submit" value="Register" />
</form:form>
</body>
</html>