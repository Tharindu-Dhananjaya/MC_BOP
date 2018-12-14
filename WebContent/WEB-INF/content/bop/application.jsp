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
							onclick="populateSelectedApplicationData(${data.idassessment},'${bopWrapper.bop.bopNo}');">select
						</a></td>

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

	<div>
		
	</div>

	<div id="applicationMainForm">

		<%@ include file="/WEB-INF/content/bop/application-main-form.jsp"%>
	</div>


	<div class="row">
		<div class="col-md-4">

			<form:form action="bop-form" modelAttribute="bopWrapper"
				method="POST">
				<form:hidden path="bop.bopNo" value="${bopWrapper.bop.bopNo}" />
				<div class="form-group">
					Area 1
					<form:input type="text" path="perch" cssClass="form-control"
						id="inputAddress" placeholder="Area 1" />
				</div>

				<div class="form-group">
					<div id="buildyourform"></div>
				</div>
				<input type="button" class="btn btn-sm btn-success" value="Add Ares"
					class="add" id="addAddress" />
				<br />
				<br />
					Land Mark Completed
					<form:radiobutton path="landMarkComleted" value="YES" />yes
					<form:radiobutton path="landMarkComleted" value="NO" />no
					<form:input type="text" path="landType" cssClass="form-control m-1"
					placeholder="Road,Forrest,Land,Recivations" />
				<input type="submit" class="btn btn-success"
					value="Save Aplication Data" class="add" id="addAddress" />
			</form:form>

		</div>
		<div class="col-md-8">
			<%@ include file="/WEB-INF/content/bop/application-uploader.jsp"%>
		</div>
	</div>

	<!-- <div class="float-right">
		<button type="submit" class="btn btn-success">Save
			Application Data</button>

	</div> -->
</div>
<%@ include file="/WEB-INF/content/common/footer.jsp"%>


<script>
	$(document).ready(function() {

		var readURL = function(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();

				reader.onload = function(e) {
					$('.profile-pic').attr('src', e.target.result);
				}

				reader.readAsDataURL(input.files[0]);
			}
		}

		$(".file-upload").on('change', function() {
			readURL(this);
		});

		$(".upload-button").on('click', function() {
			$(".file-upload").click();
		});
	});

	

	function populateSelectedApplicationData(id,bop) {
		$("#applicationMainForm").html("");
		$.ajax({
			url : 'customer-data',
			data : {
				"tempId" : id,
				"bopNo" : bop
			},
			success : function(result) {
				$("#applicationMainForm").html(result);
			},
			error : function() {
				alert('error');
			}
		});
	}

	
</script>

<script>
$(document).ready(function() {
    $("#addAddress").click(function() {
    		var lastField = $("#buildyourform div:last");
        var intId = (lastField && lastField.length && lastField.data("idx") + 1) || 1;
        var fieldWrapper = $("<div class=\"fieldwrapper\" id=\"field" + intId + "\"/>");
        fieldWrapper.data("idx", intId);
        
        var fName = $("<input type=\"text\" class=\"form-control\" name=\"perch\" />");
        var removeButton = $("<input type=\"button\" class=\"remove\" value=\"-\" />");
        removeButton.click(function() {
            $(this).parent().remove();
        });
        fieldWrapper.append(fName);
        fieldWrapper.append(removeButton);
        $("#buildyourform").append(fieldWrapper);
    });
    });


</script>

