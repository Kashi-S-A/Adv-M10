<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is PageA</h1>
	
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<c:set var="a" value="10"></c:set>
	
	<c:out value="${a}"></c:out><br>
	
	<%-- <c:if test="${a==10}">yes a is having value 100</c:if> --%>
	<br>
	<hr>
	
	<c:choose>
		<c:when test="${a==100}"> a is equal 100</c:when>
		<c:when test="${a>100}"> a is great than 100</c:when>
		<c:otherwise>a is less than 100</c:otherwise>
	</c:choose>
	
	<%-- <c:import url="https://www.instagram.com/"></c:import> --%>
	
	<c:redirect url="https://www.wikipedia.org/"></c:redirect>
	
</body>
</html>