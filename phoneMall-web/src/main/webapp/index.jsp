<%--
  Created by IntelliJ IDEA.
  User: xuyifei
  Date: 2018/1/13
  Time: 下午3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>手机商城</title>

    <%@ include file="parts/header.jsp" %>
</head>
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">PhoneMall 手机网上商城</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" action="${pageContext.request.contextPath}/doLogin" method="post">
                <div class="form-group">
                    <input name="username" type="text" class="form-control">
                </div>
                <div class="form-group">
                    <input name="password" type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">登录</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>
</body>
</html>
