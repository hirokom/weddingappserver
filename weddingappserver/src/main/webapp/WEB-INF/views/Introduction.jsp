<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
<h1><spring:message code="food.title" /></h1>
<Div Align="left"><BUTTON type="button">戻る</BUTTON></Div>
<table border="5px">
<tbody>
<tr>
<th>旦那の画像</th>
<td></td>
<td>妻の画像</td>
</tr>
<tr>
<th>旦那名前</th>
<td><center>名前</center></td>
<td>妻名前</td>
</tr>
<tr>
<th>旦那生年月日</th>
<td><center>生年年月日</center></td>
<td>妻生年月日</td>
</tr>
<tr>
<th>旦那趣味</th>
<td><center>趣味</center></td>
<td>妻趣味</td>
</tr>
</tbody>
</table>
</center>
</body>
</html>