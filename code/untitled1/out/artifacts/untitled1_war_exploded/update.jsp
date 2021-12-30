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
    <div class="col-md-6">
        <div class="panel panel-default" style="padding: 30px">
            <form action="/do_update">

                <!-- Table -->
                <input type="hidden" name="id" value="${book.id}">
                <div class="form-group">
                    <label for="book_name">书名</label>
                    <input type="text" id="book_name" name="book_name"  value="${book.bookName}" class="form-control" placeholder="书名">
                </div>
                <div class="form-group">
                    <labuo for="writer">作者</labuo>
                    <input type="text" id="writer" name="writer" value="${book.writer}"  class="form-control" placeholder="作者">
                </div>
                <button class="btn btn-default">提交</button>
            </form>
        </div>

    </div>
    <div class="col-md-3">

    </div>
</div>
</body>
</html>