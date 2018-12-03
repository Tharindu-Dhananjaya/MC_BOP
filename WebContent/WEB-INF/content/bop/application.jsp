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
							onclick="populateSelectedApplicationData(${data.idassessment});">select</a>
						</td>

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
					Area 1 <input type="text" class="form-control" id="inputAddress"
						placeholder="Area 1">
				</div>
			</form>

		</div>
		<div class="col-md-8">
			<form:form action="applicton-file-upload" method="POST"
				modelAttribute="uploadWrapper" enctype="multipart/form-data">

				<!--  <div class="form-group"> -->

				<!-- </div> -->

				<div class="form-group">

					<form:select path="needDoc.idneeddoc" cssClass="form-control"
						id="docSelector">
						<form:option value="-1">-Select Ward-</form:option>
						<form:options items="${needDocs}" itemValue="idneeddoc"
							itemLabel="docCat.doccatName" />
					</form:select>

					<img class="profile-pic" src="image.png" class="rounded-circle "
						id="pimg" width="70px" height="70px"> <i
						class="fa fa-camera upload-button"></i>
					<!-- <input type='file' class="file-upload" /> -->
					<form:input cssClass="file-upload" type="file" accept="image/*"
						path="fileData" />
					<%-- src="data:image/png;base64,${userWrapper.user.image}" --%>
					<div id="anotherFileInput"></div>
				</div>
				<!-- <a class="btn btn-success" onclick="addNewFileInput()">new Upload</a> -->
				<button type="submit" class="btn btn-success">Upload</button>
			</form:form>
		</div>
	</div>


	<%-- <div>
		<%@ include file="/WEB-INF/content/bop/application-upload-form.jsp"%>
	</div> --%>

	<div class="float-right">
		<button type="submit" class="btn btn-success">Sign in</button>

	</div>
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

	

	function populateSelectedApplicationData(id) {
		$("#applicationMainForm").html("");
		$.ajax({
			url : 'customer-data',
			data : {
				"tempId" : id
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

