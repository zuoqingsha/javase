<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/18
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
请按照id-name-password-age的方式输入数据
<form action="${ctp}/myConverter" method="post">
    <input type="text" name="user"><br>
    <input type="submit" name="提交">
</form>
</body>
</html>
