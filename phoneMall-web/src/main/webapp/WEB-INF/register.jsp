<%--
  Created by IntelliJ IDEA.
  User: 10191
  Date: 2018/1/28
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>用户注册</title>
    <%@ include file="../parts/header.jsp" %>
    <!-- Custom styles for this template -->
    <link href="../bootstrap-3.3.7-dist/css/signin.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form-signin" method="post" action="/doRegister">
        <h2 class="form-signin-heading">Welcome phoneMall</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input name="username" type="text" id="userName" class="form-control" required autofocus placeholder="用户名">
        <input name="userMail" type="email" id="inputEmail" class="form-control" required autofocus placeholder="邮箱">
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">提交</button>
    </form>
</div> <!-- /container -->
</body>
</html>
