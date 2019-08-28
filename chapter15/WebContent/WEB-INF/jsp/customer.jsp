<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户信息</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>职业</td>
			<td>电话</td>
		</tr>
		<tr>
			<td>${customer.id }</td>
			<td>${customer.username }</td>
			<td>${customer.jobs }</td>
			<td>${customer.phone }</td>
		</tr>
	</table>
</body>
</html>