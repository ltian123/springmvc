<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>
	<body>
		<form:form action="${pageContext.request.contextPath }/binder/submit" commandName="binderCommand">
			用户名：<form:input path="username"/><br/>
			
			坐标：<form:input path="point.x"/>
				 <form:input path="point.y"/><br/>
				 
			坐标：<form:input path="p"/><form:errors path="p"></form:errors><br/>
			
			生日：<form:input path="birthday"/><br/>
			
			地址：<form:input path="address"/><br/>
			
			<form:button>提交</form:button>
			
			<hr/>
			
			<form:errors path="p"></form:errors>			
			
			<hr/>
			
			<form:errors path="*"></form:errors>
			
			<hr/>
			
			<form:errors path="*" cssStyle="color:red;"></form:errors>
			
		</form:form>
	</body>
</html>
