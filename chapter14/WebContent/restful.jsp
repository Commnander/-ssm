<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript">
	function search(){
		var id=$("#number").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/user/"+id,
			type:"GET",
			 //定义回调响应的数据格式为json字符串，该属性可以省略
			 dataType:"json",
			 success:function(data){
				 if(data.username!=null){
					 alert("您查询的用户是："+data.username);
				 }else{
					 alert("没有找到id为"+id+"的用户");
				 }
			 }
		});
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form >
		编号：<input type="text" name="number" id="number"><br>
		<input type="button" value="搜索" onclick="search()">
	</form>
</body>

</html>