<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/editUsers" method="post">
		<table width="20%" border=1>
			<tr>
				<td>选择</td>
				<td>用户名</td>
			</tr>
			<tr>
				<td><input name="users[0].id" value="1" type="checkbox"></td>
				<td><input name="users[0].username" value="tom" type="text"></td>
			</tr>
			<tr>
				<td><input name="users[1].id" value="2" type="checkbox"></td>
				<td><input name="users[1].username" value="jack" type="text"></td>
			</tr>
			<tr>
				<td><input name="users[2].id" value="3" type="checkbox"></td>
				<td><input name="users[2].username" value="lucy" type="text"></td>
			</tr>
		</table>
		<input type="submit" value="修改">
	</form>
</body>
</html>