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
<form action="managerallsalary" id="d2">
    <select name="year">
        <option value="">请选择</option>
        <option value="2018">2018</option>
    </select>
    <select name="month">
        <option value="">请选择</option>
        <option value="1">1月</option>
        <option value="2">2月</option>
        <option value="3">3月</option>
        <option value="4">4月</option>
        <option value="5">5月</option>
        <option value="6">6月</option>
        <option value="7">7月</option>
        <option value="8">8月</option>
        <option value="9">9月</option>
        <option value="10">10月</option>
        <option value="11">11月</option>
        <option value="12">12月</option>
    </select>
    <div id="search">查找</div>
</form>
</div>
<c:if test="${ok==0}">
    <div style="text-align: right"><input type="button" value="上月工资结算" id="q1"></div>
</c:if>
<c:if test="${ok!=0}">
    <div style="text-align: right"><font color="#6495ed">上月工资已结算</font></div>
</c:if>
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
           cellspacing="0">
        <tr align="center">
            <th><span class="a1">员工ID</span></th>
            <th><span class="a1">基本工资</span></th>
            <th><span class="a1">绩效奖金</span></th>
            <th><span class="a1">奖惩</span></th>
            <th><span class="a1">社保</span></th>
            <th><span class="a1">总计</span> </th>
        </tr>
        <c:if test="${not empty salaryList}">
        <c:forEach items="${salaryList}" var="i">
        <tr align="center">

            <td>${i.staffId}</td>
            <td>${i.basicpay}</td>
            <td>${i.bonus}</td>
            <td>${i.reward}</td>
            <td>${-i.security}</td>
            <td>${i.salary}</td>
            </c:forEach>
        </tr>
        </c:if>
    </table>

</div>
    <div style="text-align: right"><a href="managerindex.jsp">返回上一级</a></div>
</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#search").click(function () {
            $("#d2").submit()
        })
        $("#q1").click(function () {
            $.ajax({
                type:"post",
                url:"addsalary",
                data:{},
                success:function (obj) {
                    window.location.href="managerselectsalary"
                    alert("1")
                }
            })
        })
    })
</script>
</html>