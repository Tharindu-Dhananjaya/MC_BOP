<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>



<div class="row mt-5">
	<%-- <form:form action="assessment-search.html" method="POST"
		modelAttribute="searcher">
		<div class="col-md-3">

			<div class="form-group">
				<form:select path="ward" cssClass="form-control">
					<form:option value="-1">-Select-</form:option>
					<form:options items="${applicationCategories}"
						itemValue="idapplicationCatagory" itemLabel="applicationName" />
				</form:select>
			</div>
		</div>
	</form:form> --%>
	<div class="col-md-9">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Assessment No</th>
					<th scope="col">Customer Name</th>
					<th scope="col">NIC</th>
					<th scope="col">Mobile</th>
					<th scope="col">Action</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${AssWrapper.assessments}" var="data"
					varStatus="loop">
					<tr>
						<th scope="row">${loop.index+1}</th>
						<td>${data.idassessment}</td>
						<td>${data.customer.cusName }</td>
						<td>${data.customer.cusNic }</td>
						<td>${data.customer.cusMobile}</td>
						<td><a
							onclick="removeSelectedAssessments(${data.idassessment});">remove</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<%-- > --%>
