<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="introduction.title" /></title>
</head>
<body>

<center>
<h1><spring:message code="introduction.title" /></h1>
<Div Align="left"><BUTTON type="submit"name="_back">戻る</BUTTON></Div>
<form:form modelAttribute="weddingForm" method="POST">
<table border="5px">
<tbody>
<tr>
<th>旦那の画像</th>
<td></td>
<td>妻の画像</td>
</tr>
<tr>
<th><spring:bind path="weddingInfo.husbandInfo.name">${status.value}</spring:bind></th>
<td><center>名前</center></td>
<td><spring:bind path="weddingInfo.wifeInfo.name">${status.value}</spring:bind></td>
</tr>
<tr>
<th><spring:bind path="weddingInfo.husbandInfo.birthday">${status.value}</spring:bind></th>
<td><center>生年年月日</center></td>
<td><spring:bind path="weddingInfo.wifeInfo.birthday">${status.value}</spring:bind></td>
</tr>
<tr>
<th><spring:bind path="weddingInfo.husbandInfo.hobby">${status.value}</spring:bind></th>
<td><center>趣味</center></td>
<td><spring:bind path="weddingInfo.wifeInfo.hobby">${status.value}</spring:bind></td>
</tr>
</tbody>
</table>
</form:form>
</center>
</body>
</html>