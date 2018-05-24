<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	</head>
	<body>
		<form:form commandName="formCommand" action="${pageContext.request.contextPath }/form/submit">
			文本框：<form:input path="t"/><br/>
			
			密码框：<form:password path="p" showPassword="true"/><br/>
			
<!-- 			隐藏表单 -->
			<form:hidden path="h"/>
			
			文本域：<form:textarea path="ta" rows="5" cols="20"/><br/>
			
			复选框：<form:checkbox path="c" value="1" label="aaa"/>
				  <form:checkbox path="c" value="2" label="bbb"/>
				  <form:checkbox path="c" value="3" label="ccc"/><br/>
			
<!-- 				  <form:checkboxes items="${map }" path="cs"/><br/> -->
	  			  <form:checkboxes items="${map }" path="cs" element="div"/><br/>
				  
				  <form:checkboxes items="${users }" path="us" itemLabel="username" itemValue="id"/><br/>
				  
			单选按钮：<form:radiobutton path="r" value="1" label="aaa"/>
					<form:radiobutton path="r" value="2" label="bbb"/>
					<form:radiobutton path="r" value="3" label="ccc"/><br/>
					
					<form:radiobuttons path="rs" items="${map }"/><br/>
					
					<form:radiobuttons path="us2" items="${users }" itemLabel="username" itemValue="id"/><br/>
			
			下拉列表：<form:select path="s">
						<form:option value="1" label="aaa"></form:option>
						<form:option value="2" label="bbb"></form:option>
						<form:option value="3" label="ccc"></form:option>
					</form:select><br/>
				  
				  	<form:select path="ss" items="${map }"></form:select><br/>
				  
				  	<form:select path="ss2">
				  		<form:options items="${map }"/>
				  	</form:select><br/>
				  	
<!-- 				  	<form:select path="us3" items="${users }" itemLabel="username" itemValue="id"></form:select><br/> -->
				  	<form:select path="us3">
				  		<form:option value="-1" label="---请选择---"></form:option>
				  		<form:options items="${users }" itemLabel="username" itemValue="id"/>
				  	</form:select><br/>
				  
			<form:button>提交</form:button>
			
		</form:form>
	</body>
</html>








