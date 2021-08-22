<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/17
  Time: 7:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${ctp}/update" method="post">
    <input type="hidden" name="id" value="1" ><br>
    姓名：张三<br>
    密码：<input type="text" name="password" ><br>
    年龄：<input type="text" name="age" ><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
