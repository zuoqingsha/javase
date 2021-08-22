<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/18
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${cpt}/testDateConverter" method="post">
    id:      <input type="text" name="id"><br>
    name:    <input type="text" name="name"><br>
    password:<input type="password" name="password"><br>
    age:     <input type="text" name="age"><br>
    birth:   <input type="text" name="birth"><br>
    <input type="submit" name="提交">
</form>
</body>
</html>
