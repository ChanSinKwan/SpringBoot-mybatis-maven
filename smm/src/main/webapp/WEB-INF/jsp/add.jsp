<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加图书</title>
</head>
<body>
	<h1>添加图书</h1>
	<form action="/addBook">
	书名:<input type="text" name="bookName" /><br/>
	单价:<input type="text" name="bookPrice" /><br/>
	入藏时间:<input type="date" name="date"><br/>
	<input type="submit" value="add" />
	</form>
</body>
</html>