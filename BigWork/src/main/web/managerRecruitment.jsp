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
    <script src="js/jquery-3.2.1.js"></script>
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
    <script type="text/javascript">
        $(document).ready(function () { //这个就是传说的ready
            $(".t1 tr").mouseover(function () {
                //如果鼠标移到class为stripe的表格的tr上时，执行函数
                $(this).addClass("over");
            }).mouseout(function () {
                //给这行添加class值为over，并且当鼠标一出该行时执行函数
                $(this).removeClass("over");
            }) //移除该行的class
            $(".t1 tr:even").addClass("alt");
            //给class为stripe的表格的偶数行添加class值为alt
        });
        $(function () {
            $("#a1").click(function () {
                $.ajax({
                    type:"post",
                    url:"comfirminterview",
                    data:{res_id:$("#a1").val},
                    success:function (obj) {
                        alert(obj)
                        window.location.reload()
                    }
                })
            })
            $("#b1").click(function () {
                $.ajax({
                    type:"post",
                    url:"addStaff",
                    data:{resumeid:$(this).next().val(),recinfoid:$(this).next().next().val()
                        ,recruitmentid:$(this).next().next().next().val(),salary:$(this).parent().next().children().val()},
                    success:function (obj) {
                        alert(obj)
                        window.location.href="getallrecruitment"
                    }
                })
            })
        })

    </script>

</head>
<body>
${recruitmentjudge}
<form id="form1" runat="server">
    <c:if test="${not empty allRecruitment}">
        <table width="100%" id="ListArea" border="0" class="t1" align="center" cellpadding="0"
               cellspacing="0">
            <tr align="center">
                <th>
                    职位名称
                </th>
                <th>
                    简历
                </th>
                <th>
                    状态
                </th>
                <th>
                    面试状态
                </th>
                <th>
                    是否录用
                </th>
                <th>
                    薪资
                </th>
            </tr>
            <c:forEach items="${sessionScope.allRecruitment}" var="i">
                <tr align="center">

                    <td>
                            ${i.posname}
                    </td>
                    <td>
                           <a href="getResumeById?id=${i.id}&recid=${i.resid}">${i.resid}</a>
                    </td>
                    <td>
                        <c:if test="${i.readState==0}">
                            未读
                        </c:if>
                        <c:if test="${i.readState!=0}">
                            已读
                        </c:if>
                    </td>
             <td>
                 <c:if test="${empty i.interviewTime}">
                 <a href="managerinvite?id=${i.id}">邀请面试</a>
                 </c:if>
                 <c:if test="${not empty i.interviewTime}">


                 <c:if test="${i.comfirm==0}">
                     已邀请面试,用户还未确认
                 </c:if>
                     <c:if test="${i.comfirm==1}">
                     用户已确认面试
                     </c:if>
                     </c:if>

                    <td>
                    <c:if test="${i.comfirm==1}">
                        <c:if test="${i.employ==0}">
                    <input type="button" value="录用" id="b1">
                            <input type="hidden" value="${i.resid}">
                            <input type="hidden" value="${i.recruitmentInfoNo}">
                            <input type="hidden" value="${i.id}">
                     </c:if>
                     <c:if test="${i.employ==1}">
                         已录用
                     </c:if>
                 </c:if>
             </td>
                    <td>   <c:if test="${i.comfirm==1}">
                        <c:if test="${i.employ==0}">
                            <input  type="text" id="c6">
                        </c:if>
                    </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</form>
<div style="text-align: right"><a href="managerindex.jsp">返回上一级</a></div>
</body>
</html>