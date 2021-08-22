<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/20
  Time: 7:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% pageContext.setAttribute("ctp",request.getContextPath()); %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${ctp}/testUploads" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="file" /><br>
    文件：<input type="file" name="file" /><br>
    文件：<input type="file" name="file" /><br>
    描述：<input type="text" name="desc" /><br>
    <input type="submit" value="提交" /><br>
  </form>
  </body>
</html>
