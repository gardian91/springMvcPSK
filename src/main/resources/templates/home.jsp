<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Spittr</title>
</head>
<body>
	<h1>Witamy w serwisie Spittr</h1>
	<a href="<c:url value="/spittles" />">Spittle</a> |
	<a href="<c:url value="/spitter/register" />">Rejestracja</a>
</body>
</html>