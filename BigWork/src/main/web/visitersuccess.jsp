<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<style>
    #a3{
        background-color: rgba(255, 255, 255, 0.95);
        width: 420px;
        height: 200px;
        border: 1px solid #000000;
        border-radius: 6px;
        padding: 10px;
        margin-top: 15%;
        margin-left: auto;
        margin-right: auto;
        display: block;
    }
</style>
<body>
<div id="a3">
    注册成功！<br>
    <a href="index.jsp">点击返回登录界面</a>
</div>
</body>
</html>
