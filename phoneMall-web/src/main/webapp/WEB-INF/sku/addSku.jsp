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
    <style>
        body {
            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
            padding-bottom: 10px;
        }

        .form-horizontal .control-group {
            margin-bottom: 18px;
        }

        .popover-content form {
            margin: 0 auto;
            width: 213px;
        }
        .popover-content form .btn{
            margin-right: 10px
        }
        .form-horizontal .control-label {
            float: left;
            width: 140px;
            padding-top: 5px;
            text-align: right;
        }
        .form-horizontal .controls {
            margin-left: 160px;
        }
        .form-horizontal .help-block {
            margin-top: 9px;
            margin-bottom: 0;
        }
    </style>
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
        <form class="form-horizontal" method="post" action="/saveSku">
            <fieldset>
                <div id="legend" class="">
                    <legend class="">手机SKU录入</legend>
                </div>
                <div class="control-group">

                    <!-- Text input-->
                    <label class="control-label" for="input01">手机名</label>
                    <div class="controls">
                        <input name="skuName" type="text" placeholder="小米5" class="input-xlarge" id="input01">
                        <p class="help-block">手机名称</p>
                    </div>
                </div><div class="control-group">

                <!-- Text input-->
                <label class="control-label" for="input02">手机品牌</label>
                <div class="controls">
                    <input name="skuBrand" type="text" placeholder="小米" class="input-xlarge" id="input02">
                    <p class="help-block">输入手机品牌</p>
                </div>
            </div>

                <div class="control-group">

                    <!-- Select Basic -->
                    <label class="control-label">运行内存</label>
                    <div class="controls">
                        <select name="skuRam" class="input-xlarge">
                            <option value="1">2G以下</option>
                            <option value="2">2G</option>
                            <option value="3">3G</option>
                            <option value="4">4G</option>
                            <option value="5">6G</option>
                            <option value="6">8G</option></select>
                    </div>

                </div><div class="control-group">

                <!-- Select Basic -->
                <label class="control-label">机身内存</label>
                <div class="controls">
                    <select name="skuRom" class="input-xlarge">
                        <option value="1">8G以下</option>
                        <option value="2">8G</option>
                        <option value="3">16G</option>
                        <option value="4">32G</option>
                        <option value="5">64G</option>
                        <option value="6">128G</option>
                        <option value="7">256G</option></select>
                </div>

            </div><div class="control-group">

                <!-- Select Basic -->
                <label class="control-label">屏幕尺寸</label>
                <div class="controls">
                    <select class="input-xlarge" name="screenSize">
                        <option value="1">5.5-5.1英寸</option>
                        <option value="2">5.6英寸及以上</option>
                        <option value="3">5.0-4.6英寸</option>
                        <option value="4">3.0英寸及以下</option>
                        <option value="5">4.5-3.1英寸</option>
                    </select>
                </div>

            </div><div class="control-group">

                <!-- Text input-->
                <label class="control-label" for="input01">价格</label>
                <div class="controls">
                    <input name="phonePrice" type="text" placeholder="1000.00" class="input-xlarge">
                    <p class="help-block">手机价格</p>
                </div>
            </div>

                <div class="control-group">

                    <!-- Text input-->
                    <label class="control-label" for="input01">库存</label>
                    <div class="controls">
                        <input name="skuStock" type="text" placeholder="100" class="input-xlarge">
                        <p class="help-block">手机库存</p>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label">手机图片</label>

                    <!-- File Upload -->
                    <div class="controls">
                        <input name="skuPic" class="input-file" id="fileInput" type="file">
                    </div>
                </div>
            </fieldset>
            <button type="submit" class="btn btn-success">提交</button>
        </form>
    </div><!--/row-->
    <hr>
    <footer>
        <p>&copy; PhoneMall 2018</p>
    </footer>

</div><!--/.container-->

</body>
</html>
