<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("a").click(function(){
					$("#codeImage").attr("src","${pageContext.request.contextPath }/code/getImage?a="+new Date().getTime());
				});
				
				$("#code").blur(function(){
					$.ajax({
						url:"${pageContext.request.contextPath}/code/validateCode",
						data:{"code":$(this).val()},
						type:"POST",
						success:function(message){
							$("#codeMessage").text(message);
						}
					});
				});
			});		
		</script>
	</head>
	<body>
		<a href="javascript:;"><img id="codeImage" src="${pageContext.request.contextPath }/code/getImage"></a>
		<a href="javascript:;">换一张</a>
		<input type="text" name="code" id="code" size="5"/>
		<span id="codeMessage"></span>
	</body>
</html>
