<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'form.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function _hyz() {
		/*
		1. 获取<img>元素
		2. 给它的src指向为/tools/VerifyCodeServlet
		*/
		var img = document.getElementById("imgVerifyCode");
		// 需要给出一个参数，这个参数每次都不同，这样才能干掉浏览器缓存！
		img.src = "/tools/VerifyCodeServlet?a=" + new Date().getTime();
	}
</script>
  </head>
  
  <body>
<%--
1. 写表单，其中包含图片（验证码）
2. 让图片显示出来：
　　把<img>的src指向VerifyCodeServlet，你需要在web.xml中部署VerfiyCodeServlet
3. 换一张
--%>
<form action="/tools/LoginServlet" method="post">
	<%-- 添加一个参数：method=login --%>
	<input type="hidden" name="method" value="login">
用户名：<input type="text"  name="name"/><br/>
密　码：<input type="password" name="pwd"/><br/>
验证码：<input type="text" name="verifyCode"/><br/>
<img src="/tools/VerifyCodeServlet" id="imgVerifyCode"/>
<a href="javascript:_hyz()">换一张</a>
<br/>
<input type="submit" value="提交"/>
</form>
  </body>
</html>
