<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<form >
		用户名：<input type="text" name="username" id="username"><br>
		密码：<input type="password" name="password" id="password"><br>
		<input type="button" value="json测试" onclick="testJson()">
	</form>
</body>
<script type="text/javascript">
	function testJson(){
		var username=$("#username").val();
		var password=$("#password").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/testJson",
			type:"post",
			//data为发送的数据
			data:JSON.stringify({username:username,password:password}),
			 //定义发送请求的格式为json串
			 contentType:"application/json;charset=utf-8",
			 //定义回调响应的数据格式为json字符串，该属性可以省略
			 dataType:"json",
			 success:function(data){
				 if(data!=null){
					 alert(data.username+"  "+data.password);
				 }
			 }
		});
	}
</script>
</html>