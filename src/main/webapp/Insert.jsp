<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">
Name:<input type="text" placeholder="Name" name="name">
Email:<input type="email" placeholder="Email" name="email">
Password::<input type="password" placeholder="Password" name="password">
Mobile Number:<input type="tel" pattern="[0-9]{10}" placeholder="Mobile" name="mobile">
Gender:
<input type="radio"  name="gender" value="male">Male
<input type="radio"  name="gender" value="female">Female <br>
Date of Birth:<input type="date" placeholder="Date of Birth" name="date">
<button>Save</button> <button type="reset">Cancel</button>
</form>
</body>
</html>