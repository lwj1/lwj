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
<form>
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
           cellspacing="0">
        <input type="hidden" value="${id}" name="id">
        <tr align="center">
            <th><span class="a1">员工id</span></th>
            <th><span class="a1">员工姓名</span></th>
            <th><span class="a1">培训状态</span></th>
        </tr>
        <c:if test="${not empty staffList}">
            <c:forEach items="${staffList}" var="i">
        <tr align="center">
            <td>${i.id}</td>
            <td>${i.name2}</td>
            <td>
                <c:if test="${i.status2==0}">
                    未确认
                </c:if>
                <c:if test="${i.status2==1}">
                    已拒绝
                </c:if>
                <c:if test="${i.status2==2}">
                    已同意
                </c:if>
            </td>

        </tr>
            </c:forEach>
        </c:if>
    </table>
</form>
<div style="text-align: right"><a href="selecttraining">返回上一级</a></div>
</body>

<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#search").click(function () {
            $("#d2").submit()
        })
        $("#q1").change(function () {
            $.ajax({
                type:"post",
                url:"changeposition2",
                data:{DepNo:$(this).val()},
                success:function (obj) {
                    $("#q2").find("option").remove()
                    for(i in obj){
                        $("#q2").append("<option value='"+obj[i].id+"'>"+obj[i].name+"</option>");
                    }
                }
            })
        })
    })

</script>
<style type="text/css">
    #box{
        width: 380px;
        margin: 30px auto;
        font-size: 14px;
    }
    #search{
        width: 78px;
        height: 32px;
        float: right;
        background: black;
        color: white;
        text-align: center;
        line-height: 32px;
        cursor: pointer;
    }
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