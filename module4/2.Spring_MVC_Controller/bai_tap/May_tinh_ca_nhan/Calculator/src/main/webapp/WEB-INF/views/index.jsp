<%--
  Created by IntelliJ IDEA.
  User: uyhoa
  Date: 05/13/2021
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/calculator" method="post">
    <div>
      <input type="text" name="a"/>
      <input type="text" name="b"/>
    </div>
    <div>
      <input type="submit" value="Addition(+)" name="operator"/>
      <input type="submit" value="Subtraction(-)" name="operator"/>
      <input type="submit" value="Multiplication(X)" name="operator"/>
      <input type="submit" value="Division(/)" name="operator"/>
    </div>
  </form>
  </body>
</html>
