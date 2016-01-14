<%--
  Created by IntelliJ IDEA.
  User: ���������
  Date: 22.12.2015
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Вычисление корней уравнения</title>
  <STYLE type="text/css">
    h1 { font-style: italic;text-decoration: underline;text-align: center; color: purple; font-size:24pt; }
    h2 { font-style: italic;color: purple; font-size:16pt; }
  </STYLE>
</head>

<body>
<form action="task" metod="get">
  <h1>Вычисление корней уравнения</h1><br>
  <h2>Введите a:
    <input type="text" name="a" value="<%= request.getAttribute("a")%>"></h2>
  <h2>Введите b:
    <input type="text" name="b" value="<%= request.getAttribute("b")%>"></h2>
  <h2>Введите c:
    <input type="text" name="c" value="<%= request.getAttribute("c")%>"></h2>
  <button type="submit" id="submit1">Расчитать</button>
  <h2>Корень x1:
    <input type="text" name="index" value="<%= request.getAttribute("index")%>" readonly></h2>
  <h2>Корень x2:1
    <input type="text" name="index1" value="<%= request.getAttribute("index1")%>" readonly></h2>
</form>
</body>

</html>
