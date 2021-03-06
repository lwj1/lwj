<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 10:03
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
    <title></title>
    <style type="text/css">
        #box{
            width: 380px;
            margin: 30px auto;
            font-size: 14px;
        }
        input{
            width: 260px;
            border: 1px solid #e2e2e2;
            height: 30px;
            float: left;
            background-repeat: no-repeat;
            background-size: 25px;
            background-position:5px center;
            padding:0 0 0 40px;
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
        #aa1{
            height: 696px;
            width: 696px;
        }
        #aa2{
            height:96px;
            width: 696px;
        ;
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
</head>
<body>
<div id="box">
<form action="staffpositionchange" id="d2">
    <input type="text" name="name" placeholder="请输入员工名">
    <div id="search">搜索</div>
</form>
</div>
    <c:if test="${empty staffList2}">
        ${msg}
    </c:if>
    <c:if test="${not empty staffList2}">
        <span id="d1"></span>
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
           cellspacing="0">
        <tr align="center">
            <th><span class="a1">姓名</span></th>
            <th><span class="a1">所属职位</span></th>
            <th><span class="a1">所属部门</span></th>
            <th></th>
        </tr>
        <c:forEach items="${staffList2}" var="i">
        <tr align="center">
            <td>${i.name2}</td>
            <td>${i.posName}</td>

            <td>${i.depName}</td>
            <td>
                <a href="changeposition?id=${i.id}">选择换岗</a>
            </td>
            </c:forEach>
        </tr>

    </table>
    </c:if>

</div>
<br>
<br>
<br>
<br>
<div style="text-align: right"><a href="managerindex.jsp">返回上一级</a></div>
</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#search").click(function () {
            $("#d2").submit()
        })
    })
</script>
</html>