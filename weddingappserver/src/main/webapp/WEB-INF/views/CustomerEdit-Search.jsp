<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="customerEdit.title" /></title>
</head>
<body>
	<h1><spring:message code="customerEdit-search.title" /></h1>
	<form:form modelAttribute="customerEditForm" method="POST">
		<table>
			<tr>
				<th><spring:message code="customerEdit-search.customerNo" /><br></th>
				<td><form:input path="customerNo" cssStyle="text-align:right;"></form:input></td>
			</tr>
		</table>
		<button type="submit" name="_search">
			<spring:message code="common.search" />
		</button>
	</form:form>
</body>
</html>