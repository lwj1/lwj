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
            <th><span class="a1">奖惩ID</span></th>
            <th><span class="a1">复议原因</span></th>
            <th></th>
        </tr>
        <c:forEach items="${reconList}" var="i">
        <tr align="center">
            <td>${i.id}</td>
            <td>${i.reason}</td>
            <td>
            <c:if test="${i.statu==0}">
                <a href="updatereconsider?id=${i.id}&rewid=${i.rewid}">同意</a>/<a href="updatereconsider2?id=${i.id}">驳回</a>
            </c:if>
            <c:if test="${i.statu==1}">
                已驳回该复议
            </c:if>
            <c:if test="${i.statu==2}">
                已同意该复议
            </c:if>
            </td>
        </tr>
        </c:forEach>
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
