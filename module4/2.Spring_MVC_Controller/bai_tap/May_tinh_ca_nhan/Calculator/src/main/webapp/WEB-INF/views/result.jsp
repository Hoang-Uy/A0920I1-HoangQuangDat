<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: uyhoa
  Date: 05/13/2021
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Result</h1>
    <c:choose>
        <c:when test="${operator == 'Addition(+)'}">
            <p>Addition = <c:out value="${soa+sob}"/></p>
        </c:when>
        <c:when test="${operator == 'Subtraction(-)'}">
            <p>Subtraction = <c:out value="${soa-sob}"/></p>
        </c:when>
        <c:when test="${operator == 'Multiplication(X)'}">
            <p>Multiplication = <c:out value="${soa*sob}"/></p>
        </c:when>
        <c:when test="${operator == 'Division(/)'}">
            <p>Division = <c:out value="${soa/sob}"/></p>
        </c:when>
    </c:choose>
</body>
</html>
