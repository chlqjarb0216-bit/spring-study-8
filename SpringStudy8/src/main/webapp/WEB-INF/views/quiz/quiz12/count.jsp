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
	<h1>quiz12 count page</h1>
	<h2>id: ${ loginUser }</h2>
	<h2>
		count:
		<c:if test="${ sessionScope[loginUser]==null }">0</c:if>
		${ sessionScope[loginUser] }
	</h2>

	<c:if test="${ loginUser==null }"><a href="/quiz12/login">login</a></c:if>
	<c:if test="${ loginUser!=null }"><a href="/quiz12/logout">logout</a></c:if>
	
</body>
</html>