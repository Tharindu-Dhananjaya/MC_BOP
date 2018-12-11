<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<head>
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/styles.css"/>">

</head>

<%@include file="/WEB-INF/content/common/navbar.jsp"%>

<div class="container mt-1">
	<div class="row">

		<form:form action="login" modelAttribute="user" method="POST">
			<table class="table">
				<tbody>
					<tr>
						<th scope="col">user Name</th>
						<td><form:input type="text" path="userUsername"
								cssClass="form-control" /></td>

					</tr>
					<tr>
						<th scope="col">password</th>
						<td><form:input type="password" path="userPassword"
								cssClass="form-control" /></td>

					</tr>
					<tr>

						<td><input type="submit" value="login" class="form-control" /></td>
						<td><c:if test="${not empty authMsg} ">
								authMsg
								</c:if></td>

					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</div>