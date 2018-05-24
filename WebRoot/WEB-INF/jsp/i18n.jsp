<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title><fmt:message key="a"></fmt:message></title>
	</head>
	<body>
		${a }<br/>
		<fmt:message key="a"></fmt:message>
		
		<hr/>
		
		<form action="#">
			<fmt:message key="b"></fmt:message><input type="text" name="username"/><br/>
			<fmt:message key="c"></fmt:message><input type="password" name="password"/><br/>
			<input type="submit" value='<fmt:message key="a"></fmt:message>'/>
		</form>
		
		<hr/>
		
		<form action="#">
			<spring:message code="b"></spring:message><input type="text" name="username"/><br/>
			<spring:message code="c"></spring:message><input type="password" name="password"/><br/>
			<input type="submit" value='<spring:message code="a"></spring:message>'/>
		</form>
	</body>
</html>
