<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询图书信息</title>
</head>
<body>
	<h1>查询图书</h1>
	<form action="/toAdd">
		<button type="submit">添加</button>
	</form>
	<table border="1">
    <tr>
        <td>bookId</td>
        <td>bookName</td>
        <td>bookPrice</td>
        <td>date</td>
        <td colspan="2">operate</td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookPrice}</td>
            <td><fmt:formatDate value="${book.date}" pattern="yyyy年MM月dd日" /></td>
            <td><a href="/toUpdate?bookId=${book.bookId}">update</a></td>
            <td><a href="/deleteBook?bookId=${book.bookId}">del</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>