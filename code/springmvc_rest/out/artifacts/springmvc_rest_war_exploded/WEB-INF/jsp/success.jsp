<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/15
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
操作成功<br>
request:${requestScope.get("requestParam")}
session:${sessionScope.get("sessionParam")}
</body>
</html>
