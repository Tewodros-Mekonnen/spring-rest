<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Rest</title>
</head>
<body>
<h3>Welcome to Spring Rest</h3>
<hr>
<a href="${pageContext.request.contextPath}/test/hello" >Click-for-Test-API</a>
<br><br>
<a href="${pageContext.request.contextPath}/api/students" >Click-for-Students-List-API</a>
<br><br>
<a href="${pageContext.request.contextPath}/api/students/0" >Click-for-Student-at-index-API</a>
</body>
</html>