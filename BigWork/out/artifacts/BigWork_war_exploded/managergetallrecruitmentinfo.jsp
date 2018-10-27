<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 11:24
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
    <c:forEach items="${sessionScope.RecruitmentInFoList}" var="i">
        <table>

            <div class="tit">基本信息</div>
            <div class="itemli"><span>职业名称</span>${i.posName}</div>
            <div class="itemli"><span>工作性质</span>${i.jobFunction}</div>
            <div class="itemli"><span>招聘人数</span>${i.number}</div>
            <div class="clear"></div>
            <div class="itemli"><span>学历要求</span>${i.educationRequire}</div>
            <div class="itemli"><span>工作经验</span>${i.experienceRequire}</div>
            <div class="itemli"><span>性别要求</span>${i.sexRequire}</div>
            <div class="clear"></div>
            <div class="itemli"><span>年龄要求</span>${i.ageRequire}</div>
            <div class="clear"></div>
            <div class="add"><span>工作地点</span>${i.jobAddress}</div>
            <div class="clear"></div>
            <div class="end"><a href="updateRecruitmentInfo?id=${i.id}">修改</a></div>
            <div class="end"><a href="deleteRecruitmentInfo?id=${i.id}">删除</a></div>
        </table>
        <div class="clear"></div>
        <hr>
    </c:forEach>
    <a href="addRecruitmentInfo.jsp">添加招聘信息</a>
    <div class="end"><a href="managerindex.jsp">返回上一级</a></div>
</div>
</body>
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
