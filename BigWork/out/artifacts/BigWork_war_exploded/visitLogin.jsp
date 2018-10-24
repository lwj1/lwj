<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19
  Time: 17:05
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
<c:if test="${empty resume}">
    <div style="text-align: right">你好,<a href="addresume.jsp">添加一份简历</a> </div>
</c:if>
<c:if test="${not empty resume}">
    <div style="text-align: right"><a href="resumefind">查看或修改我的简历</a></div>
</c:if>
<div style="text-align: right"><a href="getrecruitmentbyresid">查看我的投递</a></div>
<h3 style="text-align: center">欢迎来到陈俊汽车金融公司</h3>

<div>
    <div id="a1">
        <div class="item">公司简介</div>
        <div class="item">陈俊汽车金融、是中国第一家外商全资汽车金融公司，自2004年9月正式在中国营业以来，陈俊汽车金融一直致力于为中国的广大汽车消费者提供先进的汽车金融产品和高质量的服务。因此，陈俊汽车金融与陈俊汽车集团的合作经销商建立了非常积极、紧密的合作关系。陈俊汽车金融（中国）有限公司积极地推广与发展业务，通过陈俊汽车集团经销商网络促进了兰博基尼、斯柯达，法拉利，奥迪和陈俊进口汽车的在华销售。
        </div>
    </div>
    <div>
        <div class="item">招聘信息</div>
        <div class="item">公司有扎实经济基础的社会精英成功人士，展望未来，人正以不断：务实创新，诚信经营，经营理念;期待与您携手共创，美好明天。</div>
    </div>
        <div class="item">
            <c:forEach items="${sessionScope.recInfo}" var="i">
                <table >

                    <div class="tit">基本信息</div>
                    <div class="itemli"><span>职业名称</span>${i.posName}</div>
                    <div class="itemli"><span>工作性质</span>${i.jobFunction}</div>
                    <div class="itemli"><span>招聘人数</span>${i.number}</div>
                    <div class="clear"></div>
                    <div class="itemli"><span>学历要求</span>${i.educationRequire}</div>
                    <div class="itemli"><span>工作经验</span>${i.experienceRequire}</div>
                    <div class="itemli"><span>性别要求</span>${i.sexRequire}</div>
                    <div class="clear"></div>
                    <div class="itemli"><span>年龄要求</span>${i.ageRequire}</div>
                    <div class="clear"></div>
                    <div class="add"><span>工作地点</span>${i.jobAddress}</div>
                    <div class="clear"></div>
                    <div class="end"><a href="addrecruitment?resid=${resume.id}&RecruitmentInfoNo=${i.id}">我要投递</a></div>
                </table>
                <div class="clear"></div>
                <hr>
            </c:forEach>
        </div>
    <div class="r">
        <div></div>
        <div class="info"><h3></h3></div>
            <div class="info"><span>性质</span>民营</div>
            <div class="info"><span>行业</span>金融</div>
            <div class="info"><span>规模</span>100-199人</div>
            <div class="info"><span>地区</span>上海</div>
            <div class="info"><span>网址</span>www.xxxxx.com</div>
        </div>



    </div>



</div>
</body>
<style>
    #a1{
        margin-left: auto;
        margin-right: auto;
    }
    .item .itemli{
        float: left;
        width: 200px;
        height: 36px;
        line-height: 36px;
        color: #333333;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        padding-right: 15px;
    }
    .item {
        padding-left: 40px;
        padding-top: 15px;
        padding-bottom: 15px;
        position: relative;
        float: left;
        width: 880px;
    }
    span{
        padding-right: 15px;
        color: #999999;
    }
    .item .tit {
        margin-left: -18px;
        border-left: 3px #FF6600 solid;
        padding-left: 15px;
        font-size: 18px;
        color: #333333;
        height: 18px;
        line-height: 18px;
        margin-bottom: 20px;
    }
    .item .add {
        float: left;
        height: 36px;
        line-height: 36px;
        color: #333333;
        padding-right: 10px;
    }
    .item .end{
        float: right;
        width: 200px;
        height: 36px;
        line-height: 36px;
        color: #333333;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        padding-right: 15px;
    }
    .clear {

        clear: both;
        height: 0px;
        font-size: 0px;
        line-height: 0px;

    }
     .r {
        float: left;
        width: 320px;
    }
</style>
</html>
