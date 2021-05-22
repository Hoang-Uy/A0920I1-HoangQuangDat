<%--
  Created by IntelliJ IDEA.
  User: uyhoa
  Date: 05/13/2021
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="/sandwich" method="post">
    <div>
      <input type="checkbox" value="Lettuce" name="condiment"/> Lettuce
      <input type="checkbox" value="Tomato" name="condiment"/> Tomato
      <input type="checkbox" value="Mustard" name="condiment"/> Mustard
      <input type="checkbox" value="Sprouts" name="condiment"/> Sprouts
    </div>
    <input type="submit" value="Save"/>
  </form>
  </body>
</html>
