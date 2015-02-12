<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="food.title" /></title>
</head>
<body>
<center>
<h1><spring:message code="food.title" /></h1>
<Div Align="left"><BUTTON type="button">戻る</BUTTON></Div>
<table border="5px" style="width: 481px; ">
<tbody>
<tr>
<th>前菜</th>
<td>前菜の名前</td>
<td>画像①</td>
</tr>
<tr>
<th>スープ</th>
<td>スープの名前</td>
<td>画像②</td>
</tr>
<tr>
<th>メインディッシュ</th>
<td>メインディッシュの名前</td>
<td>画像③</td>
</tr>
<tr>
<th>デザート</th>
<td>デザートの名前</td>
<td>画像④</td>
</tr>
</tbody>
</table>
</center>
</body>
</html>