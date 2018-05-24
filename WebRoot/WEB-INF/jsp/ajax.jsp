<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#username").blur(function(){
					$.post("${pageContext.request.contextPath}/ajax/getString",
							{"username":$(this).val()},
							function(message){
								$("#usernameMessage").text(message);
							});
				});
				
				$("#show").click(function(){
					$.getJSON("${pageContext.request.contextPath}/ajax/getUser",
							  function(user){
							  	$("#id").text(user.id);
							  	$("#name").text(user.name);
							  	$("#password").text(user.password);
							  	$("#phone").text(user.phone);
							  	$("#age").text(user.age);
							  });
				});
			});
		</script>
	
	</head>
	<body>
		用户名：<input id="username" type="text" name="username"/>
		<span id="usernameMessage"></span>
		
		<hr/>
		
		<a href="javascript:;" id="show">显示数据</a>
		
		<hr/>
		
		编号：<div id="id" style="display: inline;"></div><br/>
		用户：<div id="name" style="display: inline;"></div><br/>
<!-- 		密码：<div id="password" style="display: inline;"></div><br/> -->
		电话：<div id="phone" style="display: inline;"></div><br/>
		年龄：<div id="age" style="display: inline;"></div><br/>
		
		
		
		
		
		
		
	</body>
</html>
