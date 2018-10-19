<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/6
  Time: 0:01
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
    <title>market</title>
</head>
<style>
    ul{
        list-style-type: none;
    }
</style>
<body>
<div >
    <h3>阿进集团</h3>
    <form action="loginJudge" method="get">
        <ul>
            <li>用户名:<input name="name"/></li><br/>

            <li>密码&nbsp&nbsp  :<input type="password" name="password"/></li><br/>
            <li><input type="submit" value="登陆">&nbsp &nbsp&nbsp&nbsp&nbsp<a href="Register.jsp">注册</a></li>
            <li><input type="checkbox" name="log">记住用户名密码</li>
            <li><a href="AutoLoginCheck" name="log">自动登陆</a></li>
        </ul>
    </form>
</div>
<h4 style="color: red">
</h4>
</body>

    
</html>