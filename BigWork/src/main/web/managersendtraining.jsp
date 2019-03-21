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
<div id="box">
    <form action="staffgetstaff3" id="d2">
        <select name="depId" id="q1">
            <option value="">请选择</option>
            <c:forEach items="${departmentList}" var="i">
                <option value ="${i.id}">${i.name}</option>
            </c:forEach>
        </select>
        <select name="posId" id="q2" >
            <option value="">请选择</option>
        </select>
        <div id="search">查找</div>
    </form>
</div>
<form action="addTS" id="c2">
    <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
           cellspacing="0">

        <tr align="center">
            <th class="d4"><input type="hidden" name="tid" value="${tid}"></th>
            <th class="d2"><span class="a1">员工姓名</span></th>
            <th class="d2"><span class="a1">性别</span></th>
            <th class="d2"><span class="a1">年龄</span></th>
        </tr>
        <c:if test="${not empty staffall}">
            <c:forEach items="${staffall}" var="i">
                <tr align="center">
                    <td class="d1"><input type="checkbox" name="id" value="${i.id}"></td>
                    <td class="d3">${i.name2}</td>
                    <td class="d3">${i.sex}</td>
                    <td class="d3">${i.age}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</form>
<div style="text-align: right"><input type="button" id="c3" value="确认发送"></div>
<div style="text-align: right"><a href="selecttraining">返回上一级</a></div>
</body>

<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#search").click(function () {
            $("#d2").submit()
        })
        $("#c3").click(function () {
            $("#c2").submit()
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
    .t1 tr .d2
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
    .t1 tr .d4
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
        width: 50px;
    }
    .t1 tr .d3
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
    .t1 tr .d1{
        border-bottom: 1px solid #e9e9e9;
        padding-bottom: 5px;
        padding-top: 5px;
        color: #444;
        border-top: 1px solid #FFFFFF;
        padding-left: 5px;
        padding-right: 5px;
        word-break: break-all;
        width: 50px;
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
