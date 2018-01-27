<%--
  Created by IntelliJ IDEA.
  User: 10191
  Date: 2018/1/28
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%@ include file="../../parts/header.jsp" %>
    <!-- Custom styles for this template -->
    <link href="../../bootstrap-3.3.7-dist/css/signin.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form-signin">
        <h2 class="form-signin-heading">注册</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">提交</button>
    </form>
</div> <!-- /container -->
</body>
</html>
