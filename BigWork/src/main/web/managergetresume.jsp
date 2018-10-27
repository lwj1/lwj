<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20
  Time: 9:55
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
<form action="updateresume" id="a2">
    <table width="700" height="542" border="1"  align="center">
        <caption><h3>个人简历</h3></caption>
        <tr>
            <td width="70px">姓名:</td>
            <td><input name="name" style="width: 150px" value="${resume.name}" readonly></td>
            <td width="70px">性别:</td>
            <td><input name="sex" style="width: 150px" value="${resume.sex}" readonly></td>
            <td colspan="2">出生日期:</td>
            <td><input type="date" name="birth" style="width: 150px" value="${resume.birth}" readonly></td>


        </tr>
        <tr>
            <td width="70px">年龄:</td>
            <td><input name="age"  style="width: 150px" value="${resume.age}" readonly></td>

            <td width="70px">未婚状况:</td>
            <td><input name="marrige" style="width: 150px" value="${resume.marrige}" readonly></td>
            <td colspan="2">民族:</td>
            <td><input name="nation" style="width: 150px" value="${resume.nation}" readonly></td>
        </tr>
        <tr>
            <td width="70px">联系方式:</td>
            <td><input name="phone" style="width: 150px" value="${resume.phone}" readonly></td>
            <td width="70px">工作经验:</td>
            <td><input name="experience" style="width: 150px" value="${resume.experience}" readonly></td>
            <td colspan="2">邮箱:</td>
            <td><input name="email" style="width: 150px" value="${resume.email}" readonly></td>
        </tr>
        <tr>
            <td width="70px">学历:</td>
            <td><input name="education" style="width: 150px" value="${resume.education}" readonly></td>

            <td width="70px">专业:</td>
            <td><input name="major" style="width: 150px" value="${resume.major}" readonly></td>
            <td colspan="2">毕业学校:</td>
            <td><input name="graduateSchool" style="width: 150px" value="${resume.graduateSchool}" readonly></td>
        </tr>
        <tr>
            <td colspan="7" align="center"><b>工作期望</b></td>
        </tr>
        <tr>
            <td colspan="7" height="100"><textarea name="jobDesire" id="aa2" readonly>${resume.jobDesire}</textarea></td>
        </tr>
        <tr>
            <td colspan="7" align="center"><b>自我评价</b></td>
        </tr>
        <tr>
            <td colspan="7" height="700">
                <textarea name="selfassessment" id="aa1" readonly>${resume.selfassessment}</textarea>

            </td>
        </tr>
        <tr>
            <td>薪资期望:</td>
            <td colspan="6"><input name="salaryExpectation" style="width: 610px" value="${resume.salaryExpectation}" readonly></td>
        </tr>
        <tr>
            <td colspan="6" style="border-right-style: none"></td>
            <td style="border-left-style: none"><a href="getallrecruitment" ><input type="button"  value="返回上一级" style="width: 150px" ></a></td>
        </tr>
    </table>
</form>
</body>
<style>
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
<script src="js/jquery-3.2.1.js"></script>

</html>