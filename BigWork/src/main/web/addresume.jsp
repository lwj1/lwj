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
<form action="addresume">
    <table width="700" height="542" border="1"  align="center">
    <caption><h3>个人简历</h3></caption>
    <tr>
        <td width="70px">姓名:</td>
        <td><input name="name" style="width: 150px"></td>
        <td width="70px">性别:</td>
        <td><input name="sex" style="width: 150px"></td>
        <td colspan="2">出生日期:</td>
        <td><input type="date" name="birth" style="width: 150px"></td>


    </tr>
    <tr>
        <td width="70px">年龄:</td>
        <td><input name="age"  style="width: 150px"></td>

        <td width="70px">未婚状况:</td>
        <td><input name="marrige" style="width: 150px"></td>
        <td colspan="2">民族:</td>
        <td><input name="nation" style="width: 150px"></td>
    </tr>
        <tr>
        <td width="70px">联系方式:</td>
        <td><input name="phone" style="width: 150px"></td>
        <td width="70px">工作经验:</td>
        <td><input name="experience" style="width: 150px"></td>
            <td colspan="2">邮箱:</td>
            <td><input name="email" style="width: 150px"></td>
    </tr>
    <tr>
        <td width="70px">学历:</td>
        <td><input name="education" style="width: 150px"></td>

        <td width="70px">专业:</td>
        <td><input name="major" style="width: 150px"></td>
        <td colspan="2">毕业学校:</td>
        <td><input name="graduateSchool" style="width: 150px"></td>
    </tr>
    <tr>
        <td colspan="7" align="center"><b>工作期望</b></td>
    </tr>
    <tr>
        <td colspan="7" height="100"><textarea name="jobDesire" id="aa2" ></textarea></td>
    </tr>
    <tr>
        <td colspan="7" align="center"><b>自我评价</b></td>
    </tr>
    <tr>
        <td colspan="7" height="700">
            <textarea name="selfassessment" id="aa1"></textarea>

        </td>
    </tr>
    <tr>
        <td>薪资期望:</td>
        <td colspan="6"><input name="salaryExpectation" style="width: 610px"></td>
    </tr>
     <tr>
         <td colspan="3" style="border-right-style: none"></td>
         <td  colspan="3" style="border-left-style: none;border-right-style: none"><input type="submit" type="number" value="提交" style="width: 150px"></td>
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
</html>
