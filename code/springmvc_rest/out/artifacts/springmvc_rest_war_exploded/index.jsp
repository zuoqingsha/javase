<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/15
  Time: 11:14
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
    <form action="${ctp}/user" method="post">
      <input type="submit" value="增加">
    </form>
    <form action="${ctp}/user" method="post">
      <input type="hidden" name="_method" value="DELETE" >
      <input type="submit" value="删除">
    </form>
    <form action="${ctp}/user" method="post">
      <input type="hidden" name="_method" value="PUT" >
      <input type="submit" value="修改">
    </form>
    <form action="${ctp}/update3" method="post">
      <input type="hidden" name="id" value="1" ><br>
      姓名：张三<br>
      密码：<input type="text" name="password" ><br>
      年龄：<input type="text" name="age" ><br>
      <input type="submit" value="提交">
    </form>
    <a href="${ctp}/user">查询</a><br />
  </body>
</html>
