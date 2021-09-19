<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/stylesheet.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/genesis" method ="post">
		Washer or Dryer?
		<select name="machine">
			<option value="dryer">Dryer</option>
			<option value="washer">Washer</option>
		</select>
		Row:
		<input name="row">
		<input type="hidden" name="number" value="5">
		<button>Submit</button>
		
		
	</form>

</body>
</html>