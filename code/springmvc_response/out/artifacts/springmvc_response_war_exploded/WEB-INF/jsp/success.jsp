<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/17
  Time: 7:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎<br>
${msg}<br>
page:${pageScope.msg}<br>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
</body>
</html>
