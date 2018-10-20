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
            <td><input name="name" style="width: 150px" value="${resume.name}"></td>
            <td width="70px">性别:</td>
            <td><input name="sex" style="width: 150px" value="${resume.sex}"></td>
            <td colspan="2">出生日期:</td>
            <td><input type="date" name="birth" style="width: 150px" value="${resume.birth}"></td>


        </tr>
        <tr>
            <td width="70px">年龄:</td>
            <td><input name="age"  style="width: 150px" value="${resume.age}"></td>

            <td width="70px">未婚状况:</td>
            <td><input name="marrige" style="width: 150px" value="${resume.marrige}"></td>
            <td colspan="2">民族:</td>
            <td><input name="nation" style="width: 150px" value="${resume.nation}"></td>
        </tr>
        <tr>
            <td width="70px">联系方式:</td>
            <td><input name="phone" style="width: 150px" value="${resume.phone}"></td>
            <td width="70px">工作经验:</td>
            <td><input name="experience" style="width: 150px" value="${resume.experience}"></td>
            <td colspan="2">邮箱:</td>
            <td><input name="email" style="width: 150px" value="${resume.email}"></td>
        </tr>
        <tr>
            <td width="70px">学历:</td>
            <td><input name="education" style="width: 150px" value="${resume.education}"></td>

            <td width="70px">专业:</td>
            <td><input name="major" style="width: 150px" value="${resume.major}"></td>
            <td colspan="2">毕业学校:</td>
            <td><input name="graduateSchool" style="width: 150px" value="${resume.graduateSchool}"></td>
        </tr>
        <tr>
            <td colspan="7" align="center"><b>工作期望</b></td>
        </tr>
        <tr>
            <td colspan="7" height="100"><textarea name="jobDesire" id="aa2">${resume.jobDesire}</textarea></td>
        </tr>
        <tr>
            <td colspan="7" align="center"><b>自我评价</b></td>
        </tr>
        <tr>
            <td colspan="7" height="700">
                <textarea name="selfassessment" id="aa1">${resume.selfassessment}</textarea>

            </td>
        </tr>
        <tr>
            <td>薪资期望:</td>
            <td colspan="6"><input name="salaryExpectation" style="width: 610px" value="${resume.salaryExpectation}"></td>
        </tr>
        <tr>
            <td colspan="3" style="border-right-style: none"></td>
            <td  colspan="3" style="border-left-style: none;border-right-style: none"><input type="button"  value="确认修改" style="width: 150px" id="a1"></td>
            <td style="border-left-style: none"><a href="visitLogin.jsp" ><input type="button"  value="返回主页" style="width: 150px" ></a></td>
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
</style>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#a1").click(function () {
            if(confirm("确认修改？")){
                $("#a2").submit();
            }
        })
    })
</script>
</html>