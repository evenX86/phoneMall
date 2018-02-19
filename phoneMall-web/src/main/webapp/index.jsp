<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xuyifei
  Date: 2018/1/13
  Time: 下午3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="zh-CN">
<head>
    <title>手机商城</title>

    <%@ include file="parts/header.jsp" %>
</head>
<style>
    .text-slider .maintitle, .text-slider .subtitle {
        color: #ffffff;
    }

    .header-slider {
        position: relative;
        max-width: 100%;
    }

    .slide-inner {
        position: absolute;
        top: 50%;
        left: 0;
        right: 0;
        text-align: center;
        z-index: 2;
        width: 100%;
        min-height: 260px;
        padding-top: 5px;
        -webkit-transform: translateY(-50%);
        -moz-transform: translateY(-50%);
        -ms-transform: translateY(-50%);
        -o-transform: translateY(-50%);
        transform: translateY(-50%);
    }

    .text-slider {
        position: relative;
        -webkit-animation-duration: 1s;
        animation-duration: 1s;
        -webkit-animation-fill-mode: both;
        animation-fill-mode: both;
        -webkit-animation-name: fadeInRightBig;
        animation-name: fadeInRightBig;
    }

    .text-slider .maintitle {
        position: relative;
        display: inline-block;
        font-size: 57px;
        line-height: 67px;
        font-weight: 700;
        padding-bottom: 10px;
    }

    .text-slider .maintitle, .text-slider .subtitle {
        z-index: 10;
        color: #fff;
        margin: 0;
        letter-spacing: 1px;
        text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.3);
    }

    .roll-button {
        background-color: #d65050;
        border: 1px solid #d65050;
    }

    .roll-button {
        position: relative;
        display: inline-block;
        font-family: "Raleway", sans-serif;
        font-size: 13px;
        line-height: 24px;
        font-weight: 700;
        padding: 12px 35px;
        color: #fff;
        text-transform: uppercase;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        -o-border-radius: 3px;
        border-radius: 3px;
        -webkit-transition: all 0.3s;
        -moz-transition: all 0.3s;
        -ms-transition: all 0.3s;
        -o-transition: all 0.3s;
        transition: all 0.3s;
    }
</style>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">PhoneMall 手机网上商城</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">商城首页</a></li>
                <li><a href="/category">所有手机</a></li>
            </ul>
            <c:choose>
                <c:when test="${user == null}">
                    <form class="navbar-form navbar-right" action="${pageContext.request.contextPath}/doLogin"
                          method="post">
                        <div class="form-group">
                            <input name="username" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <input name="password" type="password" placeholder="Password" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">登录</button>
                        <a href="/register" type="button" class="btn btn-success">注册</a>
                    </form>
                </c:when>
                <c:otherwise>
                    <form class="navbar-form navbar-right">
                        <div class="form-group">
                            <a href="/userInfo"><span class="form-control"> Hello ${user.userName} </span></a>
                            <a href="/logOut"><span class="form-control"> 退出 </span></a>
                        </div>
                    </form>

                </c:otherwise>
            </c:choose>
        </div><!--/.navbar-collapse -->
    </div>
</nav>
<div class="sydney-hero-area" style="height: auto;">
    <div id="slideshow" class="header-slider" data-speed="4000" data-mobileslider="responsive"
         style="position: relative; overflow: hidden; width: 100%; height: 100%;">
        <div class="slides-control" style="position: relative; height: 100%; width: 4518px; left: -1506px;">
            <div class="slides-container"
                 style="margin: 0px; padding: 0px; list-style: none; position: relative; height: 100%;">

                <div class="slide-item"
                     style="display: block; left: 1506px; position: absolute; overflow: hidden; width: 1525px; top: 0px; z-index: 2; opacity: 1;">
                    <img class="mobile-slide preserve"
                         src="bootstrap-3.3.7-dist/img/A9B6C626-FB94-4CB6-102B-E2E293F78C63.jpg">
                    <div class="slide-inner">
                        <div class="contain animated fadeInRightBig text-slider">
                            <h2 class="maintitle">搜索你喜欢的手机型号 </h2>
                            <p class="subtitle">请输入关键词查询</p>
                        </div>
                        <form method="post" action="/search">
                            <input name="keyword" type="text" style="width: 300px;height: 30px;border-style: none none solid none;">
                            <button type="submit" class="btn btn-success">查询</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
