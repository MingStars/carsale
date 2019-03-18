<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/resources/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到兆龙二手车</title>
</head>
<body>
<form method="post" action="login">
	输入用户名：<input type="text" name="username">
	输入密码：<input type="text" name="upassword">
	<input type="submit" value="提交">
</form>
</body>
</html>