<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>


<div class="container mt-1">
	<div class="row">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Assessment No</th>
					<th scope="col">Customer Name</th>
					<th scope="col">NIC</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${AssWrapper.assessments}" var="data"
					varStatus="loop">
					<tr>
						<th scope="row">${loop.index+1}</th>
						<td>${data.assessmentNo}</td>
						<td>${data.customer.cusName }</td>
						<td>${data.customer.cusNic }</td>
						<td><a
							onclick="populateSelectedApplicationData(${assessment.idassessment});">select</a></td>

					</tr>
				</c:forEach>

				<%-- <c:forEach items="${bopHasAssessment}" var="data">
					<tr>
						<th scope="row">1</th>
						<td>${data.assessment.idassessment}</td>
						<td>${data.assessment.customer.cusName }</td>
						<td>${data.assessment.customer.cusNic }</td>

					</tr>
				</c:forEach> --%>
			</tbody>
		</table>
	</div>

<div id="applicationMainForm">

		<%@ include file="/WEB-INF/content/bop/application-main-form.jsp"%>
	</div>

	<div class="row">
		<div class="col-md-4">

			<form>

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
				<button type="submit" class="btn btn-primary">Sign in</button>

				<label class="custom-control custom-radio"> <input
					id="radio1" name="radio" type="radio" class="custom-control-input">
					<span class="custom-control-indicator"></span> <span
					class="custom-control-description">Toggle this custom radio</span>
				</label> <label class="custom-control custom-radio"> <input
					id="radio2" name="radio" type="radio" class="custom-control-input">
					<span class="custom-control-indicator"></span> <span
					class="custom-control-description">Or toggle this other
						custom radio</span>
				</label>
				<div class="form-group">

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
			</form>

		</div>
		<div class="col-md-8">
			<div class="form-group">

				<input type="file" class="form-control" id="inputAddress"
					placeholder="1234 Main St">
			</div>
			<div class="form-group">

				<input type="text" class="form-control" id="inputAddress"
					placeholder="1234 Main St">
			</div>
			</table>
		</div>
	</div>

	<div class="float-right">
		<button type="submit" class="btn btn-success">Sign in</button>

	</div>
</div>
<%@ include file="/WEB-INF/content/common/footer.jsp"%>

<script>
function populateSelectedApplicationData(id) {
	$("#applicationMainForm").html("");
	$.ajax({
		url : 'application-main',
		data : {
			"tempId" : id
		},
		success : function(result) {
			$("#selectedAssessmentContent").html(result);
		}
	});
}
</script>

