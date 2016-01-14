<%--
  Created by IntelliJ IDEA.
  User: Маргарита
  Date: 22.12.2015
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Расчёт факториала</title>
  <STYLE type="text/css">
    h1 { font-style: italic;text-decoration: underline;text-align: center; color: purple; font-size:24pt; }
    h2 { font-style: italic;color: purple; font-size:16pt; }
  </STYLE>
</head>

<body>
<form action="blabla" method="get">
  <button type="submit" id="submit">Назад</button>
  <h1>Расчёт факториала</h1><br>
</form>

<form action="task" metod="get">
  <h2>Введите число:
    <input type="text" name="number" value="<%= request.getAttribute("number")%>"></h2>
  <button type="submit" id="submit1">Расчитать</button>
  <h2>Факториал:
    <input type="text" name="index" value="<%= request.getAttribute("index")%>" readonly></h2>
</form>
</body>

</html>
