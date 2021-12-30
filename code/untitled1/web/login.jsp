<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<div class="row">
    <div class="col-md-3">

    </div>
    <div class="panel panel-default col-md-6" style="padding: 30px">
        <span>${msg}</span>
        <!-- Default panel contents -->
        <form action="/login">
            <input type="hidden" name="id">
            <div class="form-group">
                <label for="username">账号</label>
                <input type="text" id="username" name="username"  class="form-control" placeholder="账号">
            </div>
            <div class="form-group">
                <labuo for="password">密码</labuo>
                <input type="password" id="password" name="password"  class="form-control" placeholder="密码">
            </div>
            <button type="submit " class="btn btn-default">登录</button>
            <a href="/to_register"> <button type="button"  class="btn btn-default">注册</button></a>
        </form>
    </div>
    <div class="col-md-3">

    </div>
</div>

<script>

</script>
</body>
</html>