<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="title.login" /></title>
</head>
<body>
	<h1><spring:message code="title.login" /></h1>
	<form:form modelAttribute="weddingForm" method="POST">
		<table>
			<tr>
				<th><spring:message code="item.userId" /><br></th>
				<td><form:input path="userId" cssStyle="text-align:right;"></form:input></td>
			</tr>
			<tr>
				<th><spring:message code="item.password" /><br></th>
				<td><form:input path="password" cssStyle="text-align:right;" type="password"></form:input></td>
			</tr>
		</table>
		<button type="submit" name="_login">
			<spring:message code="button.login" />
		</button>
	</form:form>
</body>
</html>