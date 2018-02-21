<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10191
  Date: 2018/2/20
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上架商品查看</title>
    <%@ include file="../../parts/header.jsp" %>
    <!-- Custom styles for this template -->
    <link href="../../bootstrap-3.3.7-dist/css/signin.css" rel="stylesheet">
    <link href="../../bootstrap-3.3.7-dist/css/offcanvas.css" rel="stylesheet">
    <link href="../../bootstrap-3.3.7-dist/css/jquery.dataTables.min.css" rel="stylesheet">
    <script type="text/javascript" src="../../bootstrap-3.3.7-dist/js/jquery.dataTables.min.js"></script>
</head>
<body>
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">PhoneMall</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">

            <ul class="nav navbar-nav">
                <li><a href="/">商城首页</a></li>
                <li><a href="/addSku">手机录入</a></li>
                <li class="active"><a href="/skuList">查看上架手机</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->

<div class="container">
    <div class="row row-offcanvas row-offcanvas-right">
        <table id="skuTable" class="display" cellspacing="0" width="100%">
            <thead>
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>品牌</th>
                <th>定价</th>
                <th>库存</th>
                <th>规格参数</th>
                <th>录入人</th>
                <th>录入时间</th>
                <th>修改人</th>
                <th>修改时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${phoneList}" var="phone">
                <tr>
                    <td>${phone.id}</td>
                    <td>${phone.phoneName}</td>
                    <td>${phone.phoneBrand}</td>
                    <td>${phone.phonePrice}</td>
                    <td>${phone.phoneStock}</td>
                    <td>${phone.phoneConfig}</td>
                    <td>${phone.creator}</td>
                    <td>${phone.created}</td>
                    <td>${phone.operator}</td>
                    <td>${phone.modified}</td>
                    <td class="success"><a href="/updateSku?skuId=${phone.id}">修改</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function(){
        $('#skuTable').DataTable();
    });
</script>
</body>
</html>
