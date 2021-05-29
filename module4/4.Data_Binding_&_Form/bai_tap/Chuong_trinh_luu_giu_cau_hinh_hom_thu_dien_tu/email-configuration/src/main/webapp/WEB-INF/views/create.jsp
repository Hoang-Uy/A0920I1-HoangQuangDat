<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: uyhoa
  Date: 05/28/2021
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
    <h3>Settings</h3>
    <form:form action="/createEmail" method="post" modelAttribute="email" >
        <table>
            <tr>
                <td><form:label path="language">Languages </form:label></td>
                <td><form:select path="language" items="${languages}"/></td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size: </form:label></td>
                <td>Show <form:select path="pageSize" items="${pagesizes}"/> emails per page</td>
            </tr>
            <tr>
                <td><form:label path="enableSpamFilter">Spams filter: </form:label></td>
                <td><form:checkbox path="enableSpamFilter" value="true"/>Enable spams filter</td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature: </form:label></td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
