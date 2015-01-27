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
					<spring:bind path="weddingInfo.husband">${status.value}</spring:bind>
					<spring:message code="common.title" />
				</td>
			</tr>
			<tr>
				<td>
					<spring:bind path="weddingInfo.wife">${status.value}</spring:bind>
					<spring:message code="common.title" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>