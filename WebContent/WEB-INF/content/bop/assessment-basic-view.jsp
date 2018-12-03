<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>

<div class="container mt-1">
	<div class="row">
		<div style="height: 200px; overflow: auto;">
			<table class="table">
				<thead class="thead-light">
					<tr>
						<th scope="col">#</th>
						<th scope="col">Assessment No</th>
						<th scope="col">Customer Name</th>
						<th scope="col">NIC</th>
						<th scope="col">Mobile</th>
						<th scope="col">select</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${assessments}" var="assessment" varStatus="loop">
						<tr>
							<th scope="row">${loop.index+1}</th>
							<td>${assessment.assessmentNo}</td>
							<td>${assessment.customer.cusName}</td>
							<td>${assessment.customer.cusNic}</td>
							<td>${assessment.customer.cusMobile}</td>
							<td><a
								onclick="populateSelectedAssessments(${assessment.idassessment});">select</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</div>