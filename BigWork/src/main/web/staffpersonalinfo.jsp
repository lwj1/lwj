<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 9:55
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
<body>
<div class="item">
    <form action="/staffupdate" id="a2">
        <div class="item">
                <table>
                    <div class="tit">基本信息</div>
                    <div class="itemli"><span>姓名</span><input name="name2" value="${s.name2}"></div>
                    <div class="itemli"><span>性别</span><input name="sex" value="${s.sex}"></div>
                    <div class="clear"><input type="hidden" name="id" value="${s.id}"></div>
                    <div class="itemli"><span>手机</span><input name="phone" value="${s.phone}"></div>
                    <div class="itemli"><span>年龄</span><input name="age" value="${s.age}"></div>
                    <div class="clear"></div>
                    <div class="itemli"><span>邮箱</span><input name="email" value="${s.email}"></div>
                    <div class="end"><input type="button" value="修改" id="a1"></div>
                    <div class="end"><a href="staffLogin.jsp">返回上一级</a></div>
                </table>
                <div class="clear"></div>
                <hr>
        </div>
    </form>

</div>
</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#a1").click(function () {
            if(confirm("确认修改？")){
                $("#a2").submit();
            }
        })
    })
</script>
<style>
    .item .itemli{
        float: left;
        width: 250px;
        height: 36px;
        line-height: 36px;
        color: #333333;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        padding-right: 15px;
    }
    .item {
        padding-left: 40px;
        padding-top: 15px;
        padding-bottom: 15px;
        position: relative;
        float: left;
        width: 880px;
    }
    span{
        padding-right: 15px;
        color: #999999;
    }
    .item .tit {
        margin-left: -18px;
        border-left: 3px #FF6600 solid;
        padding-left: 15px;
        font-size: 18px;
        color: #333333;
        height: 18px;
        line-height: 18px;
        margin-bottom: 20px;
    }
    .item .add {
        float: left;
        height: 36px;
        line-height: 36px;
        color: #333333;
        padding-right: 10px;
    }
    .item .end{
        float: right;
        width: 200px;
        height: 36px;
        line-height: 36px;
        color: #333333;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        padding-right: 15px;
    }
    .clear {

        clear: both;
        height: 0px;
        font-size: 0px;
        line-height: 0px;

    }
</style>
</html>