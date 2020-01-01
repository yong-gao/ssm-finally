<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<a href = '/message/go'>我要跳转了。。。</a>
<div>
    用户名<input type="text" id="userName" name="userName"/>
    <input type="button" value="查找用户" onclick="Search()"/>
</div>

<script>
    function Search() {
        window.open("/message/detail/data="+document.getElementById("userName").value);
    }
</script>
</body>
</html>
