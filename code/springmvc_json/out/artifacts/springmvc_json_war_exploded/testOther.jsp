<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/21
  Time: 6:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="scripts/jquery-3.6.0.min.js"></script>
<html>
<% pageContext.setAttribute("ctp",request.getContextPath()); %>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctp}/testRequestBody" method="post" enctype="multipart/form-data">
    <input name="username" value="zhangsan"><br>
    <input name="password" value="123456"><br>
    <input type="file" name="file"><br>
    <input type="submit"><br>
</form>
<hr />
<a href="${ctp}/testResponseEntity">发送json数据</a>
<script type="text/javascript">
    $("a:first").click(function () {
        var user = {id:"1",name:"zhangsan",age:"12",gender:"男",birth:"2021-8-11",email:"123@qq.com"};
        var userJson = JSON.stringify(user);
        $.ajax({
            url:"${ctp}/testResponseEntity",
            type:"POST",
            data:userJson,
            contentType:"application/json",
            success:function (data) {
                alert(data);

            }
        });
        return false;
    });
</script>
</body>
</html>
