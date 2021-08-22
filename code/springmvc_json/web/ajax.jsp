<%--
  Created by IntelliJ IDEA.
  User: Gaosi-PC
  Date: 2021/8/20
  Time: 7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<% pageContext.setAttribute("ctp",request.getContextPath()); %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="scripts/jquery-3.6.0.min.js"></script>
</head>
<body>
<%= new Date()%>
<a href="${ctp}/json">获取用户信息</a>
<div></div>
<script type="text/javascript">
    $("a:first").click(function () {
        $.ajax({
            url:"${ctp}/json",
            type:"GET",
            success:function (data) {
                console.log(data)
                $.each(data,function () {
                    var user = this.id+"--"+this.name+"--"+this.age+"--"+this.gender+"--"+this.birth+"--"+this.email;
                    $("div").append(user+'<br/>');

                })

            }
        });
        return false;
    });
</script>
</body>
</html>
