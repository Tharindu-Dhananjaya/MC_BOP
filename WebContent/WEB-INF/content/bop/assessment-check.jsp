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
				id="assessmentFormSearch" modelAttribute="searcher">
				<div class="form-group">
					<form:select path="ward" cssClass="form-control" id="wardSelector">
						<form:option value="-1">-Select Ward-</form:option>
						<form:options items="${wards}" itemValue="idward"
							itemLabel="wardName" />
					</form:select>
				</div>

				<div class="form-group">
					<form:select path="street" cssClass="form-control"
						id="streetSelector">
						<form:option value="-1">-Select Street-</form:option>

						<form:options items="${streets}" itemValue="idstreet"
							itemLabel="streetName" />
					</form:select>
				</div>

				<%-- <div class="form-group">
				<form:input type="text" cssClass="form-control" id="Input"
					placeholder="Address" path="customerName" />
				<form:errors path="customerName" cssClass="error" />
			</div> --%>

				<div class="form-group">
					<form:input type="text" cssClass="form-control"
						id="assessmentNoInput" placeholder="Assessment No"
						path="assessmentNo" />
					<form:errors path="customerName" cssClass="error" />
				</div>

				<div class="form-group">
					<form:input type="text" cssClass="form-control"
						id="customerNameInput" placeholder="Customer Name"
						path="customerName" />
					<form:errors path="customerName" cssClass="error" />
				</div>

				<div class="form-group">
					<form:input type="text" cssClass="form-control" id="nicInput"
						placeholder="NIC" path="nic" />
					<form:errors path="nic" cssClass="error" />
				</div>
				<!-- <button type="submit" class="btn btn-primary">Search</button> -->
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
		<div id="assessmentSercher" class="col-md-9">
			<%@ include file="/WEB-INF/content/bop/assessment-searcher.jsp"%>
		</div>
	</div>




	<div id="selectedAssessmentContent">

		<%@ include file="/WEB-INF/content/bop/selected-assessment-table.jsp"%>
	</div>

	<div class="float-right">
		<a href="bop-application?tempId=null" class="btn btn-primary">Application</a>

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

	$('#wardSelector').on("change", function() {
		searcherData();
	});

	$('#streetSelector').on("change", function() {
		searcherData();
	});

	$('#assessmentNoInput').on("keypress", function(e) {
		if (e.keyCode == 13) {
			searcherData();
			return false; // prevent the button click from happening
		}
	});
	$('#nicInput').on("keypress", function(e) {
		if (e.keyCode == 13) {
			searcherData();
			return false; // prevent the button click from happening
		}
	});
	$('#customerNameInput').on("keypress", function(e) {
		if (e.keyCode == 13) {
			searcherData();
			return false; // prevent the button click from happening
		}
	});

	function searcherData() {

		$.ajax({
			type : 'POST',
			url : 'assessment-search',
			data : $("#assessmentFormSearch").serialize(),
			success : function(result) {
				$("#assessmentSercher").html("");
				$("#assessmentSercher").html(result);
			}
		});
	}
</script>