<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label>CONTACTS DETAILS:</label>
	<table>
		<c:forEach items="${contacts.contactInfo}" var="contacts">
			<tr>
				<td><c:out value="${contacts.contactFirstName }" /></td>
				<td><c:out value="${contacts.contactLastName}" /></td>
				<td><c:out value="${contacts.contactEmailAddress}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>