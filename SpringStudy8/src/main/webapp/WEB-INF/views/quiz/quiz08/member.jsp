<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemberList</h1>
	<h2>Auth: ${ auth }</h2>

	<c:forEach var="m" items="${memberList}">
		<p>${m}</p>
	</c:forEach>
</body>
</html>