<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
<table border="1">
  <thead>
  <tr>
    <td>机场编号</td>
    <td>机场名称</td>
    <td>机场城市</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${showList}" var="airport">
    <tr>
      <td>${airport.id }</td>
      <td>${airport.portName }</td>
      <td>${airport.portCity }</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
  </body>
</html>