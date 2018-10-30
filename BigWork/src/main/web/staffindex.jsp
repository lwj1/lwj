<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>ajin</title>
</head>
<style>
    ul{
        list-style-type: none;
    }
    .a2{
        width: 100px;
        display: inline-block;;
    }
    .a4{
        width: 150px;
        display: inline-block;
    }
    .a1{
        width:200px;
    }
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
    #c1{
        float: right;
    }
    #c2{
        float: right;
    }
</style>
<body>
<div id="a3">
    <h3 style="text-align: center">陈俊集团</h3>
    <form action="staffloginJudge" method="get">
        <ul>
            <li><span class="a2">员工名:</span><input name="name" class="a1"/></li><br>

            <li><span class="a2">密码:</span><input type="password" name="pass" class="a1"/></li><br>

            <li><span id="c2"><input type="submit" value="登陆" width="300px"></span></li><br>
            <li><font color=red><c:out value="${msg}"></c:out></font><span id="c1">不是员工?<a href="index.jsp">普通用户登陆</a></span></li>

        </ul>
    </form>

</div>

<h4 style="color: red">
</h4>
</body>


</html>