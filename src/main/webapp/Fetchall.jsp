<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch ALL</title>
</head>
<body>
<h1 style="color:red;">${deleted}</h1>
<h1 style="color:green;">${success}</h1>
<%-- <% List<Student> list=(List<Student>)request.getAttribute("list");%>--%>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>Dob</th>
<th>Age</th>
<th>Email</th>
<th>Gender</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<c:forEach var="s" items="${list}">
<tr>
<th>${s.getId()}</th>
<th>${s.getName()}</th>
<th>${s.getMobile()}</th>
<th>${s.getDob()}</th>
<th>${s.getAge()}</th>
<th>${s.getEmail()}</th>
<th>${s.getGender()}</th>
<th><a href="delete?Id=${s.getId()}"><button>Delete</button></a></th>
<th><a href="Edit?num=${s.getId()}"><button>Edit</button></a></th>
</tr>
</c:forEach>
</table>
</body>
</html>