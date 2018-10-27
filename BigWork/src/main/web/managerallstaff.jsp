<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 15:56
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
<form action="interviewAndStaff" id="c2">
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
           cellspacing="0">
        <tr align="center">
            <th><span class="a1">员工id</span></th>
            <th><span class="a1">员工名称</span></th>
            <th><span class="a1">员工状态</span></th>
            <th></th>
        </tr>
        <c:forEach items="${staffList}" var="i">
        <tr align="center">
            <td>${i.id}</td>
            <td>${i.name2}</td>
            <td>
                <c:if test="${i.status==0}">
                    试用期
                </c:if>
                <c:if test="${i.status==1}">
                    正式员工
                </c:if>
                <c:if test="${i.status==2}">
                    正式员工
                </c:if>
                <c:if test="${i.status==3}">
                    已离职
                </c:if>
            </td>
            <td>
                <c:if test="${i.status==0}">
                    <input type="button" value="转正" id="a1">
                </c:if>
                <c:if test="${i.status==1}">
                    <input type="button" value="离职员工" id="a2">
                </c:if>
                <c:if test="${i.status==2}">
                    <input type="button" value="离职员工" id="a3">
                    该员工提出离职申请
                </c:if>
                <input type="hidden" value="${i.id}">
            </td>
            </c:forEach>
        </tr>
    </table>
</form>
<div style="text-align: right"><a href="managerindex.jsp">返回上一级</a></div>
</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#a1").click(function () {
            $.ajax({
                type:"post",
                url:"staffstatuschange",
                data:{id:$(this).next().val()},
                success:function (obj) {
                    alert(obj)
                    window.location.href="getallstaff"
                }
            })
        })
        $("#a2").click(function () {
            $.ajax({
                type:"post",
                url:"staffstatuschange2",
                data:{id:$(this).next().val()},
                success:function (obj) {
                    alert(obj)
                    window.location.href="getallstaff"
                }
            })
        })
        $("#a3").click(function () {
            $.ajax({
                type:"post",
                url:"staffstatuschange2",
                data:{id:$(this).next().val()},
                success:function (obj) {
                    alert(obj)
                    window.location.href="getallstaff"
                }
            })
        })
    })
</script>
<style type="text/css">
    .t1
    {
        clear: both;
        border: 1px solid #c9dae4;
    }
    .t1 tr th
    {
        color: #0d487b;
        background: #f2f4f8;
        line-height: 28px;
        border-bottom: 1px solid #9cb6cf;
        border-top: 1px solid #e9edf3;
        font-weight: normal;
        text-shadow: #e6ecf3 1px 1px 0px;
        padding-left: 5px;
        padding-right: 5px;
        width: 200px;
    }
    .t1 tr td
    {
        border-bottom: 1px solid #e9e9e9;
        padding-bottom: 5px;
        padding-top: 5px;
        color: #444;
        border-top: 1px solid #FFFFFF;
        padding-left: 5px;
        padding-right: 5px;
        word-break: break-all;
        width: 200px;
    }
    /* white-space:nowrap; text-overflow:ellipsis; */
    tr.alt td
    {
        background: #ecf6fc; /*这行将给所有的tr加上背景色*/
    }
    tr.over td
    {
        background: #bcd4ec; /*这个将是鼠标高亮行的背景色*/
    }
</style>

</html>
