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
    <input type="hidden" value="${id}" name="id">
    <tr align="center">
        <th><span class="a1">面试员工</span></th>
        <th><span class="a1">选择面试日期</span></th>
        <th><span class="a1">选择面试时间</span></th>
        <th></th>
    </tr>
    <tr align="center">
        <td><select name="staffid">
    <c:forEach items="${allStaff}" var="i">
        <option value ="${i.id}">${i.name2}</option>
    </c:forEach>
</select></td>

    <td><input type="date" name="date" id="b1" value="''"></td>
        <td><select name="interviewtime">
            <option value="9:00am">9:00am</option>
            <option value="10:00am">10:00am</option>
            <option value="11:00am">11:00am</option>
            <option value="2:00pm">2:00pm</option>
            <option value="3:00pm">3:00pm</option>
            <option value="4:00am">4:00pm</option>
        </select></td>
        <td>
            <input type="submit" id="c1" value="发送面试邀请">
            <a href="managerRecruitment.jsp">返回上一级</a>
        </td>
    </tr>

    </table>
</form>
</body>

<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#b1").change(function () {
            var date=new Date();
            var seperator1 = "-";
            var year = date.getFullYear();
            var month = date.getMonth() + 1;
            var strDate = date.getDate();
            if (month >= 1 && month <= 9) {
                month = "0" + month;
            }
            if (strDate >= 0 && strDate <= 9) {
                strDate = "0" + strDate;
            }
            var currentdate = year + seperator1 + month + seperator1 + strDate;
            s1 = new Date(currentdate.replace(/-/g, "/"));
            s2 = new Date($("#b1").val().replace(/-/g, "/"))
            var days = s2.getTime() -s1.getTime();
            var time = parseInt(days / (1000 * 60 * 60 * 24))+1

            if(time<3){
                alert("面试日期要在两个工作日以后");
                $("#b1").val('');
            }
        })
        $("#c1").click(function () {
            if(confirm("确认发送？")){
                $("#c2").submit();
            }
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
