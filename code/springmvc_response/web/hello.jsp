<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/17
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctx",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello,springmvc
<img src="${ctx}/images/1.jpg">
</body>
</html>
