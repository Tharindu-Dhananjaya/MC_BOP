<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>

<div class="container mt-1">
	<div class="row">
		<div class="col-md-3">
			<form:form action="assessment-search.html" method="POST"
				modelAttribute="searcher">
				<div class="form-group">
				 	<form:select path="ward" cssClass="form-control">
						<form:option value="-1">-Select Ward-</form:option>
						<form:options items="${wards}" itemValue="idward"
							itemLabel="wardName" />
					</form:select> 
				</div>

				<div class="form-group">
					 <form:select path="street" cssClass="form-control">
						<form:option value="-1">-Select Street-</form:option>

						<form:options items="${streets}" itemValue="idstreet"
							itemLabel="streetName" />
					</form:select> 
				</div>

				 <div class="form-group">
					<form:input type="text" cssClass="form-control" id="inputAddress"
						placeholder="Address" path="customerName" />
					<form:errors path="customerName" cssClass="error" />
				</div> 

				 <div class="form-group">
					<form:input type="text" cssClass="form-control" id="assessmentNo"
						placeholder="Assessment No" path="assessmentNo" />
					<form:errors path="customerName" cssClass="error" />
				</div>

				<div class="form-group">
					<form:input type="text" cssClass="form-control" id="customerName"
						placeholder="Customer Name" path="customerName" />
					<form:errors path="customerName" cssClass="error" />
				</div>

				<div class="form-group">
					<form:input type="text" cssClass="form-control" id="nic"
						placeholder="NIC" path="nic" />
					<form:errors path="nic" cssClass="error" />
				</div>
				<button type="submit" class="btn btn-primary">Search</button> 
			</form:form>
			<%--  <form action="assessment-search.html" method="POST">


				<div class="form-group">
					<input type="text" class="form-control" id="inputAddress2"
						placeholder="Apartment, studio, or floor">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="inputAddress2"
						placeholder="Apartment, studio, or floor">
				</div>


			</form>  --%>

		</div>
		<div class="col-md-9">
			<div style="height: 350px; overflow: auto;">
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
						<c:forEach items="${assessments}" var="assessment"
							varStatus="loop">
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
	<div id="selectedAssessmentContent">

		<%@ include file="/WEB-INF/content/bop/selected-assessment-table.jsp"%>
	</div>

	<div class="float-right">
		<a href="bop-application" class="btn btn-primary">Application</a>

	</div>
</div>
</div>
<%@ include file="/WEB-INF/content/common/footer.jsp"%>
<script>
	function populateSelectedAssessments(id) {
		$("#selectedAssessmentContent").html("");
		$.ajax({
			url : 'select-assessment',
			data : {
				"tempId" : id
			},
			success : function(result) {
				$("#selectedAssessmentContent").html(result);
			}
		});
	}
	
	function removeSelectedAssessments(id) {
		$("#selectedAssessmentContent").html("");
		$.ajax({
			url : 'select-assessment-remove',
			data : {
				"tempId" : id
			},
			success : function(result) {
				$("#selectedAssessmentContent").html(result);
			}
		});
	}
</script>