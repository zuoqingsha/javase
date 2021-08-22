<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/18
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <form action="${ctp}/testValidation" method="post">--%>
<%--        编码：<input type="text" name="id">${errors.id}<br>--%>
<%--        姓名：<input type="text" name="name">${errors.name}<br>--%>
<%--        年龄：<input type="text" name="age">${errors.age}<br>--%>
<%--        性别：<input type="text" name="gender">${errors.gender}<br>--%>
<%--        生日：<input type="text" name="birth">${errors.birth}<br>--%>
<%--        邮箱：<input type="text" name="email">${errors.email}<br>--%>
<%--        <input type="submit" name="提交">--%>
<%--    </form>--%>
<form:form action="${ctp}/testValidation" method="post">
    编码：<form:input path="id"></form:input><form:errors path="id"></form:errors> <br>
    姓名：<form:input path="name"></form:input><form:errors path="name"></form:errors> <br>
    年龄：<form:input path="age"></form:input><form:errors path="age"></form:errors> <br>
    性别：<form:input path="gender"></form:input><form:errors path="gender"></form:errors> <br>
    生日：<form:input path="birth"></form:input><form:errors path="birth"></form:errors> <br>
    邮箱：<form:input path="email"></form:input><form:errors path="email"></form:errors> <br>
            <input type="submit" name="提交">
</form:form>
</body>
</html>
