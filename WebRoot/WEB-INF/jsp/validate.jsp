<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>
	<body>
		<form:form commandName="emp" action="${pageContext.request.contextPath }/validate/submit">
			姓名：<form:input path="name"/><form:errors path="name"></form:errors> <br/>
			密码：<form:password path="password"/><br/>
			邮箱：<form:input path="email"/><br/>
			年龄：<form:input path="age"/><br/>
			电话：<form:input path="phone"/><br/>
			<form:button>提交</form:button>
			<hr/>
			<form:errors path="*" cssStyle="color:red;"></form:errors>
		</form:form>
	</body>
</html>
