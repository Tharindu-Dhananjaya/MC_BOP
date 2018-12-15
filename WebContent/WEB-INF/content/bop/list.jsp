<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>

<div class="container mt-1">
	<div class="row">
		<div>list</div>
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">BOP No</th>
					<th scope="col">Username</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bops }" var="bop">
					<tr>
						<th scope="row"></th>
						<td>${bop.bopNo }</td>
						<td>${bop.customer.cusName }</td>
						<td><a href="bop-view?tempId=${bop.idbop}"> view</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</div>