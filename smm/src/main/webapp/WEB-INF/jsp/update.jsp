<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<h1>修改图书</h1>
	<form action="/updateBook">
		<input type="hidden" name="bookId" value="${book.bookId}" />
		书名:<input type="text" name="bookName" value="${book.bookName}" /><br/>
		单价:<input type="text" name="bookPrice" value="${book.bookPrice}" /><br/>
		入藏时间:<input type="date" name="date" value="${date}"><br/>
		<input type="submit" value="update" />
	</form>
</body>
</html>