<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="title.top" /></title>
</head>
<body>
	<h1><spring:message code="title.top" /></h1>
	<form:form modelAttribute="weddingForm" method="POST">
		<table>
			<tr>
				<td>
					<spring:bind path="weddingInfo.husbandInfo.name">${status.value}</spring:bind>
					<spring:message code="common.title" />
				</td>
			</tr>
			<tr>
				<td>
					<spring:bind path="weddingInfo.wifeInfo.name">${status.value}</spring:bind>
					<spring:message code="common.title" />
				</td>
			</tr>
		</table>
			<tr>
				<button type="submit" name="_participate">
					<spring:message code="button.participate" />
				</button>
			</tr>
			<tr>
				<button type="submit" name="_foodmenu">
					<spring:message code="button.foodmenu" />
				</button>
			</tr>
			<tr>
				<button type="submit" name="_introduction">
					<spring:message code="button.introduction" />
				</button>
			</tr>
			<tr>
				<button type="submit" name="_hall">
					<spring:message code="button.hall" />
				</button>
			</tr>
	</form:form>
</body>
</html>