<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>

<div class="container mt-1">
	<div>
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
					<c:forEach items="${bop.bopHasAssessment}" var="bopHasAss" varStatus="loop">
						<tr>
							<%-- <th scope="row">${loop.index+1}</th> --%>
							<td>${bopHasAss.assessment.assessmentNo}</td>
							<td>${bopHasAss.assessment.customer.cusName}</td>
							<td>${bopHasAss.assessment.customer.cusNic}</td>
							<td>${bopHasAss.assessment.customer.cusMobile}</td>
							<td><a
								onclick="populateSelectedAssessmentData(${bopHasAss.assessment.idassessment});">select</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
	<div id="basicViewCustomerData" class="row">

		<%@ include file="/WEB-INF/content/bop/customer-basic-view.jsp"%>
	</div>
</div>

<%@ include file="/WEB-INF/content/common/footer.jsp"%>


<script>
function populateSelectedAssessmentData(id) {
	$("#basicViewCustomerData").html("");
	$.ajax({
		url : 'customer-data-for-view',
		data : {
			"tempId" : id
		},
		success : function(result) {
			$("#basicViewCustomerData").html(result);
		},
		error : function() {
			alert('error');
		}
	});
}
</script>