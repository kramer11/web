<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<table>
<thead>
<tr>Name</tr>
<tr>LastName</tr>
<tr>Age</tr>
</thead>
<c:forEach var="user" items="${users}">
<tr>
<td>${user.name}</td>
<td>${user.lastName} </td>
<td>${user.age} </td>
</tr>
</c:forEach>
</table>
</body>
</html>
