<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/6
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="http://localhost:8000/"/>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        td{
            width: 500px;
            height: 50px;
        }
        p{
            width: 120px;
            float: left;
        }
        input{

        }
        #a5{
            background-color: rgba(255, 255, 255, 0.95);
            width: 420px;
            height: 200px;
            border: 1px solid #000000;
            border-radius: 6px;
            padding: 10px;
            margin-top: 15%;
            margin-left: auto;
            margin-right: auto;
            display: block;
        }
    </style>

</head>
<body>
<div id="a5">
<form action="/visiterregister" method="get">
    <table>
        <tr>
            <td><p >用户名:</p><input name="name" width="200px" id="a1" type="text" placeholder="用户名设置成功后不可修改"><nobr id="q1"><c:out value="${msg}"></c:out></nobr></td>
        </tr>
        <tr>
            <td><p>密码:</p><input  name="pass" width="200px" id="a2" placeholder="3-10位字母数字" type="password" onblur="function1()"><nobr id="q2"></nobr></td>
        </tr>
        <tr>
            <td><p >请再次输入密码:</p><input width="200px" id="a3" type="password" onblur="function2()"><nobr id="q3"></nobr></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table></form>
</div>
</body>
<script src="js/jquery-3.2.1.js"></script>
<script>
    $(function () {
        $("#a1").blur(function(){
           $.ajax({
               type:"post",
               url:"visiternamejudge",
               data:{name:$("#a1").val()},
               success:function (obj) {
                   if (obj=="abc"){
                       $("#q1").html("用户名不能为空");
                   }
                    else if(obj=="true"){
                       $("#q1").html("用户名已经注册");
                       $("#a1").val('');
                   }else{
                       $("#q1").html("恭喜你，用户名可以注册")
                   }
               }
           })
        })
    })
    function  function1(){
        var reg=/^[a-zA-Z0-9]{3,10}$/
        var str=document.getElementById("a2").value;

        if(reg.test(str)){
            document.getElementById("q2").innerText="✔";
            document.getElementById("q2").style.color="green"
        }else{
            document.getElementById("q2").innerText="×"
            document.getElementById("q2").style.color="red"
        }
    }
    function function2(){
        var str=document.getElementById("a2").value
        var str2=document.getElementById("a3").value
        if(str==str2){
            document.getElementById("q3").innerText="✔";
            document.getElementById("q3").style.color="green"
        }else{
            document.getElementById("q3").innerText="×"
            document.getElementById("q3").style.color="red"
        }
    }
</script>


</html>
