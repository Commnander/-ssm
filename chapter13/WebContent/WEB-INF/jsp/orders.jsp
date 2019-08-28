<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单查询</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
	订单编号：	<input type="text" name="ordersId"><br>
	所属用户：	<input type="text" name="user.username"><br>
	<input type="submit" value="提交">
	</form>
</body>
</html>