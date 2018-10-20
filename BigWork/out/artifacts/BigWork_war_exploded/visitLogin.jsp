<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19
  Time: 17:05
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
    .a1{
        float: left;
        width: 100px;
        border: 1px solid black;
    }
</style>
<body>
<c:if test="${empty resume}">
    <div style="text-align: right">你好,<a href="addresume.jsp">添加一份简历</a> </div>
</c:if>
<c:if test="${not empty resume}">
    <div style="text-align: right"><a href="resumefind">查看或修改我的简历</a></div>
</c:if>
<h3 style="text-align: center">欢迎来到陈俊汽车金融公司</h3>

<div>
    <div class="a1">首页</div>
    <div class="a1">公司简介</div>
    <div class="a1">部门分类</div>
    <div class="a1">热卖豪车</div>
    <div class="a1">加入我们</div>

</div>
</body>
</html>
