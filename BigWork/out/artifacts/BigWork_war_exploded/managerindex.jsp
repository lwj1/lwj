<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 17:23
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
<center>程俊集团</center>
<div style="text-align: right"><font color="purple" size="4">你好，管理员</font></div>
<hr>
<a href="getallrecruitment">查看所有投递</a>
<a href="selectRecruitmentInfo">招聘信息管理</a>
<a href="selectdepartment">部门管理</a>
<a href="selectposition">职位管理</a>
<a href="getallstaff">员工转正或离职</a>
<a href="managerselectstaff.jsp">员工换岗</a>
<a href="selecttraining">培训信息</a>
<a href="selectreward">奖惩信息</a>
<a href="managerselectsalary">薪资信息</a>
<a href="managerreconsideration">复议申请</a>
</body>
</html>
