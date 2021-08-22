<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/15
  Time: 19:08
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
    <form action="${ctp}/testUser" method="post">
        编号：<input type="text" name="id"><br>
        用户：<input type="text" name="userName"><br>
        密码：<input type="text" name="password"><br>
        省份：<input type="text" name="address.province"><br>
        城市：<input type="text" name="address.city"><br>
        <input type="submit" name="提交"><br>
    </form>
</body>
</html>
