<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 9:46
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
<a href="addRecruitmentInfo">添加招聘信息</a>
<a href="updateRecruitmentInfo">修改或删除</a>
<a href="selectRecruitmentInfo">查看所有招聘信息</a>

</body>
</html>
