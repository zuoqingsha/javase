<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/14
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
    <form action="${ctp}/chenxk/hello" method="post">
        <input type="text" name="username"><br>
        <input type="submit" name="提交">
    </form>
</body>
</html>
