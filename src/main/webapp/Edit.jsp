<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<h1>Edit Student Details...</h1>
<form:form modelAttribute="employee" action="update" method="post">
Id:<form:input path="id" readonly="true"/><br>
Name:<form:input path="name"/><br>
Email:<form:input path="email"/><br>
Mobile:<form:input path="mobile"/><br>
password:<form:input path="password"/><br>
Gender:
<form:radiobutton path="gender" value="male" label="Male"/>
<form:radiobutton path="gender" value="female" label="Female"/>  
DOB:<input name="date" value="${employee.getDob()}" /><br>
<button>Update</button>
<button type="reset">Cancel</button>
</form:form>
</body>
</html>