<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/27
  Time: 11:27
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
<div style="text-align: right"><font color="purple" size="4">${s.name2} 职位:${s.posName}
<c:if test="${s.status==0}">
    试用期
    </c:if>
    <c:if test="${s.status==1}">
    员工
    </c:if>
    <c:if test="${s.status==2}">
    员工
    </c:if></font>
</div>
<hr>
<input type="button"value="考勤打卡" style="width: 100px;height: 100px" id="a1">
<a href="staffpersonalinfo?staffid=${s.id}">个人信息</a>
<a href="staffselectposition">公司员工</a>

<a href="staffsalary">工资信息</a>
<a href="stafftraining">培训计划</a>

</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#a1").click(function () {
            $.ajax({
                type:"post",
                url:"signintimesheet",
                data:{},
                success:function (obj) {
                    alert(obj)
                }
            })
        })
    })
</script>
</html>
