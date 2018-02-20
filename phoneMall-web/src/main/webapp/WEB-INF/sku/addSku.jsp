<%--
  Created by IntelliJ IDEA.
  User: 10191
  Date: 2018/2/20
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机信息录入</title>
    <%@ include file="../../parts/header.jsp" %>
    <!-- Custom styles for this template -->
    <link href="../../bootstrap-3.3.7-dist/css/signin.css" rel="stylesheet">
    <link href="../../bootstrap-3.3.7-dist/css/offcanvas.css" rel="stylesheet">
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
                <li class="active"><a href="/addSku">手机操作</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->
<div class="container">
    <div class="row row-offcanvas row-offcanvas-right">
        <form class="form-horizontal">
            <fieldset>
                <div id="legend" class="">
                    <legend class="">手机SKU录入</legend>
                </div>
                <div class="control-group">

                    <!-- Text input-->
                    <label class="control-label" for="input01">手机名</label>
                    <div class="controls">
                        <input type="text" placeholder="小米5" class="input-xlarge">
                        <p class="help-block">手机名称</p>
                    </div>
                </div><div class="control-group">

                <!-- Text input-->
                <label class="control-label" for="input01">手机品牌</label>
                <div class="controls">
                    <input type="text" placeholder="小米" class="input-xlarge">
                    <p class="help-block">输入手机品牌</p>
                </div>
            </div>

                <div class="control-group">

                    <!-- Select Basic -->
                    <label class="control-label">运行内存</label>
                    <div class="controls">
                        <select class="input-xlarge">
                            <option>2G以下</option>
                            <option>2G</option>
                            <option>3G</option>
                            <option>4G</option>
                            <option>6G</option>
                            <option>8G</option></select>
                    </div>

                </div><div class="control-group">

                <!-- Select Basic -->
                <label class="control-label">机身内存</label>
                <div class="controls">
                    <select class="input-xlarge">
                        <option>8G以下</option>
                        <option>8G</option>
                        <option>16G</option>
                        <option>32G</option>
                        <option>64G</option>
                        <option>128G</option>
                        <option>256G</option></select>
                </div>

            </div><div class="control-group">

                <!-- Select Basic -->
                <label class="control-label">屏幕尺寸</label>
                <div class="controls">
                    <select class="input-xlarge">
                        <option>5.5-5.1英寸</option>
                        <option>5.6英寸及以上</option>
                        <option>5.0-4.6英寸</option>
                        <option>3.0英寸及以下</option>
                        <option>4.5-3.1英寸</option></select>
                </div>

            </div><div class="control-group">

                <!-- Text input-->
                <label class="control-label" for="input01">价格</label>
                <div class="controls">
                    <input type="text" placeholder="1000.00" class="input-xlarge">
                    <p class="help-block">手机价格</p>
                </div>
            </div>

                <div class="control-group">

                    <!-- Text input-->
                    <label class="control-label" for="input01">库存</label>
                    <div class="controls">
                        <input type="text" placeholder="100" class="input-xlarge">
                        <p class="help-block">手机库存</p>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">手机图片</label>

                    <!-- File Upload -->
                    <div class="controls">
                        <input class="input-file" id="fileInput" type="file">
                    </div>
                </div>
            </fieldset>
        </form>
    </div><!--/row-->
    <hr>
    <footer>
        <p>&copy; PhoneMall 2018</p>
    </footer>

</div><!--/.container-->

</body>
</html>